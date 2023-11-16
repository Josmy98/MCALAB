a=input("enter a value 1:")
b=input("enter a value 2:")
c=input("enter a value 3:")
if(a>=b):
	largest=a
elif(b>=a) and (b>=c):
	largest=b
else:
	largest=c
print("largest of number",largest)
