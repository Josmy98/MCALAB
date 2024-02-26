#!/bin/bash
echo "enter the number"
read a
for((i=2;i<=$a/2;i++))
do
	num=$((a%i))
	if [ $num -eq 0 ]
	then
		echo "$a is not a prime number"
		exit 0
	fi
done
echo "$a is a prime number"
