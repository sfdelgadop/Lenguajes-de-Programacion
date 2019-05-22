f = open("0.txt", "r")
p = []
for x in f:
    p.append(x)

f.close()

Tokens = []

set_keys = {'and', 'archivo', 'caso', 'const', 'constantes', 'desde', 'eval', 'fin', 'hasta', 'inicio', 'lib', 'libext',
            'matriz', 'mientras', 'not', 'or', 'paso', 'subrutina', 'programa', 'ref', 'registro', 'repetir', 'retorna',
            'si', 'sino', 'tipos', 'var', 'variables', 'vector', 'imprimir', 'leer', 'numerico', 'sin', 'cos', 'sqrt',
            'strlen', 'logico', 'cadena'}
set_chars = {' ': 'blank', '.': 'dot', ',': 'comma', ':': 'colon', '=': 'assig', '(': 'opar', ')': 'cpar',
             '[': 'obracket', ']': 'cbracket', '{': 'okey', '}': 'ckey', '?': 'oquotation', '?': 'cquotation',
             '+': 'sum', '-': 'subt', '/': 'div', '*': 'mult', '^': 'exp', '\t': 'tab', '\n': 'lbreak', '<': 'less',
             '>': 'bigger', '%': 'module', ';': 'comdot'}

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
                    Tokens.append(["<", "tk_diference" , str(i + 1), str(j + 1 + dif) , ">"])
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
                    Tokens.append(["<", "tk_Equal", str(i + 1), str(j + 1 + dif), ">"])
                    j = j + 1
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
