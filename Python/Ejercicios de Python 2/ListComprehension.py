
#1.Encuentra todos los números del 1 al 1000 que sean divisibles por 7

for num in range(1, 1001):  
    if num % 7 == 0: 
        print("Divisible entre 7: ", num) 


#2.Encuentra todos los números del 1 al 1000 que incluyan entre sus cifras al menos un 3.

for num in range(1, 1001): 
    if '3' in str(num):  
        print("Tienen 3" ,num)

#3.Contar el número de espacios en una cadena

cadena = input("Ingresa una cadena: ") 
espacios = cadena.count(' ') 
print(f"Hay {espacios} espacios.")

#4.Crea una lista de todas las consonantes de la cadena “A los yaks amarillos les gusta gritar y bostezar y ayer cantaban mientras comían ñames asquerosos”

cadena = "A los yaks amarillos les gusta gritar y bostezar y ayer cantaban mientras comían ñames asquerosos"
vocales = "aeiouáéíóúüAEIOUÁÉÍÓÚÜ"
consonantes = [letra for letra in cadena if letra.isalpha() and letra not in vocales]

print(consonantes)

#5.Obtén el índice y el valor como una tupla para los elementos de la lista “hi”, 4, 8.99, 'apple', ('t,b','n'). El resultado se vería así (índice, valor), (índice, valor)

lista = ["hi", 4, 8.99, "apple", ("t,b", "n")]

resultado = list(enumerate(lista))

print(resultado)

#6.Encuentra los números comunes en dos listas (sin usar una tupla o conjunto) lista_a = 1, 2, 3, 4, lista_b = 2, 3, 4, 5
lista_a = [1, 2, 3, 4]
lista_b = [2, 3, 4, 5]

comunes = [num for num in lista_a if num in lista_b]

print(comunes)

#7.Obtén solamente los números en una oración como 'En 1984 hubo 13 casos de protesta con más de 1000 asistentes'

oracion = "En 1984 hubo 13 casos de protesta con más de 1000 asistentes"

numeros = [int(palabra) for palabra in oracion.split() if palabra.isdigit()]

print(numeros)

#8.Dado numbers = range(20), se genera una lista que contiene la palabra "par" si un número en los números es par, y la palabra "impar" si el número es impar.
#  El resultado se vería así: "impar", "impar", "par".

numbers = range(20)

par_impar = ["par" if num % 2 == 0 else "impar" for num in numbers]

print(par_impar)

#9.Generar una lista de tuplas que consten únicamente de los números coincidentes en estas listas list_a = 1, 2, 3,4,5,6,7,8,9, list_b = 2, 7, 1, 12. 
# El resultado se vería así (4,4), (12,12)

list_a = [1, 2, 3, 4, 5, 6, 7, 8, 9]
list_b = [2, 7, 1, 12]

coincidentes = [(num, num) for num in list_a if num in list_b]

print(coincidentes)

#10.Encuentra todas las palabras en una cadena que tengan menos de 4 letras

cadena = input("Ingresa una cadena: ")

palabras_cortas = [palabra for palabra in cadena.split() if len(palabra) < 4]

print(palabras_cortas)

#11.Utiliza una comprensión de lista anidada para encontrar todos los números del 1 al 1000 que sean divisibles por cualquier dígito excepto 1 (2-9)
numeros_divisibles = [num for num in range(1, 1001) if any(num % d == 0 for d in range(2, 10))]

print(numeros_divisibles)
