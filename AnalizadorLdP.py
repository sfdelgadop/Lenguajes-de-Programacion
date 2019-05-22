f = open("0.txt", "r")
p = []
for x in f:
    p.append(x)

f.close()

Tokens = []

set_keys = {'TRUE', 'FALSE', 'SI', 'NO', 'and', 'archivo', 'caso', 'const', 'constantes', 'desde', 'eval', 'fin','hasta',
            'inicio', 'lib', 'libext', 'matriz', 'mientras', 'not', 'or', 'paso', 'subrutina', 'programa', 'ref','registro',
            'repetir', 'retorna', 'si', 'sino', 'tipos', 'var', 'variables', 'vector', 'numerico', 'sin',
            'cos', 'sqrt', 'strlen', 'logico', 'cadena'}
set_chars = {' ': 'blank', '.': 'dot', ',': 'comma', ':': 'colon', '=': 'assig', '(': 'opar', ')': 'cpar',
             '[': 'obracket', ']': 'cbracket', '{': 'okey', '}': 'ckey', '?': 'oquotation', '?': 'cquotation',
             '+': 'sum', '-': 'subt', '/': 'div', '*': 'mult', '^': 'exp', '\t': 'tab', '\n': 'lbreak', '<': 'less',
             '>': 'bigger', '%': 'module', ';': 'semicolon'}

bc = False
proc_numf = False
proc_notC = False

def analizar(cadena):
    arrC = []
    i = 0
    global bc
    global proc_numf
    global proc_notC
    while i < len(cadena):
        if cadena[i] != " ":

            # Comentarios de bloque INICIO DEL BLOQUE
            if cadena[i] == "/" and i + 1 < len(cadena) and cadena[i + 1] == "*":
                bc = True
                break

            # Comentarios de bloque FIN DEL BLOQUE
            if cadena[i] == "*" and i + 1 < len(cadena) and cadena[i + 1] == "/":
                bc = False
                break

            # Comentarios de bloque CONTENIDO DENTRO DEL BLOQUE
            if bc:
                break

            if cadena[i] == "/" and i + 1 < len(cadena) and cadena[i + 1] == "/":
                arrC.append("\n")
                break

            if 47 < ord(cadena[i]) < 58:  # Conversion a ASCII para rango entre 0...9

                if proc_numf:
                    arrC.append("f")  # Procesamiento de un numero decimal
                    if i + 1 < len(cadena) and (cadena[i + 1] == "e" or cadena[i + 1] == "E"):
                        proc_notC = True
                    if (i + 1 < len(cadena)) and (
                            cadena[i + 1] in set_chars or not (47 < ord(cadena[i + 1]) < 58) or cadena[i + 1] == "e" or
                            cadena[
                                i + 1] == "E"):  # Para de procesar si el caracter siguente est? en set_chars o no es un numero de 0...9
                        proc_numf = False
                    elif i + 1 >= len(cadena):  # Para de procesar si la linea se acabo
                        proc_numf = False
                else:
                    arrC.append("n")
                    if (i + 1 < len(cadena)) and (cadena[i + 1] in set_chars):
                        if 47 < ord(cadena[i]) < 58 and set_chars[cadena[i + 1]] == 'dot' and 47 < ord(
                                cadena[i + 2]) < 58:
                            proc_numf = True
                    if i + 1 < len(cadena) and (cadena[i + 1] == "e" or cadena[i + 1] == "E"):
                        proc_notC = True

            elif cadena[i] == '"':  # Busca cadenas de texto
                if cadena[i+1] != "\n":
                    h = i
                    i += 1
                    while cadena[i] != '"':
                        if cadena[i] == "\n":
                            arrC.append('B')
                            break
                        i += 1
                    arrC.append(cadena[h:i+1])
                else:
                    arrC.append('B')

            elif cadena[i] == "'":  # Busca cadenas de texto 2.0
                if cadena[i+1] != "\n":
                    h = i
                    i += 1
                    while cadena[i] != "'":
                        if cadena[i] == "\n":
                            arrC.append('B')
                            break
                        i += 1
                    arrC.append(cadena[h:i+1])
                else:
                    arrC.append('B')


            elif cadena[i] in set_chars:
                if set_chars[cadena[i]] == 'subt' and 47 < ord(cadena[i + 1]) < 58:
                    arrC.append("m")
                elif set_chars[cadena[i]] == 'dot' and proc_numf == True:
                    arrC.append("d")
                else:
                    arrC.append(cadena[i])

            elif (ord(cadena[i]) > 64 and ord(cadena[i]) < 91 or ord(cadena[i]) > 96 and ord(cadena[i]) < 123 or cadena[
                i] == "_" or cadena[i] == "?" or cadena[i] == "?"):  # Conversi?n a ASCII para rango entre A...Z o a...z
                if ((cadena[i] == "e" or cadena[i] == "E") and proc_notC == True):
                    arrC.append("e")
                    proc_notC = False
                else:
                    arrC.append("c")
            else:
                arrC.append("B")

        else:
            arrC.append(" ")

        i += 1

    return arrC


