# ler a senha de um usuário e após 3 tentativas erradas sair do programa, informando senha bloqueada
pin = 123456
tentativas = 1
mensagem = "Senha bloqueada. Saindo do programa..."

while tentativas <= 3:
    senha = int(input("Digite a senha: "))
    if senha == pin:
        mensagem = "Bem-vindo"
        break
    tentativas += 1
print(mensagem)