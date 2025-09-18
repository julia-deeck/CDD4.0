# receber um número e imprimir na tela se o número é par ou ímpar, positivo ou negativo
num = int(input("Digite um número: "))

if num > 0:
    if num % 2 == 0:
        print(f"O número {num} é positivo e par")
    else:
        print(f"O número {num} é positivo e ímpar")
else:
    if num % 2 == 0:
        print(f"O número {num} é negativo e par")
    else:
        print(f"O número {num} é negativo e ímpar")