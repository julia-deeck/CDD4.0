# receber 5 números e calcular a média aritmética
soma = 0
for i in range(1,6):
    num = float(input(f"Digite a {i}º nota: "))
    soma += num
media = soma/5
print(f"A média aritmética é {media}")

if media > 7:
    print("Aluno aprovado")
elif media >= 4 and media <= 7:
    print("Aluno em recuperação")
elif media < 4:
    print("Aluno reprovado")
else:
    print("Número inválido")