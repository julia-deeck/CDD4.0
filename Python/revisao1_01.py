# leia os valores A, B, C
A = int(input("Digite o número A: "))
B = int(input("Digite o número B: "))
C = int(input("Digite o número C: "))
soma = A + B # somar A e B
print(f"A soma A+B é igual a {soma}")
# se a soma for menor que c, imprimir na tela
if soma < C:
    print(f"A soma entre A e B (= {soma}) é menor que C")