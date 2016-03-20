def multiples(num):
    x = 0
    for y in range(0, num):
        if (y % 3 == 0) or (y % 5 == 0):
            x += y

    print(x)


def main():

#     print('What is you number? ')
#
#     multiples = input()
#
# print('The sum of the multiples is, ' +)
#     #
 multiples(10)


if __name__ == '__main__': main()
