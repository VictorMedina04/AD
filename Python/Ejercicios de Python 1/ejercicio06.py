# Funcion para encontrar elementos comunes o no comunes
def comparar_arrays(array1, array2, comun):
    resultado = []
    for elem in array1:
        if (elem in array2) == comun:
            resultado.append(elem)
    for elem in array2:
        if (elem in array1) == comun and elem not in resultado:
            resultado.append(elem)
    return resultado

print("Elementos comunes:" , comparar_arrays([1, 2, 3], [3, 4, 5], True))
print("Elementos no comunes:" ,comparar_arrays([1, 2, 3], [3, 4, 5], False))
