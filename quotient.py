# number1 = int(input("Enter first number: "))
# number2 = int(input("Enter second number: "))
#
#
# q = number1 // number2
# r = number1 % number2
#
# print("Integer Quotient:", q, "\nInteger Remainder:", r)




# Write a Python program that prompts the user to enter a four-digit
# integer and then calculates the sum of its digits.



# number = int(input("Enter a four-digit integer: "))
# digit1 = number // 1000
#
# r = number % 1000
#
# digit2 = r // 100
#
# r = r % 100
#
# digit3 = r // 10
#
# digit4 = r % 10
#
# total = digit1 + digit2 + digit3 + digit4
#
# print(total)




number = int(input("Enter a three-digit integer: "))
digit3 = number % 10
r = number // 10
digit2 = r % 10
digit1 = r // 10
#This is the rightmost digit
#This is the digit in the middle #This is the leftmost digit
reversed_number = digit3 * 100 + digit2 * 10 + digit1
print(reversed_number)




