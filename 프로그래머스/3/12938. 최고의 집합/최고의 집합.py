def solution(n, s):
    answer = []
    
    if n > s:
        return [-1]  
    
    base = s // n       
    extra = s % n       
    answer = [base] * (n - extra) + [base + 1] * extra
        
    return sorted(answer)