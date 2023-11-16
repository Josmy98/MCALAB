sent=raw_input("enter a sentence:")
pos=0
neg=0
strn=sent.split()
poslist = ['good','excellent','extraordinary','better','vibrant']
neglist = ['bad','cruel','arrogant','rude','impatient']
for string in strn:
	if string in poslist:
		pos += 1
	elif string in neglist:
		neg += 1
print("positive",pos)
print("negative",neg)
if pos>neg:
	print("this sentence is positive")
else:
	print("this sentence is negtive")
