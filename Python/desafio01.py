# receber dois horarios de 12h ou 24h e a saída do horário ser em formato 12h
hora1 = int(input("Digite a hora: ")) # primeiro horario
minuto1 = int(input("Digite o minuto: "))

hora2 = int(input("Digite a segunda hora: ")) # segundo horario
minuto2 = int(input("Digite a segundo minuto:  "))

# soma das horas e dos minutos
soma_horas = hora1 + hora2
soma_minutos = minuto1 + minuto2

if soma_minutos >= 60:
    soma_horas = soma_horas + 1
    soma_minutos = soma_minutos - 60

if soma_horas >= 12:
    soma_horas = soma_horas - 12

if soma_horas == 24:
    soma_horas = soma_horas - 12

if soma_minutos >= 60:
    soma_horas = soma_horas + 1
    soma_minutos = soma_minutos - 60

if soma_horas >= 25:
    soma_horas = soma_horas - 24

print(f"{soma_horas}:{soma_minutos}")