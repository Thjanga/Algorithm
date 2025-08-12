T = int(input())

for i in range(T):
    string = input()
    stack = []

    for c in string:
        if c=='(':
            stack.append(1)
        else:
            if not stack:
                print("NO")
                break
            stack.pop()
    else:
        if len(stack) == 0:
            print("YES")
        else:
            print("NO")
