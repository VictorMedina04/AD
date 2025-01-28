# Función para caracteres que esten en dos cadenas

def caracteres_unicos(cadena1, cadena2):
    unicos1 = ''.join([c for c in cadena1 if c not in cadena2])
    unicos2 = ''.join([c for c in cadena2 if c not in cadena1])
    return unicos1, unicos2

out1, out2 = caracteres_unicos("hola", "mundo")
print(out1) 
print(out2)
