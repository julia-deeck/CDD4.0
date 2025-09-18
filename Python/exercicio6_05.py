# preencher um vetor A com 5 números e multipllicar cada elemento de A pelo valor de X
A=[5,6,7,8,9]
X = int(input("Digite um número: "))
M=[""]*5
for i in range(5):
   M[i] = X * A[i]
print(M)