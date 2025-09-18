class Atleta():
    def __init__(self,peso):
        self.aposentado=False
        self.peso=peso
        self.correndo=False
        self.nadando=False
        self.pedalando=False

    def atletaAposentado(self):
        resp = input("O atleta é aposentado? Responda 'sim' ou 'não'\n")
        if resp.lower() == "sim":
            self.aposentado=True
            print("Atleta aposentado")

    def aquecerAtleta(self):
        if self.aposentado == True:
            print("O atleta está aposentado e não pode se aquecer.")
        else:
            print("O atleta está se aquecendo.")

class Corredor(Atleta):
    def __init__(self,peso):
        super().__init__(peso)

    def correr(self):
        if self.aposentado == True:
            print("O atleta está aposentado. Ele não pode correr.")
        elif self.nadando == True:
            print("O atleta está nadando, não pode correr agora.")
        elif self.pedalando == True:
            print("O atleta está pedalando, não pode correr agora.")
        else:
            self.correndo = True
            print("O atleta está correndo.")

class Nadador(Atleta):
    def __init__(self,peso):
        super().__init__(peso)
    def nadar(self):
        if self.correndo == True:
            print("O atleta está correndo, não pode nadar agora.")
        elif self.pedalando == True:
            print("O atleta está pedalando, não pode nadar agora.")
        else:
            self.nadando = True
            print("O atleta está nadando.")

class Ciclista(Atleta):
    def __init__(self,peso):
        super().__init__(peso)
    def pedalar(self):
        if self.correndo == True:
            print("O atleta está correndo, não pode pedalar agora.")
        elif self.pedalando == True:
            print("O atleta está pedalando, não pode pedalar agora.")
        else:
            self.pedalando = True
            print("O atleta está pedalando.")

class Triatleta(Corredor,Nadador,Ciclista):
    def __init__(self,peso):
        super().__init__(peso)