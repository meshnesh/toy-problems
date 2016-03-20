def main():

    print('Hello there? ')
    print('Login')

    print('What is your user name? ')
    userName = input()

    print('Input password')
    password = input()

    if userName == 'Mary':
        print('Hello')

    if password == 'django':
        print('Access granted')

    else:
        print('Wrong password')


if __name__ == '__main__': main()