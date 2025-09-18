# ler um valor n
num = int(input("Digite um número: "))
# imprimir todos os valores inteiros até o número lido
if num > 0:
    for i in range(1, num+1, 1):
        print(i, end= " ")
else: # se o numero for menor que zero será inválido
    print("Número inválido")