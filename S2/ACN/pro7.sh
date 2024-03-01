#!/bin/bash
reverse_string() {
	input_string=$1
	reversed_string=$(echo $input_string | rev)
	echo "Reversed string: $reversed_string"
}
is_palindrome() {
	original_string=$1
	reversed_string=$(echo $original_string | rev)
	if [ "$original_string" == "$reversed_string" ]; then
		echo "The string is palindrome."
	else
		echo "The string is not palindrome."
	fi
}
read -p "Enter a string: " input_string
reverse_string $input_string
is_palindrome $input_string

