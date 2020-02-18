# -*- coding: utf-8 -*-
"""
Created on Sat Jan 25 13:45:34 2020

@author: john
"""



import random 
import time
NUMBER_OF_ELEMENTS = 1000
 
#create a list

lst = list(range(NUMBER_OF_ELEMENTS))
#print(lst)
random.shuffle(lst)
#print(lst)


#create a set from the list

s = set(lst)

#Test if element is in the set

startTime = time.time()   # get time start
for i in range(NUMBER_OF_ELEMENTS):
    i in s
endTime = time.time() # get that time end

runTime = int((endTime - startTime) * 1000)

print(" to test if",NUMBER_OF_ELEMENTS,
      "elements are in the sets\n","the runTime is ",runTime,"milliseconds0")