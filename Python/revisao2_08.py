# mostrar a tabuada de um número inserido pelo usuário
num = int(input("Digite um número inteiro: "))
for i in range(1,11):
    tabuada = num * i
    print(f"{num} x {i} = {tabuada}")