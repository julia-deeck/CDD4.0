# simulador de jogo de advinhação utilizando o random
from random import randint
num_secreto = randint(0,100)
tentativa = 0
while tentativa != num_secreto:
    tentativa = int(input("Tente advinhar um número de 1 a 100: "))
    if tentativa > num_secreto:
        print("Menos!")
    elif tentativa < num_secreto:
        print("Mais!")
    else:
        print(f"Você acertou! O número é {num_secreto}")