matrix = []
for i in range(5):
    row = list(map(int, input().split()))
    matrix.append(row)

# find position of 1
for i in range(5):
    for j in range(5):
        if matrix[i][j] == 1:
            row, col = i+1, j+1   # 1-based indexing
            break

# calculate moves
moves = abs(row - 3) + abs(col - 3)
print(moves)
