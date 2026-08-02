t = int(input())

for _ in range(t):
    a, b, c = map(int, input().split())
    if (a+b==c or c+a==b or b+c==a):
        print("YES")
    else:
        print("NO")