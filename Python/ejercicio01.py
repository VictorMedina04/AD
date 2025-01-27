diccionario={
    'A':'._', 'B':'_...', 'C':'_._.', 'D':'_..', 'E':'.', 'F':'.._.', 'G':'__.',
    'H':'....', 'I':'..', 'J':'.___', 'K':'_._', 'L':'._..', 'M':'__', 'N':'_.',
    'O':'___', 'P':'.__.', 'Q':'__._', 'R':'._.', 'S':'...', 'T':'_', 'U':'.._',
    'V':'..._', 'W':'.__', 'X':'_.._', 'Y':'_.__', 'Z':'__..','0':'-----','1':'.----',
    '2':'..---','3':'...--','4':'....-','5':'.....','6':'-....','7':'--...','8':'---..','9':'----.'
}

def text_to_morse(text):
    text = text.upper()
    morse_code = []
    for char in text:
        if char in diccionario:
            morse_code.append(diccionario[char])
        else:
            morse_code.append('')
    return ' '.join(morse_code)

def morse_to_text(morse):
    morse_code = morse.split(' ')
    reverse_diccionario = {v: k for k, v in diccionario.items()}
    text = []
    
    for code in morse_code:
        if code == '/':  
            text.append(' ')
        elif code in reverse_diccionario:
            text.append(reverse_diccionario[code])
        else:
            text.append('?')
    return ''.join(text)

def detect_and_convert(text):
    if all(c in ".- /" for c in text):
        return morse_to_text(text)
    else:
        return text_to_morse(text)

if __name__ == "__main__":
    input_text = input("Introduce texto o código morse: ")
    print("Resultado de conversión:", detect_and_convert(input_text))
cadena = input("Introduce una cadena de texto: ")
