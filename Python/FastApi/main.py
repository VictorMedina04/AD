from fastapi import FastAPI
from controller.productoController import router as producto_router

app = FastAPI()

app.include_router(producto_router, prefix="/api")

if __name__ == "__main__":
    import uvicorn
    uvicorn.run(app, host="0.0.0.0", port=8000)