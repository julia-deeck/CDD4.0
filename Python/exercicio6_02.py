# imprimir o nome de cada aluno e sua respectiva posição no array
nomes = [""]*5
for i in range(len(nomes)):
    nomes[i]=input("Digite um nome: ")

for j in range(len(nomes)):
    print(nomes[j], j)