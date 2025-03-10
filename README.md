# find-unique-character
code sample demonstrating how to find the first unique character in a string of characters

## Approach

My approach is to first make a copy of the string into a character array and sort it.

Using the original order of characters to drive this,  do the following until a unique character is found starting with
the first character.

for each character in the input string...

look for the first occurrence of the character in the sorted array.

if we are at the last character or the character in the next element is not the same as the current character then it is 
unique.

## Building the code and running the test
mvn clean test

