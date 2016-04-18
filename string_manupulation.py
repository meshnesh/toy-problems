# Write a Python program that prompts the user to enter any string with four
# letters and then displays its contents backwards.
# For example, if the string entered is “Zeus”,
# the program should display “sueZ”.



# s = input("Enter a word with four letters: ")
# s_rev = s[3] + s[2] + s[1] + s[0]
# print(s_rev)



# or


# s = input("Enter a word with four letters: ")
# a, b, c, d = s
# s_rev = d + c + b + a
# print(s_rev)



# or

s = input("Enter a word with four letters: ")
s_rev = str[::-1]
print(s_rev)
