# ler 10 valores e escrever quantos desses valores lidos estão no intervalo
intervalo = 0
fora_intervalo = 0
for i in range (1, 11):
    num = int(input("Digite um número: "))
    print(f"Passo atual {i}")
    if num >= 10 and num <= 20:
        intervalo = intervalo + 1
    else:
        fora_intervalo = fora_intervalo + 1

print(f"A quantidade de números fora do intervalo é {fora_intervalo}")
print (f"A quantidade de números dentro do intervalo é {intervalo}")