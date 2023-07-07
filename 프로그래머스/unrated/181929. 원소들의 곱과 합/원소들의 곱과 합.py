def solution(num_list):
    num_mul = 1
    for i in range(len(num_list)):
        num_mul = num_mul*num_list[i]
        
    if num_mul < sum(num_list)**2:
        answer = 1
    else:
        answer = 0
    return answer