# usuario digitar a senha e quando acertar liberar o acesso
senha = "1234"
digita_senha = ""
while digita_senha != senha:
    digita_senha = input("Digite a senha: ")
    if digita_senha == "1234":
        print("Acesso liberado")
        break
    else:
        print("Senha incorreta")