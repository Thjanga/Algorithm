from collections import deque

N,M,V = map(int,input().split())

graph = []

for i in range(N+1):
    graph.append([])


for i in range(M):
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in range(1, N + 1):
    graph[i].sort()
    
def dfs(vertex,visited):
    visited[vertex] = True
    print(vertex,end=' ')
    for i in graph[vertex]:
        if not visited[i]:
            dfs(i,visited)

def bfs(vertex, visited):
    queue = deque([vertex])
    visited[vertex] = True

    while queue:
        v = queue.popleft()
        print(v, end=' ')
        for i in graph[v]:
            if not visited[i]:
                visited[i] = True
                queue.append(i)

visited = [False] * (N + 1)
dfs(V, visited)
print()
visited = [False] * (N + 1)
bfs(V, visited)