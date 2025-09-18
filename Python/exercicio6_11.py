# ler 5 nomes e exibir esses nomes na tela
nome = [""]*5
for i in range(len(nome)):
    nome[i] = input("Digite um nome: ")

for j in range(len(nome)):
    print(nome[j], end=" ")
print()
for x in range (len(nome) - 1, -1, -1): # exibir os nomes em ordem inversa um por linha
    print(nome[x])