# Función para capitalizar cada palabra
def mayusculas(texto):
    resultado = []
    palabras = texto.split() 
    for palabra in palabras:
        resultado.append(palabra[0].upper() + palabra[1:])  
    return ' '.join(resultado) 

print(mayusculas("hola mundo"))
