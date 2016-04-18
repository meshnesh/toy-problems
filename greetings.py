def main():
    # print('Hello There')
    # print("What is your name?")

    myName = input()

    print('It is good to meet you, ' + myName)
    print('The length of your name is:')
    print(len(myName))

    print('What is your age?')
    myAge = input()

    print('You will be ' + str(int(myAge) + 1) + ' in a year')


    # print('choose a number')
    #  spam = input()
    # print(spam)


if __name__ == '__main__': main()
