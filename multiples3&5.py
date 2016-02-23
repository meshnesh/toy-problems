def multiples(num):
    x = 0
    for y in range(0, num):
        if (y % 3 == 0) or (y % 5 == 0):
            x += y

    print(x)


def main():
    multiples(1000)


if __name__ == '__main__': main()
