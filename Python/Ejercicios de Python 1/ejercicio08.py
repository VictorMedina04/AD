# Funcion para calcular batalla
def batalla(razas_bondadosas, razas_malvadas):
    bondadosos = {"Pelosos": 1, "Sureños buenos": 2, "Enanos": 3, "Númenóreanos": 4, "Elfos": 5}
    malvados = {"Sureños malos": 2, "Orcos": 2, "Goblins": 2, "Huargos": 3, "Trolls": 5}

    puntaje_bien = sum(bondadosos[raza] * cantidad for raza, cantidad in razas_bondadosas.items())
    puntaje_mal = sum(malvados[raza] * cantidad for raza, cantidad in razas_malvadas.items())

    if puntaje_bien > puntaje_mal:
        return "Gana el bien"
    elif puntaje_bien < puntaje_mal:
        return "Gana el mal"
    else:
        return "Empate"

# Ejemplo de uso
print(batalla({"Pelosos": 120,"Sureños buenos":24, "Elfos": 40,"Enanos":50}, {"Orcos": 20, "Trolls": 5, "Goblins": 50, "Huargos": 18, "Sureños malos": 150}))
