#t1 = ()
#
#t2 = ()
#
#t3 = ([2 * x for x in range(1,100)])
#
#print(t3)

tuple1 = ("green", "red", "blue")
tuple2 = tuple([11,66,44,33,22,90,3])
print(tuple2)
print(tuple1)


print("length of tuple2", len(tuple2))
print("length of tuple", len(tuple1))


print(" the max of tuple 2 ", max(tuple2))
print("the sum of the tuple 2", sum(tuple2))
print("the min value of the tuple2",min(tuple2))


#accesing tuple useing index operator

#print("the first element is ",tuple2[4])

#combining two or more tuple

tuple3 = tuple1 + tuple2
#print(tuple3)

#duplicate the tuple

DuplicateTuple = 2 * tuple3
#print(DuplicateTuple)

#slice operator 
#print(tuple3[2:4])

# in operator
print(2 in tuple2) 
#loop 
for v in tuple2:
    print(v, end = '')

#obtain a list from a tuple

list1 = list(tuple2)
sortedlist = list1.sort()  # sort function will not return new list

print(list1)
















