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
                predict.append([grammar[i][0], last.get(grammar[i][0])])
            elif grammar[i][j] not in first:
                predict.append([grammar[i][0], {grammar[i][j]}])
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
                predict.append([grammar[i][0],temp_set])
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


print(firsts(read()[0]))
print(lasts(read()[0]))
print(prediction(read()[0]))
