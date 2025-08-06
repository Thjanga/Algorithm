import math

min, max = map(int,input().split())
size = max - min + 1
number = [True] * size

for i in range(2,int(math.sqrt(max)+1)):
    square = i*i
    # min보다 큰 제곱수
    start = ((min + square - 1) // square) * square
    # 제곱수 제거
    for j in range(start,max+1,square):
        number[j-min] = False

print(sum(number))
