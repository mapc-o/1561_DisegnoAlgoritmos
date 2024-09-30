import nodo
import ABB
import BDD


def menu(): #T(n)=1
	print("""\n\n\n-------ALUMNOS FES ARAGON-------
\n1. BUSCAR ALUMNO
\n2. REGISTRAR ALUMNO
\n3. SALIR""")



def main():
	while True:
		menu()
		try: #T(n)=1
			k = int(input("\nElija una acción: "))

		except ValueError:
			print("~ ~ ~Acción inválida")
			continue

		if k ==1:
			while True:
				try:
					acc = int(input("\nIngrese el NÚMERO DE CUENTA del alumno a buscar: "))
					if 99999999 < acc< 1000000000:
						BDD.bdd.imprimir(BDD.bdd.get(acc)) #T(n)=n
						break
					else:
						print("~ ~ ~Dato inválido")

				except ValueError:
					print("~ ~ ~Dato inválido")

		elif k == 2:
			nuevo_nodo = []
			req = ['NÚMERO DE CUENTA', 'APELLIDO PATERNO', 'APELLIDO MATERNO','NOMBRE/s','EDAD','CORREO','SEMESTRE QUE CURSA','MATERIA 1', 'MATERIA 2', 'MATERIA 3', 'MATERIA 4', 'MATERIA 5', 'PROMEDIO']
			for i in req: #T(n)=n
				while(True):
					dato = input(f"\nIngrese {i}: ")

					if i == 'NÚMERO DE CUENTA': #T(n)=1
						try: 
							dato = int(dato) 
							if 99999999 < dato< 1000000000:
								nuevo_nodo.append(dato)
								break

							else:
								print("~ ~ ~Número de cuenta inválido")	
						
						except ValueError:
							print("~ ~ ~Número de cuenta inválido")


					elif i == 'APELLIDO PATERNO' or i == 'APELLIDO MATERNO' or i == 'NOMBRE/s': #T(n)=3
						if 2 < len(dato) < 40:
							nuevo_nodo.append(dato)
							break
						else:
							print("~ ~ ~Dato inválido")



					elif i == 'EDAD': #T(n)=1
						try: 
							dato = int(dato) 
							if 1 < dato <110:
								nuevo_nodo.append(dato)
								break
							else:
								print("~ ~ ~Edad inválida")
						
						except ValueError:
							print("~ ~ ~Edad inválida")

					elif i == 'CORREO': #T(n)=1
						if '@aragon.unam.mx' in dato:
							nuevo_nodo.append(dato)
							break
						else:
							print("~ ~ ~Correo erróneo")



					elif i == 'SEMESTRE QUE CURSA': #T(n)=1
						try: 
							dato = int(dato) 
							if 0< dato <10:
								nuevo_nodo.append(dato)
								break

							else:
								print("~ ~ ~Semestre inválido")
						
						except ValueError:
							print("~ ~ ~Semestre inválido")



					elif i == 'MATERIA 1' or i == 'MATERIA 2' or i == 'MATERIA 3' or i == 'MATERIA 4' or i == 'MATERIA 5': #T(n)=5

						if 5 < len(dato) < 40:
							nuevo_nodo.append(dato)
							break
						else:
							print("~ ~ ~Dato inválido")
						


					elif i =='PROMEDIO': #T(n)=1
						try: 
							dato = float(dato) 
							if 0 < dato< 10.1:
								nuevo_nodo.append(dato)
								break
							else:
								print("~ ~ ~Promedio inválido")
						
						except ValueError:
							print("~ ~ ~Promedio inválido")

			#T(n) = logn
			BDD.bdd.insert(nodo.nodo(nuevo_nodo[0],nuevo_nodo[1],nuevo_nodo[2],nuevo_nodo[3],nuevo_nodo[4],nuevo_nodo[5],nuevo_nodo[6],nuevo_nodo[7],nuevo_nodo[8],nuevo_nodo[9],nuevo_nodo[10],nuevo_nodo[11],nuevo_nodo[12]))
			print("-------ALUMNO REGISTRADO!-------")
			BDD.bdd.imprimir(BDD.bdd.get(nuevo_nodo[0])) #T(n)=n

		elif k == 3: #T(n)=1
			print("Saliendo...")
			break

		else:
			print("~ ~ ~Acción inválida") #T(n)=1

main()


"""
	T(n)=1+(1+n+n+1+3+1+1+1+5+1+logn+n+1+1)
	T(n)=3n+logn+17
	T(n)=3n

	O(n)
"""