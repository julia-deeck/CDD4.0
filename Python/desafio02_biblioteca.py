class ListaDeTarefas():
    def __init__(self):
        self.tarefas = []

    def listarTarefas(self):
        return self.tarefas

    def inserirTarefa(self,tarefa):
        self.tarefas.append(tarefa)

    def deletarTarefa(self,tarefa):
        if tarefa in self.tarefas:
            self.tarefas.remove(tarefa)
            print(f"Tarefa '{tarefa}' removida com sucesso.")
        else:
            print(f"Tarefa '{tarefa}' não encontrada")