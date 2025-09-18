# ler 5 números e armazenar em um vetor
num = [""]*5
for i in range(5):
    num[i] = int(input("Digite um número: "))
# imprimir os 5 números na ordem inversa
for j in range (len(num) - 1, -1, -1):
    print(num[j], end= " ")