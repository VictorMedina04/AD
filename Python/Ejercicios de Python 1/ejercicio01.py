# Diccionario con el alfabeto morse
codigo_morse = {
    'A': '.-', 'B': '-...', 'C': '-.-.', 'D': '-..', 'E': '.', 'F': '..-.', 'G': '--.',
    'H': '....', 'I': '..', 'J': '.---', 'K': '-.-', 'L': '.-..',
    'M': '--', 'N': '-.', 'O': '---', 'P': '.--.', 'Q': '--.-', 'R': '.-.',
    'S': '...', 'T': '-', 'U': '..-', 'V': '...-', 'W': '.--', 'X': '-..-',
    'Y': '-.--', 'Z': '--..', '1': '.----', '2': '..---', '3': '...--', 
    '4': '....-', '5': '.....', '6': '-....', '7': '--...', '8': '---..', 
    '9': '----.', '0': '-----', ' ': ' ', '.': '.-.-.-', ',': '--..--'
}

def texto_a_morse(texto):
    resultado = []
    for letra in texto.upper():  
        resultado.append(codigo_morse.get(letra, ''))  
    return ' '.join(resultado)  

def morse_a_texto(morse):
    morse_a_letra = {valor: clave for clave, valor in codigo_morse.items()}
    resultado = []
    for codigo in morse.split(' '):
        resultado.append(morse_a_letra.get(codigo, ''))  
    return ''.join(resultado)  


def convertir_texto(texto):
    if all(c in '.- ' for c in texto): 
        return morse_a_texto(texto)
    else: 
        return texto_a_morse(texto)

print(convertir_texto("hola mundo"))
print(convertir_texto(".... --- .-.. .-  -- ..- -. -.. ---")) 
