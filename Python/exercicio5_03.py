# ler 2 valores e realizar a divisão do primeiro pelo segundo valor recebido
num1 = int(input("Digite o primeiro número: "))
num2 = int(input("Digite o segundo número: "))
while num2 == 0:
    num2 = int(input("0 é um número inválido. Digite o segundo número: "))
divs = num1/num2
print(f"O resultado da divisão é {divs}")