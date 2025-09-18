# ler 5 nomes de usuário e suas respectivas senhas em arrays diferentes
usuario = [""]*5
senha = [""]*5
for i in range(5):
    usuario[i] = input("Digite o nome do usuário: ")
    senha[i] = int(input("Digite a senha do usuário: "))
# imprimir nome, senha e posição dos dados no array
for j in range(5):
    print(f"Indíce (posição no array): {j}, Usuário: {usuario[j]} | Senha: {senha[j]}")