# ler 10 valores e escrever quantos desses valores lidos são negativos
negativo = 0

for i in range (1, 11):
    num = int(input("Digite um número: "))
    print (f"Passo atual {i}")
    if num < 0:
        negativo = negativo + 1

print(f"A quantidade de números negativos é {negativo}")