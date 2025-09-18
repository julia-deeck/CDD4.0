#  ler 5 valores calcular e escrever a media aritmetica desses valores lidos
soma = 0
for i in range (1, 6):
    notas = float(input("Digite a nota: "))
    print (f"Nota {i}")
    soma = soma + notas
calculo = soma / 5
print (calculo)