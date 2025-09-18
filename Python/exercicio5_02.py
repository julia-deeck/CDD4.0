# receba o numero de alunos de uma sala de aula
num_alunos = int(input("Quantos alunos têm na sala?: "))
i = 1
soma = 0
while i <= num_alunos:
    nota = float(input("Digite a nota: "))
    soma += num_alunos
    i += 1

media = soma/num_alunos
print("A média aritmética da sala é: ", media)