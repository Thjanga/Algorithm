T = int(input())

def factorial(n):
    if n==0 or n==1:
        return 1
    else:
        return n*factorial(n-1)
    
def combination(r,n):
    return factorial(n)/(factorial(r)*factorial(n-r))
    

for i in range(T):
    N,M = map(int,input().split())
    print(int(combination(N,M)))
