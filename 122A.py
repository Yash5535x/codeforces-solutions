n = int(input())

l = [4,7,47,74,447,474,477,744,747,774,777]

for i in range(len(l)):
    if(n%l[i]==0):
        print("YES")
        break
else:
    print("NO")
       
