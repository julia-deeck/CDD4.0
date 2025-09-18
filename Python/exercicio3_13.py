# receber um numero inteiro e mostrar a tabuada de multiplicação desse numero
num = int(input("Digite um número: "))
for x in range(1, 11):
    tabuada = num * x
    print(f"{num} x {x} = {tabuada}")