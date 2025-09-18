# ler 10 numeros e ao final da leitura escrever a soma total dos 10 numeros lidos
soma = 0
for x in range(1, 11):
    print(f"Passo atual: {x}")
    num = int(input("Digite um número: "))
    soma = soma + num
print(soma)