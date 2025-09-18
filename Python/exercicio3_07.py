# ler o número de litros vendidos e o tipo de combustível
tipo_combustivel = input("Qual tipo de combustível? Digite G para Gasolina e E para Etanol: ")
litros = float(input("Quantos litros deseja abastecer?: R$ "))

# preços dos combustíveis
gasolina_valor = 5.80
etanol_valor = 4.90

# comparador se for gasolina ou etanol
if tipo_combustivel == "G" or tipo_combustivel == "g":
    calculo_gasolina = litros * gasolina_valor
    print(f"Você abasteceu {litros} e gastou R${calculo_gasolina}")
elif tipo_combustivel == "E" or tipo_combustivel == "e":
    calculo_etanol = litros * etanol_valor
    print(f"Você abasteceu {litros} e gastou R${calculo_etanol}")
else:
    print("Solicitação inválida")