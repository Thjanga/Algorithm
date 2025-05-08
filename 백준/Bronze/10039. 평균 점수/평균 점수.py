a = []

for i in range(5):
    num = int(input())
    if(num<40):
        num=40
    a.append(num)

average = sum(a)//5

print(average)

