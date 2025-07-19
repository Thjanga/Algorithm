def factorial(N):
    if N==1 or N==0:
        return 1
    else:
        return N*factorial(N-1)

number = int(input(""))

number = str(factorial(number))

count = 0

for i in reversed(number):
    if i=='0':
        count+=1
    else:
        break

print(count)