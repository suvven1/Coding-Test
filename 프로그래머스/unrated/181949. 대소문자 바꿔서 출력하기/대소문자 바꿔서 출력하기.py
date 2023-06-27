str = input()
ans=""
for t in str:
    if t.isupper():     
        ans += t.lower()
    else:
        ans += t.upper()
        
print(ans)