#!/bin/bash
echo "Hello World!"
name="John"
echo "My name is $name"
read -p "Enter your age:" age
echo "your are $age years old."
if [ $age -ge 18 ]
then
	echo "you are an adult."
else
	echo "you are a minor"
fi
