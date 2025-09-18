# ler 2 números e efetuar as 4 operações matemáticas e mostrar o resultado

num1 = float(input("Digite o primeiro número: "))
num2 = float(input("Digite o segundo número: "))

soma = num1 + num2
subtr = num1 - num2
multi = num1 * num2
divis = num1 / num2

print(f"Soma: {num1} + {num2} = {soma}\nSubtração: {num1} - {num2} = {subtr}\n"
    f"Multiplicação: {num1} x {num2} = {multi}\nDivisão: {num1} / {num2} = {divis}")