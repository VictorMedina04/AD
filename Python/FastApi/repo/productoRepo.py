from typing import List, Optional
from model.producto import Producto

producto_db = []

class productoRepo:
    def get_all_producto(self) -> List[Producto]:
        return producto_db

    def get_producto_by_id(self, producto_id: int) -> Optional[Producto]:
        return next((producto for producto in producto_db if producto.id == producto_id), None)

    def create_producto(self, producto: Producto) -> Producto:
        producto_db.append(producto)
        return producto

    def update_producto(self, producto_id: int, updated_producto: Producto) -> Optional[Producto]:
        producto = self.get_producto_by_id(producto_id)
        if producto:
            producto.nombre = updated_producto.nombre
            producto.descripcion = updated_producto.descripcion
            producto.precio = updated_producto.precio
            producto.cantidad = updated_producto.cantidad
        return producto

    def delete_producto(self, producto_id: int) -> Optional[Producto]:
        producto = self.get_producto_by_id(producto_id)
        if producto:
            producto_db.remove(producto)
        return producto