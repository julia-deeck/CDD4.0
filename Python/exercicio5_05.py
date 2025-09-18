# ler as notas da 1a. e 2a. avaliações de um aluno
resposta = "s"
while resposta == "s":
    nota1 = float(input("Digite a primeira nota: "))
    while nota1 < 0 or nota1 > 10: # só será aceito valores entre 0 e 10
        nota1 = float(input("Valor fora da faixa. Digite a primeira nota: "))

    nota2 = float(input("Digite a segunda nota: "))
    while nota2 < 0 or nota2 > 10: # só será aceito valores entre 0 e 10
        nota2 = float(input("Valor fora da faixa. Digite a segunda nota: "))

    media = (nota1 + nota2)/2 # calcule e imprima a média desse aluno
    print (f"A média é {media}")
    resposta = input("Deseja realizar um novo cálculo?: ")