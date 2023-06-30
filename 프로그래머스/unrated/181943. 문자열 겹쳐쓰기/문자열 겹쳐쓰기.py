def solution(my_string, overwrite_string, s):
    my_list = list(my_string)
    over_list = list(overwrite_string)
    for i in range(len(over_list)):
        my_list[s] = over_list[i]
        s+=1
    answer = ''.join(my_list)
    return answer