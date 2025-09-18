# ler 10 valores, calcular e escrever a média aritmética dos valores lidos
soma = 0
i = 1
while i <= 10:
    num = int(input("Digite um valor: "))
    soma += num
    i += 1

media = soma/10
print ("A média aritmética é:", media)