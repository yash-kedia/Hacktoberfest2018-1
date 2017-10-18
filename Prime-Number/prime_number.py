import math

num = int(input("insira um numero maior que 1: "))
t = True
for i in range(2,int(math.sqrt(num))+1):
    if num % i == 0:
        t = False
        break
if not t :
    print("O número "+ str(num) + " não é primo!!")
else:
    print("O número "+ str(num) + " é primo!!")


