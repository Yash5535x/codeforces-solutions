r = int(input())

h = [100,20,10,5,1]
count = 0
for i in h:
    count += r // i
    r %= i

print(count)

