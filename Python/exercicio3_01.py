# ler o nome de uma pessoa, a sua idade e o seu salário e mostrar as informações na tela
nome = input("Qual seu nome?: ")
idade = int(input("Qual sua idade?: "))
salario = float(input("Qual seu salário?: "))

# o usuário digita o seu aumento percentual
aumento = float(input("Digite o percentual de aumento de salário: "))
percentual_salario = (salario * aumento)/100 # calculo do percentual
salario_final = salario + percentual_salario # soma do salario com o percentual

print(f'Seu nome: {nome}\nSua idade: {idade}\nSeu salário: {salario}')
print(f'O percentual de aumento em reais foi de R${percentual_salario}'
      f'\nO salário final é de R${salario_final}')