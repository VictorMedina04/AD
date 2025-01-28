#Funcion que comprueba si los paréntesis, llaves y corchetes de una expresión están equilibrados.


def esta_equilibrado(expresion):
    stack = []
    pares = {')': '(', ']': '[', '}': '{'}  
    for char in expresion:
        if char in '([{':  
            stack.append(char)  
        elif char in ')]}':
            if not stack or stack.pop() != pares[char]:
                return False
    return not stack 

# Ejemplo de uso
print(esta_equilibrado("{ [ a * ( c + d ) ] - 5 }"))  
print(esta_equilibrado("{ a * ( c + d ) ] - 5 }")) 
