# receber dois numeros do usuario e mostre eles em ordem crescente

num1 = int(input("Digite o primeiro número: "))
num2 = int(input("Digite o segundo número: "))

if num1 > num2:
    print(num2, num1)
else:
    print(num1, num2)