# solicitar o usuário um nome para permitir achar o nome de um aluno na lista
nomes = ["João", "Carlos", "Maria", "Luiza", "Isabel"]
pesquisaNome = input("Digite um nome para pesquisa: ")
msg = f"Nome não encontrado"
for i in range(len(nomes)):
    if pesquisaNome == nomes[i]:
        msg = f"Achei o nome {pesquisaNome} na posição {i}"

print(msg)