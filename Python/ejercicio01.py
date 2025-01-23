diccionario={
    'A':'._', 'B':'_...', 'C':'_._.', 'D':'_..', 'E':'.', 'F':'.._.', 'G':'__.',
    'H':'....', 'I':'..', 'J':'.___', 'K':'_._', 'L':'._..', 'M':'__', 'N':'_.',
    'O':'___', 'P':'.__.', 'Q':'__._', 'R':'._.', 'S':'...', 'T':'_', 'U':'.._',
    'V':'..._', 'W':'.__', 'X':'_.._', 'Y':'_.__', 'Z':'__..','0':'-----','1':'.----',
    '2':'..---','3':'...--','4':'....-','5':'.....','6':'-....','7':'--...','8':'---..','9':'----.'
}

def transformacion(cadena):
    diccionario2 = []
    for caracter in cadena:
        if caracter.islower():
            caracter = caracter.upper()
        diccionario2.append(diccionario[caracter])
    print(" ".join(diccionario2))

cadena = input("Introduce una cadena de texto: ")

transformacion(cadena)