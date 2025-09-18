# array de tamanho 5 e preencher com os nomes dos 5 alunos informados pelo usuário
nomes = [""]*5
for i in range(len(nomes)):
    nomes[i]=input("Digite um nome: ")
print(nomes)