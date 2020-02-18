employ_list = [
        [1,2,3,4,5,6],
        ["ram","mohan","alpha"],
        5,
        [23,25,26,36,43,52]
        ]

print(employ_list)
del employ_list[2]
print(employ_list)

employ_list.insert(3,5)
print(employ_list)

employ_list[1][2].insert('shiv')
print(employ_list)