cadenaIntermedia = []
for i in range(len(p)):
#    print(analizar(p[i]))
    cadenaIntermedia.append(analizar(p[i]))


def idPR(cadena, n):
    i = n
    while (i < len(cadena)):

        if (cadena[i] == "c" or cadena[i] == "n"):
            i += 1
        else:
            break
    return i


def num(cadena, n):
    i = n
    while i < len(cadena):

        if cadena[i] == "n" or cadena[i] == "f" or cadena[i] == "d" or cadena[i] == "e" or cadena[i] == "m":
            i += 1
        else:
            break
    return i


E = False


def errors(i, j, dif):
    global E
    print(">>> Error lexico(linea:" + str(i + 1) + ",posicion:" + str(j + 1 + dif) + ")")
    E = True


vars = set()
j = 0
dif = 0

for i in range(len(cadenaIntermedia)):
    while j < len(cadenaIntermedia[i]):

        if len(cadenaIntermedia[i][j]) > 1:

            Tokens.append(["<", "tk_string", repr(cadenaIntermedia[i][j]), str(i + 1), str(
                j + 1 + dif), ">"])  # Imprime la cadena con \t y \n https://docs.python.org/3/library/functions.html#repr
            dif = dif + len(str(cadenaIntermedia[i][j])) - 1

        elif cadenaIntermedia[i][j] == "c":
            t = idPR(cadenaIntermedia[i], j) + dif
            if len(p[i][j + dif:t]) <= 32:

                if p[i][j + dif:t] == "TRUE" or p[i][j + dif:t] == "FALSE" or p[i][j + dif:t] == "SI" or p[i][j + dif:t] == "NO":
                    Tokens.append(["<", "tk_logico",str(p[i][j + dif:t]), str(i + 1), str(j + 1 + dif), ">"])

                elif p[i][j + dif:t] in set_keys:
                    Tokens.append(["<", str(p[i][j + dif:t]), str(i + 1), str(j + 1 + dif), ">"])
                else:
                    Tokens.append(["<", "id" , str(p[i][j + dif:t]) , str(i + 1) , str(j + 1 + dif) , ">"])
                    vars.add(p[i][j + dif:t])
                j = t - 1 - dif
            else:
                errors(i, j, dif)
                break

        elif cadenaIntermedia[i][j] == "n" or cadenaIntermedia[i][j] == "m":
            t = num(cadenaIntermedia[i], j) + dif
            Tokens.append(["<", "tk_num" , str(p[i][j + dif:t]) , str(i + 1) , str(j + 1 + dif) , ">"])
            j = t - 1  # Modifique a t-1 para que leyera tokens entre numeros

        elif cadenaIntermedia[i][j] == "B":
            errors(i, j, dif)
            break

        elif cadenaIntermedia[i][j] != " ":
            if cadenaIntermedia[i][j] == "<":
                if j + 1 < len(cadenaIntermedia[i]) and cadenaIntermedia[i][j + 1] == ">":
                    Tokens.append(["<", "tk_difference" , str(i + 1), str(j + 1 + dif) , ">"])
                    j = j + 1
                elif j + 1 < len(cadenaIntermedia[i]) and cadenaIntermedia[i][j + 1] == "=":
                    Tokens.append(["<", "tk_lesOrEqual" , str(i + 1), str(j + 1 + dif) , ">"])
                    j = j + 1
                else:
                    Tokens.append(["<", "tk_" + str(set_chars[cadenaIntermedia[i][j]]) , str(i + 1) , str(
                        j + 1 + dif), ">"])

            elif cadenaIntermedia[i][j] == ">":
                if j + 1 < len(cadenaIntermedia[i]) and cadenaIntermedia[i][j + 1] == "=":
                    Tokens.append(["<", "tk_gtrOrEqual", str(i + 1), str(j + 1 + dif), ">"])
                    j = j + 1
                else:
                    Tokens.append(["<", "tk_" + str(set_chars[cadenaIntermedia[i][j]]) , str(i + 1) , str(
                        j + 1 + dif), ">"])
            elif cadenaIntermedia[i][j] == "=":
                if j + 1 < len(cadenaIntermedia[i]) and cadenaIntermedia[i][j + 1] == "=":
                    Tokens.append(["<", "tk_equal", str(i + 1), str(j + 1 + dif), ">"])
                    j = j + 1
                else:
                    Tokens.append(["<", "tk_" + str(set_chars[cadenaIntermedia[i][j]]) , str(i + 1) , str(
                        j + 1 + dif), ">"])
            elif cadenaIntermedia[i][j] == ".":
                if j + 1 < len(cadenaIntermedia[i]) and cadenaIntermedia[i][j + 1] == ".":
                    if j + 2 < len(cadenaIntermedia[i]) and cadenaIntermedia[i][j + 2] == ".":
                        Tokens.append(["<", "tk_3dot", str(i + 1), str(j + 1 + dif), ">"])
                        j = j + 2
                    else:
                        Tokens.append(["<", "tk_" + str(set_chars[cadenaIntermedia[i][j]]), str(i + 1), str(
                            j + 1 + dif), ">"])
                else:
                    Tokens.append(["<", "tk_" + str(set_chars[cadenaIntermedia[i][j]]) , str(i + 1) , str(
                        j + 1 + dif), ">"])
            else:
                Tokens.append(["<", "tk_" + str(set_chars[cadenaIntermedia[i][j]]) , str(i + 1) , str(
                    j + 1 + dif), ">"])  # Imprimiendo tokens usando el diccionario y sus valores de set_chars
        j += 1

    if E:
        break
    j = 0
    dif = 0

