#convert the given number to string

from array import *

number=int(raw_input("Enter the number:"))   # accept input
i=0
a=array('i') 				     # declare array of integers

if(number==0):
	number=number+65;
	print chr(number)

else:					     #conversion to ASCII

	while(number!=0):		     
		temp=number % 26	     
		a.append(temp)               
		number=number/26
		i=i+1
	while (i!=0):
		s=a[i-1]
		if(i!=1):
			s=s-1
			s=s+65
			print chr(s)
		else:
			s=s+65
			print chr(s)
		i=i-1





