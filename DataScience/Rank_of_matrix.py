import numpy 

x = np.matrix("4,5,16,7;2,-3,2,3;3,4,5,6;4,7,8,9")
print(x)
rank_of_matrix=numpy.linalg.matrix_rank(x)
print(rank_of_matrix)