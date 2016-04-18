# Write a Python program that prompts the user to enter in one single string both first
# and last name. In the end, the program should change the order of the two names.




full_name = input("Enter your full name: ")

#Find the position of space character. This is also the number
# #of characters first name contains
space_pos = full_name.find(" ")


#Get space_pos number of characters starting from position 0
name1 = full_name[:space_pos]


#Get the rest of the characters starting from position space_pos + 1
name2 = full_name[space_pos + 1:]
full_name = name2 + " " + name1
print(full_name)