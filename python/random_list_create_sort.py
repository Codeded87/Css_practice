import random
thislist = list()
for x in range(1,10):
    thislist.append(random.randrange(10,100))

print(thislist)
thislist.reverse() # reverse the order
print(thislist)
    
thislist.sort() #sort the integer ascending order
print(thislist)
thislist.reverse() # reverse the sorted list
print(thislist)


#print(count(thislist))


thislist.clear()
thislist2 = thislist.copy()