while True:
    well = True
    for i in range(len(Tokens)):
        if Tokens[i][1]== "tk_lbreak":
            Tokens.pop(i)
            well = False
            break
    if well:
        break
for i in range(len(Tokens)):
    print(Tokens[i])
#print(vars)

######################################################################################################
#aqui empieza lo sintactico
def firsts(grammar):
    firsts_sets = {}
    for i in range(len(grammar)):
        firsts_sets.setdefault(grammar[i][0], set())
    flag = True
    while flag:
        flag = False
        for i in range(len(grammar)):
            for j in range(1, len(grammar[i])):
                if grammar[i][j] in firsts_sets:
                    if grammar[i][j] != grammar[i][0]:
                        if j < len(grammar[i])-1:
                            temp = firsts_sets.pop(grammar[i][0])
                            temp2 = firsts_sets.get(grammar[i][j]).copy()
                            if "0" in temp2:
                                temp2.remove("0")
                            temp3 = temp.union(temp2)
                            if temp != temp3:
                                flag = True
                            firsts_sets.setdefault(grammar[i][0], temp3)
                        else:
                            temp = firsts_sets.pop(grammar[i][0])
                            temp2 = firsts_sets.get(grammar[i][j]).union(temp)
                            if temp != temp2:
                                flag = True
                            firsts_sets.setdefault(grammar[i][0], temp2)

                    if "0" not in firsts_sets.get(grammar[i][j]):
                        break
                else:
                    temp = firsts_sets.pop(grammar[i][0])
                    temp2 = temp.union({grammar[i][j]})
                    if temp != temp2:
                        flag = True
                    firsts_sets.setdefault(grammar[i][0], temp2)
                    break
    return firsts_sets


def lasts(grammar):
    lasts_sets = {}
    firsts_sets = firsts(grammar)
    for i in range(len(grammar)):
        lasts_sets.setdefault(grammar[i][0], set())
    temp = lasts_sets.pop(grammar[0][0])
    temp2 = temp.union({"$"})
    lasts_sets.setdefault(grammar[0][0], temp2)
    flag = True
    while flag:
        flag = False
        for i in range(len(grammar)):
            for j in range(1, len(grammar[i])):
                if grammar[i][j] in lasts_sets:
                    if j < len(grammar[i])-1:
                        flag2 = False
                        for k in range(j+1, len(grammar[i])):
                            flag2 = False
                            if grammar[i][k] in lasts_sets:
                                temp = lasts_sets.pop(grammar[i][j])
                                temp2 = firsts_sets.get(grammar[i][k]).copy()
                                if "0" in temp2:
                                    temp2.remove("0")
                                else:
                                    flag2 = True
                                temp3 = temp.union(temp2)
                                if temp != temp3:
                                    flag = True
                                lasts_sets.setdefault(grammar[i][j], temp3)
                                if flag2:
                                    break
                            else:
                                temp = lasts_sets.pop(grammar[i][j])
                                temp2 = temp.union({grammar[i][k]})
                                if temp != temp2:
                                    flag = True
                                lasts_sets.setdefault(grammar[i][j], temp2)
                                flag2 = True
                                break
                        if not flag2:
                            if grammar[i][0] != grammar[i][j]:
                                temp = lasts_sets.pop(grammar[i][j])
                                temp2 = lasts_sets.get(grammar[i][0]).copy()
                                temp3 = temp.union(temp2)
                                lasts_sets.setdefault(grammar[i][j], temp3)
                                if temp != temp3:
                                    flag = True
                    else:
                        if grammar[i][0] != grammar[i][j]:
                            temp = lasts_sets.pop(grammar[i][j])
                            temp2 = lasts_sets.get(grammar[i][0]).copy()
                            temp3 = temp.union(temp2)
                            lasts_sets.setdefault(grammar[i][j], temp3)
                            if temp != temp3:
                                flag = True
    return lasts_sets


