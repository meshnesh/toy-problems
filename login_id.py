# Write a Python program that prompts the user to enter his or her last name
# and then creates a login ID from the first four letters of the name (in lowercase)
# and a three-digit random integer



# import random
#
#
# last_name = input("Enter last name: ")
#
# #Get random integer between 100 and 999
# random_int = random.randrange(100, 1000)
#
#
# print(last_name[:4].lower() + str(random_int))


# number = int(input("Enter an integer: "))
#
# #Convert the number to string
# number_string = str(number)
#
# #Reverse the string
# reversed_string = number_string[::-1]
#
# #Convert the reversed string to integer
# reversed_number = int(reversed_string)
#
# print(reversed_number)


# or



number = int(input("Enter an integer: "))
reversed_number = int(str(number)[::-1])
print(reversed_number)