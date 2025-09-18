# ler 10 valores do tipo inteiro e armazenar em um vetor
valores = [""]*10
contador = 0
soma = 0
for i in range(len(valores)):
    valores[i] = int(input("Digite um valor inteiro: "))
maior = valores[0]
menor = valores[0]

# informar todos os numeros pares no vetor
print("Valores pares:", end=" ")
for j in range(len(valores)):
    if valores[j] % 2 == 0:
        print(valores[j], end=" ")

# o menor e o maior valor existente no vetor
for x in range (len(valores)):
    if valores[x] > maior:
        maior = valores[x]
print(f"\nMaior valor: {maior}")

for x in range (len(valores)):
    if valores[x] < menor:
        menor = valores[x]
print(f"Menor valor: {menor}")

# calcular a média dos valores
for l in range(len(valores)):
    soma += valores[l]

media = soma/(len(valores))
print(f"Média: {media}")

# quantos dos valores dos vetores são maiores que a média desses valores
for n in range(len(valores)):
    if valores[n] > media:
        contador += 1

print(f"Valores maior que a média: {contador}")