#!/bin/bash
echo "enter the number"
read num
rev=0
while [ $num -gt 0 ]
do
	remain=$(( $num % 10 ))
	rev=$(( $rev * 10 + $remain))
	num=$(( $num / 10))
done
echo "reverse of the number is" $rev

