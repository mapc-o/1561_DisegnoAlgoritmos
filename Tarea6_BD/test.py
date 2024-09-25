fh = open('../../5/Diseño/diseñoAlgoritmos.csv')
#wds = inp.split('\n')
#print(wds)

#print("\n",wds[1])
g = list()
for line in fh:
	line = line.rstrip()
	wds = line.split(",")
	g.append(wds)

acc = list()
for i in g:
	acc.append(i[0])


for i in acc:
	print(i)

o = int(input('ingresa un numero'))
print(g[o])




	#print(wds[12])

	
	#print(word[2])


	#Guardian
	#si la palabra es menor a un caracter de longitud, salta a la sig línea
	#if len(wds) < 1:
	#	continue


