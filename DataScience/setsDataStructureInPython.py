# -*- coding: utf-8 -*-
"""
Created on Sat Jan 25 13:14:37 2020

@author: john
"""

#Defination of sets

''' Sets are like lists in that you use them for storing a collection of element.
unlike list however the elements in a set are nonduplicate and are not placed in the particular 
order

if your application dont care about the order of the element

using sets to store data is more efficient than using due to pythons implementation'''


'''creating sets
#you can create a sets of elements by enclosing the elements inside  a pair of  curly braces{}.

# the element must be separated by commas.

# you can create a empty set and also from list,tuple'''

s1 = set() # create a empty set
s2 = {1,2,3,4}  # create a set with three integer
s3 = set([1,2,3,4]) #create aset from tuple
s4 = set([x * 2 for x in range(1, 10)])

# you can also create a set from a string . Each  character int the string becomes the element in set
s5 = set("abcd") # s5 {'a','b','c'}