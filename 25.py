n = int(input())
arr = list(map(int, input().split()))

odd = []
even = []

for i in range(n):
    if arr[i]%2 == 0:
        even.append(i+1)
    else:
        odd.append(i+1)

if len(odd) == 1:
    print(odd[0])
else:
    print(even[0])


        
    