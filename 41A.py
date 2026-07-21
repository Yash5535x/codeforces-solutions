s = input()
t = input()

if len(s) != len(t):
    print("NO")
else:
    for i in range(len(s)):
        if s[i] != t[len(s)-1 - i]:
            print("NO")
            break
    else:
        print("YES")