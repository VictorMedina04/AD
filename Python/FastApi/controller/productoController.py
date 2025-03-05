from fastapi import APIRouter, HTTPException
from typing import List
from model.producto import Producto  
from service.productoService import ProductoService 

router = APIRouter()
service = ProductoService()

@router.get("/productos", response_model=List[Producto])
def get_productos():
    return service.get_all_productos()

@router.get("/productos/{producto_id}", response_model=Producto)
def get_producto(producto_id: int):
    producto = service.get_producto_by_id(producto_id)
    if producto is None:
        raise HTTPException(status_code=404, detail="Producto not found")
    return producto

@router.post("/productos", response_model=Producto)
def create_producto(producto: Producto):
    return service.create_producto(producto)

@router.put("/productos/{producto_id}", response_model=Producto)
def update_producto(producto_id: int, updated_producto: Producto):
    producto = service.update_producto(producto_id, updated_producto)
    if producto is None:
        raise HTTPException(status_code=404, detail="Producto not found")
    return producto

@router.delete("/productos/{producto_id}", response_model=Producto)
def delete_producto(producto_id: int):
    producto = service.delete_producto(producto_id)
    if producto is None:
        raise HTTPException(status_code=404, detail="Producto not found")
    return producto
