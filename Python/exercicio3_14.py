# receber um numero do usuario e mostrar todos os numeros impares do intervalo de 1 ate o digitado
num = int(input("Digite um número: "))

for x in range(1, num+1):
    if x %2 != 0:
        print(x)