change_num = int(input())

for i in range(change_num):
    change = int(input())
    if change <= 500:
        Q = change // 25
        D = (change%25)//10
        N = ((change%25)%10)//5
        P = change%5
        
        print(Q, D, N, P)
    else:
        print("$5 이상입니다.")
        