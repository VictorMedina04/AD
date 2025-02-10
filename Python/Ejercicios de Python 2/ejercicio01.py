import csv

def leer_datos(archivo):
    alumnos = []
    with open(archivo, encoding='utf-8') as f:
        lector = csv.DictReader(f)
        for fila in lector:
            nombre, apellidos = fila['Nombre'].strip(), fila['Apellidos'].strip()
            curso = fila['Curso'].strip()
            notas = {asig: int(fila[asig]) for asig in fila if asig not in ['Nombre', 'Apellidos', 'Curso']}
            alumnos.append({"nombre": nombre, "apellidos": apellidos, "curso": curso, "notas": notas})
    return alumnos

def calcular_nota_media(notas):
    return sum(notas.values()) / len(notas)

def listar_alumnos(alumnos):
    for alumno in alumnos:
        media = calcular_nota_media(alumno['notas'])
        print(f"{alumno['nombre']} {alumno['apellidos']} - Curso: {alumno['curso']} - Nota media: {media:.2f}")

def alumnos_por_asignatura(alumnos, curso, asignatura):
    print(f"Alumnos del curso {curso} en {asignatura}:")
    for alumno in alumnos:
        if alumno['curso'] == curso:
            print(f"{alumno['nombre']} {alumno['apellidos']}: {alumno['notas'][asignatura]}")

def porcentaje_aprobados(alumnos, curso):
    asignaturas = alumnos[0]['notas'].keys()
    aprobados = {asig: 0 for asig in asignaturas}
    total = 0
    
    for alumno in alumnos:
        if alumno['curso'] == curso:
            total += 1
            for asig, nota in alumno['notas'].items():
                if nota >= 5:
                    aprobados[asig] += 1
    
    print(f"Porcentaje de aprobados en el curso {curso}:")
    for asig, cant in aprobados.items():
        porcentaje = (cant / total) * 100 if total > 0 else 0
        print(f"{asig}: {porcentaje:.2f}%")

def guardar_notas_curso(alumnos, curso):
    with open(f"{curso}.txt", "w", encoding="utf-8") as f:
        for alumno in alumnos:
            if alumno['curso'] == curso:
                media = calcular_nota_media(alumno['notas'])
                f.write(f"{alumno['nombre']} {alumno['apellidos']} - Nota media: {media:.2f}\n")
    print(f"Fichero {curso}.txt creado correctamente.")

def menu():
    archivo = "Ejercicios de Python 2/notas.txt"
    alumnos = leer_datos(archivo)
    
    while True:
        print("\nMenú:")
        print("1. Listado de alumnos con nota media")
        print("2. Buscar alumnos por curso y asignatura")
        print("3. Porcentaje de aprobados por curso")
        print("4. Guardar notas medias en archivo")
        print("5. Salir")
        
        opcion = input("Elige una opción: ")
        
        if opcion == "1":
            listar_alumnos(alumnos)
        elif opcion == "2":
            curso = input("Introduce el curso: ")
            asignatura = input("Introduce la asignatura: ")
            alumnos_por_asignatura(alumnos, curso, asignatura)
        elif opcion == "3":
            curso = input("Introduce el curso: ")
            porcentaje_aprobados(alumnos, curso)
        elif opcion == "4":
            curso = input("Introduce el curso: ")
            guardar_notas_curso(alumnos, curso)
        elif opcion == "5":
            break
        else:
            print("Opción no válida, intenta de nuevo.")

if __name__ == "__main__":
    menu()