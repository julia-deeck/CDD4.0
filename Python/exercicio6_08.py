# ler 5 nomes de usuário e suas respectivas senhas em arrays diferentes
usuario = [""]*5
senha = [""]*5
for i in range(5):
    usuario[i] = input("Digite seu login: ")
    senha[i] = int(input("Digite a senha: "))
    print(f"Bem-vindo {usuario[i]}! Login Efetuado com Sucesso.") # imprimir username e mensagem