def prediction(grammar):
    first = firsts(grammar)
    last = lasts(grammar)
    predict = []
    for i in range(len(grammar)):
        for j in range(1,len(grammar[i])):
            if grammar[i][j] == "0":
                predict.append([grammar[i], last.get(grammar[i][0])])
            elif grammar[i][j] not in first:
                predict.append([grammar[i], {grammar[i][j]}])
            else:
                flag = True
                temp_set = set()
                for k in range(j, len(grammar[i])):
                    if grammar[i][k] in first:
                        temp = first.get(grammar[i][k]).copy()
                        if "0" in temp:
                            temp.remove("0")
                            temp_set.update(temp)
                        else:
                            temp_set.update(temp)
                            flag = False
                            break
                    else:
                        temp_set.update({grammar[i][k]})
                        flag = False
                        break
                if flag:
                    temp_set.update(last.get(grammar[i][0]))
                predict.append([grammar[i],temp_set])
            break
    return predict


def read():
    f = open("Gramatica.txt", "r")
    grammars = []
    pre_grammar = []
    for x in f:
        if x != "\n":
            intern = x.split("\n")
            intern = intern[0].split(" ")
            pre_grammar.append(intern)
        else:
            grammars.append(pre_grammar)
            pre_grammar = []

    grammars.append(pre_grammar)
    f.close()
    return grammars


def emparejar(tok):
    global token
    global Tokens
    global Cut
    if token[1] == tok:
        print(tok)
        token = Tokens.pop(0)
    elif tok != "0":
        print(str(token[len(token)-3]) + " " + str(token[len(token)-2]) + " Error sintactico, se Encontró " + str(tok) +" y se esperaba " + token[1])
        Cut = True


def function(S):
    print("    "+str(S))
    flag = False
    global Cut
    global predict
    global first
    global token
    for i in range(len(predict)):
        if predict[i][0][0] == S and token[1] in predict[i][1]:
            flag = True
            rule = predict[i][0]
            for j in range(1, len(rule)):

                if Cut:
                    break

                if rule[j] in first:
                    function(rule[j])
                else:
                    emparejar(rule[j])

                if Cut:
                    break
            break
    if not flag:
        if "0" not in first.get(S):
            print(str(token[len(token)-3]) + " " + str(token[len(token)-2]) + " Error sintactico, se Encontró " + str(token[1]) + " y se esperaban " + str(first.get(S)))
            Cut = True


print(firsts(read()[0]))
print(lasts(read()[0]))
print(prediction(read()[0]))
Cut = False
first = firsts(read()[0])
predict = prediction(read()[0])

symbol = predict[0][0][0]
setTemp = predict[0][1]
for i in range(1,len(predict)):
    if predict[i][0][0] == symbol:
        if not setTemp.isdisjoint(predict[i][1]):
            print("ambiguedad en el símbolo" + str(symbol))
    else:
        symbol = predict[i][0][0]
        setTemp = predict[i][1]


#Tokens = [["dasd", "a"], ["dsa","b"], ["dsa", "bas"], ["dsa", "b"], ["dasd", "$"]]
token = Tokens.pop(0)
Tokens.append(["<", "$"])
function("S")
if not Cut:
    if token[1] != "$":
        print(str(token[len(token)-3]) + " " + str(token[len(token)-2]) + " Error sintactico, se Encontró " + str(token[1]) + " y se esperaba fin de cadena")
    else:
        print("El analisis sintactico ha finalizado exitosamente.")

