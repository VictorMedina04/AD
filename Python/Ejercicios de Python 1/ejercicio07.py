# Función para calcular el ganador piedra,papel,tijeras
def ganador(jugadas):
    puntuacion = {"Player 1": 0, "Player 2": 0}

    reglas = {"PI": "TI", "TI": "PA", "PA": "PI"}  

    for p1, p2 in jugadas:
        if reglas[p1] == p2:  
            puntuacion["Player 1"] += 1
        elif reglas[p2] == p1: 
            puntuacion["Player 2"] += 1

    if puntuacion["Player 1"] > puntuacion["Player 2"]:
        return "Player 1"
    elif puntuacion["Player 1"] < puntuacion["Player 2"]:
        return "Player 2"
    else:
        return "Empate"

print(ganador([("TI", "PA"), ("PI", "TI"), ("PA", "TI")]))
