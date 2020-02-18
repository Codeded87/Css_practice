import numpy 
A  = np.matrix("3,1,2;3,2,5;6,7,8")
print(A)
b = np.matrix("2,-1,3").transpose()
print(b)


solve = numpy.linalg.solve(A,b)
print(solve)
