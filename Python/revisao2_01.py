# receber 5 nomes e imprimir apenas os nomes que começam com a letra A
nomes = []
for i in range(5):
    nome = input("Digite um nome: ")
    nomes.append(nome)
for nome in nomes:
    if nome[0] == "A" or nome[0] == "a":
        print(nome)