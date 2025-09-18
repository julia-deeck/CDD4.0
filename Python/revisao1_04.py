# ler o valor do salário mínimo e o valor do salário de um usuário
salario_min = float(input("Digite o valor do salário mínimo atual: "))
salario = float(input("Digite o valor do seu salário: "))
# calcular quantos salários mínimos o usuário ganha
calculo_salario = salario / salario_min
print(f"Você ganha {calculo_salario} salário(os) mínimo(s)")