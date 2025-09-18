# receber o nome de 2 times e o número de gols marcados na partida (cada time)
time1 = input("Nome do primeiro time: ")
gol_time1 = int(input("Quantidade de gols do primeiro time: "))
time2 = input("Nome do segundo time: ")
gol_time2 = int(input("Quantidade de gols do segundo time: "))

if gol_time1 > gol_time2:
    print(f"Vencedor da partida: {time1}")
elif gol_time2 > gol_time1:
    print(f"Vencedor da partida: {time2}")
else:
    print("EMPATE")