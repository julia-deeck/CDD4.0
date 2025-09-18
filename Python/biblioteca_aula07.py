def imprimirNome(nome):
    print(f"Olá {nome}")

def printNum(n):
    for x in range(1,n+1,1):
        for y in range(0,x):
            print(x, end=" ")
        print()

def vogaisQuant(frase):
    contador = 0
    for i in range(len(frase)):
        if frase[i] ==  "a" or frase[i] == "e" or frase[i] == "i" or frase[i] == "o" or frase[i] == "u":
            contador += 1
    print(f"Existem {contador} vogais nessa frase")

def valorEstoque(produto, quantidade, valor):
    valorTotal = quantidade * valor
    return produto, valorTotal

def numInteiro(numero):
    if numero > 0:
        return "P"
    elif numero < 0:
        return "N"
    else:
        return "Z"

def somaNumeros(num1,num2):
    soma = num1+num2
    print(soma)

def somar(*num):
    soma = 0
    for i in range(len(num)):
        soma += num[i]
    print(soma)

def letrasSomaContrario(texto):
    contador = 0
    for i in range(len(texto)-1, -1, -1):
        print(texto[i], end="")
        if texto[i] not in " ":
            contador += 1
    print(f"\nHá {contador} letras")

def listaRepeticao(lista):
    nova_lista = []
    for i in lista:
        if i not in nova_lista:
            nova_lista.append(i)
    print(lista)
    print(nova_lista)