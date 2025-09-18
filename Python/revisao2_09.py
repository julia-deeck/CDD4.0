# ler 10 números e contar quantos são maiores que 50
qtd = 0
for i in range(1,11):
    num = int(input(f"Digite o {i}º número: "))
    if num > 50:
        qtd += 1
print(f"{qtd} números são maiores que 50")