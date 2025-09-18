# receber 5 notas
notasAluno = [""]*5
soma = 0
contador = 0
for i in range(5):
    notasAluno[i] = float(input("Digite a nota: "))
# calcular média da turma
for j in range(5):
    soma += notasAluno[j]
media = soma/5
# imprimir quantos alunos tiveram nota acima desta média calculada
for x in range(5):
    if notasAluno[x] > media:
        contador += 1
print(f"{contador} notas são maiores que a média {media}")