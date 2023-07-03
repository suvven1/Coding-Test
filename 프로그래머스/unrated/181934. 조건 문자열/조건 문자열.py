def solution(ineq, eq, n, m):
    if eq == '=':
        if ineq == '>' and n >= m:
            answer = 1
        elif ineq == '<' and n <= m:
            answer = 1
        else:
            answer = 0
    else:
        if ineq == '>' and n>m:
            answer = 1
        elif ineq =='<' and n<m:
            answer = 1
        else:
            answer = 0
    return answer