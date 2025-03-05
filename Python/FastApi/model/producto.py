from pydantic import BaseModel

class Producto(BaseModel):
    id: int
    nombre: str
    descripcion: str = None
    precio: float
    cantidad: int