diccionario={
    'A':'._', 'B':'_...', 'C':'_._.', 'D':'_..', 'E':'.', 'F':'.._.', 'G':'__.',
    'H':'....', 'I':'..', 'J':'.___', 'K':'_._', 'L':'._..', 'M':'__', 'N':'_.',
    'O':'___', 'P':'.__.', 'Q':'__._', 'R':'._.', 'S':'...', 'T':'_', 'U':'.._',
    'V':'..._', 'W':'.__', 'X':'_.._', 'Y':'_.__', 'Z':'__..','0':'-----','1':'.----',
    '2':'..---','3':'...--','4':'....-','5':'.....','6':'-....','7':'--...','8':'---..','9':'----.'
}

def texto_a_morse(texto):
    texto = texto.upper()
    codigo_morse = []
    for char in texto:
        if char in diccionario:
            codigo_morse.append(diccionario[char])
        else:
            codigo_morse.append('')
    return ' '.join(codigo_morse)

def morse_a_texto(morse):
    morse_code = morse.split(' ')
    reverse_diccionario = {v: k for k, v in diccionario.items()}
    texto = []
    
    for code in morse_code:
        if code == '/':  
            texto.append(' ')
        elif code in reverse_diccionario:
            texto.append(reverse_diccionario[code])
        else:
            texto.append('?')
    return ''.join(texto)

def transformador(texto):
    if all(c in ".- /" for c in texto):
        return morse_a_texto(texto)
    else:
        return texto_a_morse(texto)

if __name__ == "__main__":
    input_text = input("Introduce texto o código morse: ")
    print("Resultado de conversión:", transformador(input_text))
cadena = input("Introduce una cadena de texto: ")
