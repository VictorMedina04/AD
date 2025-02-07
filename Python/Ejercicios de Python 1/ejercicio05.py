# Función para la carrera
def evaluar_carrera(acciones, pista):
    pista_modificada = list(pista)  
    correcta = True 

    for i in range(len(pista)):
        if pista[i] == "_" and acciones[i] != "run":
            pista_modificada[i] = "x" 
            correcta = False
        elif pista[i] == "|" and acciones[i] != "jump":
            pista_modificada[i] = "/"  
            correcta = False

    print(''.join(pista_modificada))  
    return correcta

acciones = ["run", "jump", "run", "jump","jump", "run", "jump","run", "jump", "run", "jump","jump", "run", "jump"]
pista = "_|_|||___|__|_"

print(evaluar_carrera(acciones, pista))
