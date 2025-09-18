# ler 10 números e guardar em um vetor
num = [""]*10
contador = 0
for i in range(len(num)):
    num[i] = int(input("Digite um número: "))
# ler mais um número qualquer, calcular e imprimir quantas vezes o número aparece no vetor
outro_num = int(input("Digite outro número para calcular quantas vezes aparece: "))
for j in range(len(num)):
    if num[j] == outro_num:
        contador += 1

print(f"O número {outro_num} aparece {contador} vezes no vetor")