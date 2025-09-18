# ler uma frase e contar quantas letras "a" ela possui
frase = input("Digite uma frase: ").lower()
qtd = 0
for i in frase:
    if i == "a":
        qtd += 1
print(f"Tem {qtd} letras A")