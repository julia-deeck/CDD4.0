# receber um número de 1 a 12
mes_num = int(input("Digite o número do mês: "))

# de acordo com o número digitado, irá aparecer o nome do mês
if mes_num >= 1 and mes_num <=12 : # os números só seram aceitos entre 1 e 12
    if mes_num == 1:
        print("Janeiro")
    elif mes_num == 2:
        print("Fevereiro")
    elif mes_num == 3:
        print("Março")
    elif mes_num == 4:
        print("Abril")
    elif mes_num == 5:
        print("Maio")
    elif mes_num == 6:
        print("Junho")
    elif mes_num == 7:
        print("Julho")
    elif mes_num == 8:
        print("Agosto")
    elif mes_num == 9:
        print("Setembro")
    elif mes_num == 10:
        print("Outubro")
    elif mes_num == 11:
        print("Novembro")
    elif mes_num == 12:
        print("Dezembro")
else:
    print("Número inválido") # o restante será inválido