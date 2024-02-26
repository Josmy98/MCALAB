#!/bin/bash
echo "enter the year"
read n
year=$(( $n % 4 ))
	if [ $year -eq 0 ]
	then
		echo "it is leap year"
else
echo "it is not a leap year"
fi
