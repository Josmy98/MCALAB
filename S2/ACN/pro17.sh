#!/bin/bash
read -p "Enter the number:" n
read -p "Enter the digit:" d
num=$n
occ=0
while [ $num != 0 ]
do
  digit=$(($num % 10))
  if [ $digit -eq $d ]; then
     occ=$(($occ + 1))
  fi
  num=$((num/10))
done
echo "No of occurence of the digit is =$occ"

