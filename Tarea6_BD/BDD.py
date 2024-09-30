import nodo
import ABB

fh = open('bdAlgoritmos.csv') #T(n)=1

next(fh)#T(n)=1
base_datos = list()#T(n)=1

for line in fh:#T(n)=3n
	line = line.rstrip()
	item = line.split(",")
	base_datos.append(item)


bdd = ABB.ABB() #T(n)=1
for i in base_datos: #T(n)=2n
	nuevo_nodo = nodo.nodo(int(i[0]),i[1], i[2], i[3], i[4], i[5], i[6], i[7], i[8], i[9], i[10], i[11], i[12])
	bdd.insert(nuevo_nodo)


"""
	T(n)=1+1+1+3n+1+2n
	T(n)=5n+4
	T(n)=5n

	O(n)
"""