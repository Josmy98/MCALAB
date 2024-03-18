#!/bin/bash
echo "Student Marklist"
#echo "Enter the student name:"
#read name
#echo "Enter register number:"
#read rno
echo "Enter the mark1:"
read m1
echo "Enter the mark2:"
read m2
echo "Enter the mark3:"
read m3
total=$(expr $m1 + $m2 + $m3)
average=$(($total/3))
echo "Student Marklist"
#echo "Student Name: $name"
#echo "Register Number: $rno"
echo "Mark1: $m1"
echo "Mark2: $m2"
echo "Mark3: $m3"
echo "Total:$total"
echo "average:$average"
if [ $m1 -ge 35 ] && [ $m2 -ge 35 ] && [ $m3 -ge 35 ]
then 
echo "Result:Pass"
if [ $average -ge 90 ]
then
echo "Grade:S"
elif [ $average -ge 80 ]
then
echo "Grade:A"
elif [ $average -ge 70 ]
then
echo "Grade:B"
elif [ $average -ge 60 ]
then
echo "Grade:C"
elif [ $average -ge 50 ]
then
echo "Grade:D"
elif [ $average -ge 35 ]
then
echo "Grade:E"
fi
else
echo "Result:Fail"
fi
