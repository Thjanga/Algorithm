N = int(input()) # 단어의 개수

count = 0

for i in range(N):
    words = input()
    # 앞에 나온 문자가 이어져서 나오지 않고 뒤에 나오면 그룹문자가 아님
    group = True

    for j in range(len(words)-1):
        if words[j] != words[j+1]:
            if words[j] in words[j+2:]:
                group = False
                break
    if len(words)==1:
        group == True
        
    if group == True:
        count += 1

print(count)