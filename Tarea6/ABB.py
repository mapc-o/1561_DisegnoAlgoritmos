

class ABB(object):
	def __init__(self):
		self.root = None

	def vacio(self):
		return self.root == None

	def insert(self, nodo):
		if self.vacio():
			self.root = nodo

		else:
			self._insertNode(self.root,nodo)


	def _insertNode(self, actual, nodo): #O(logn)
		if nodo.value < actual.value:
			if actual.left == None:
				actual.left = nodo

			else:
				self._insertNode(actual.left, nodo)

		else:
			if actual.right == None:
				actual.right = nodo

			else:
				self._insertNode(actual.right, nodo)


	def imprimir(self,actual): #O(1)
		if actual:
			print(f"""\n\n-------ALUMNO INSCRITO-------
				\nNúmero de cuenta: {actual.value}\nAlumno: {actual.app} {actual.apm} {actual.nm}
Edad: {actual.age}\nCorreo: {actual.mail}\nSemestre que cursa: {actual.s}
Materias inscritas: {actual.a},{actual.b},{actual.c},{actual.d},{actual.e}
Promedio: {actual.grade}""")

		else:
			print("\n-------ALUMNO NO ENCONTRADO-------")



	def get(self,value): #O(n)
		return self._get(self.root,value)

	def _get(self, actual,value):
		if not actual:
			return None

		else:
			if actual.value == value:
				return actual

			elif value < actual.value:
				return self._get(actual.left,value)

			else:
				return self._get(actual.right, value)