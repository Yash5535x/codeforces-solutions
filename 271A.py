year = int(input())

while True:
    year += 1

    s = str(year)

    if len(set(s)) == 4:
        print(year)
        break