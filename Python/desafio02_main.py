from desafio02_biblioteca import *
# criar um programa que gere uma lista de tarefas
minha_lista = ListaDeTarefas()
while True:
    print("\nMENU"
          "\n1 - Listar Tarefas"
          "\n2 - Inserir Uma Tarefa"
          "\n3 - Deletar Uma Tarefa"
          "\n4 - SAIR")

    opcao = input("Digite uma opção: ")

    if opcao == "1":
        tarefas_listar = minha_lista.listarTarefas()
        if tarefas_listar:
            print("\nTAREFAS")
            for i, tarefa in enumerate(tarefas_listar, start = 1):
                print(f"{i}. {tarefa}")
        else:
            print("Nenhuma tarefa encontrada")
    elif opcao == "2":
        tarefa = input("Digite a tarefa para adicionar:\n")
        minha_lista.inserirTarefa(tarefa)
        print("Tarefa adicionada!")
    elif opcao == "3":
        tarefa = input("Digite a tarefa para deletar:\n")
        minha_lista.deletarTarefa(tarefa)
    elif opcao == "4":
        print("Saindo do programa...")
        break
    else:
        print("Opção inválida. Tente novamente.")