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


def lasts():
    print("fds")


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


firsts(read()[0])
