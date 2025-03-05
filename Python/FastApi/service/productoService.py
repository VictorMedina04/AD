from typing import List, Optional
from model.producto import Producto
from repo.productoRepo import productoRepo

class ProductoService:
    
    def __init__(self):
        self.repository = productoRepo()

    def get_all_productos(self) -> List[Producto]:
        return self.repository.get_all_producto()

    def get_producto_by_id(self, producto_id: int) -> Optional[Producto]:
        return self.repository.get_producto_by_id(producto_id)

    def create_producto(self, producto: Producto) -> Producto:
        return self.repository.create_producto(producto)

    def update_producto(self, producto_id: int, updated_producto: Producto) -> Optional[Producto]:
        return self.repository.update_producto(producto_id, updated_producto)

    def delete_producto(self, producto_id: int) -> Optional[Producto]:
        return self.repository.delete_producto(producto_id)