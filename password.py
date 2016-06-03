def main():

    print('Hello there? ')
    print('Login')

    print('Username? ')
    userName = input()

    print('Input password')
    password = input()

    if password == 'django':
        print('Access granted')

    else:
        print('Wrong password Biach')

    if userName == 'django':
        print('Access granted')
    
    elif userName != 'django':
        print('Wrong username')


if __name__ == '__main__': main()