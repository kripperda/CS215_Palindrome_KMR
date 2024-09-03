# CS125_Palindrome_KMR
Kory Ripperda
CS215 Module 2
Assignment 2.2 - Palindrome

1.	A palindrome is a word, phrase, or sequence that reads the same backward as forward. A stack will be useful in this exercise, because the code could push and pop characters in order to get the correct order and test if it is a palindrome. Stacks have a last-in-first-out structure.
The length of the string will need to be determined. Since the palindrome is the same forward and backward, a midpoint would need to be established as well to determine how the order will be pushed and popped appropriately. That is if a string is odd. Until the end of the string, keep popping elements from the stack and compare them with the current character in the string. A Boolean will be necessary to test the validity of the palindrome. If there is a mismatch, then the string is not a palindrome. If all of the elements match then the string is a palindrome.
I do not envision that java will show where the stack breaks down, but will evaluate the stack in the string and spit out the output. 

Example 1:
Racecar
You would put in “racecar” into the stack in that order. The stack would return the characters in reverse order: “r” “a” “c” “e” “c” “a” “r”.
The program would output that the phrase IS a palindrome.

Example 2:
1234567
You would put in “1234567” into the stack in that order.
The stack would return the characters in reverse order: “7” “6” “5” “4” “3” “2” “1”/
The program would output that the phrase IS NOT a palindrome.

2.	What is the basic operation in your code?
a.	The basic operation is to scan the input string by popping and pushing the characters along the stack to determine the order. The code then reverses the orders of the string to do the exact same thing. Ultimately the code determines is the input is the same forward and backward and provides the output determined by the stack scan.

3.	What input determines how many time the basic operation takes place ?
a.	The input from the scanner determines the number of times the operation takes place. The for loop determines how many characters are in the inputString and allows the stack to push the characters at the length of the string. In this case “i” is the integer that determines the number of characters.

4.	Express the number of times the basic operation occurs in terms of n. What does n represent?
a.	In this code n = i from the for loop that determines the number of characters in the string. “i” = the number of characters in the string to be tested. 
5.	What is the computational complexity of the code in terms of Big O? Explain why.
a.	The computational complexity is O(n) as the stack is linear. The characters are placed in a line as opposed to a group which would involve exponents. 
6.	Explain how a stack data structure differs from a bag data structure. Explain how you used the stack in your code to solve the palindrome problem.
a.	A stack is a linear data structure. Elements can only be inserted and deleted from one side of the list – at the top. A stack follows the last-in-first-out-principle. The order is important. A bag is an array of elements where the order of insertion is irrelevant. Elements can be inserted and removed at random. 
b.	The stack in the code is important because the code is testing the order that the characters are in to determine if they are the same forward and backward.
Link to GitHub: https://github.com/kripperda/CS215_Palindrome_KMR.git


