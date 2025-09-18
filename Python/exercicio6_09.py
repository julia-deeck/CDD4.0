# ler um valor N qualquer que será o tamanho dos vetores
N = int(input("Digite o valor do tamanho do vetor: "))
A = [""]*N
B = [""]*N
soma = [""]*N # armazenar em um terceiro vetor a soma de A e B
# somar A e B respectivamente com seus índices nos vetores
for i in range(N):
    A[i] = int(input("Digite um valor para A: "))
    B[i] = int(input("Digite um valor para B: "))
    soma[i] = A[i] + B[i]
# printar as somas de A e B
for j in range(N):
    print(soma[j], end=" ")