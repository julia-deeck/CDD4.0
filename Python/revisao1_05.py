# calcular o IMC de uma pessoa
peso = float(input("Digite seu peso: "))
altura = float(input("Digite sua altura: "))
imc = peso / altura**2

if imc < 18.6:
    print("Abaixo do peso")
elif imc >= 18.6 and imc <= 24.9:
    print("Peso ideal (parabéns)")
elif imc >= 25 and imc <= 29.9:
    print("Levemente acima do peso")
elif imc >= 30 and imc <= 34.9:
    print("Obesidade grau I")
elif imc >= 35 and imc <= 39.9:
    print("Obesidade grau II (severa)")
else:
    print("Obesidade grau III (mórbida)")