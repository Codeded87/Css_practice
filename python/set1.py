#Given an unsorted array of nonnegative integers, find a continuous subarray which adds to a given number.


print("Enter the size of the array")
n = int(input())
sub_array = (1,2);


print("Enter the unsorted array")
for x in len(sub_array):
    sub_array[x] = input()

print("Enter the starting index of the array to find the sum")
starting_index = input()
print("Enter the ending index of the array")
ending_index = input()


sum = 0
for y in range(starting_index,ending_index):
    sum = sum + sub_array[x]
print(sum)
