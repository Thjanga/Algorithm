T = int(input())

for j in range(T):
    count = 0
    x1,y1,x2,y2 = map(int,input().split()) # 출발점과 도착점
    n = int(input()) # 행성계의 개수

    for i in range(n):
        cx,cy,r = map(int,input().split())

        start = (cx-x1)**2 + (cy-y1)**2 <= r**2
        end = (cx-x2)**2 + (cy-y2)**2 <= r**2

        if start != end:
            count += 1
    print(count)


