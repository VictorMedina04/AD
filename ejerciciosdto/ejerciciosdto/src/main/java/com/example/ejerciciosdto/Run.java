package com.example.ejerciciosdto;

import com.example.ejerciciosdto.Alumno.Alumno;
import com.example.ejerciciosdto.Alumno.Curso;
import com.example.ejerciciosdto.Alumno.Direccion;
import com.example.ejerciciosdto.Alumno.GetAlumnoDto;
import com.example.ejerciciosdto.Producto.Categoria;
import com.example.ejerciciosdto.Producto.GetProductoDto;
import com.example.ejerciciosdto.Producto.Producto;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Run {
    @PostConstruct
    public static void main(String[] args) {

        Categoria categoria1 = new Categoria(1L, "Alimentación");
        Categoria categoria2 = new Categoria(2L, "Belleza");
        Categoria categoria3 = new Categoria(3L, "Electrónica");

        Producto producto1 = Producto.builder()
                .id(1L)
                .nombre("Granos")
                .desc("Los mejores granos del mercado")
                .pvp(50.99)
                .imagenes(Arrays.asList("imagen1.jpg", "imagen2.jpg"))
                .categoria(categoria1)
                .build();
        Producto producto2 = Producto.builder()
                .id(2L)
                .nombre("Verduras")
                .desc("Las mejores verduras del mercado")
                .pvp(150.99)
                .imagenes(Arrays.asList("imagen3.jpg", "imagen4.jpg"))
                .categoria(categoria1)
                .build();

        Producto producto3 = Producto.builder()
                .id(3L)
                .nombre("Frutas")
                .desc("Las mejores frutas del mercado")
                .pvp(124.99)
                .imagenes(Arrays.asList("imagen5.jpg", "imagen6.jpg"))
                .categoria(categoria1)
                .build();
        Producto producto4 = Producto.builder()
                .id(4L)
                .nombre("Crema antiarrugas para los ojos")
                .desc("Las mejores cremas antiarrugas para los ojos del mercado")
                .pvp(35.99)
                .imagenes(Arrays.asList("imagen7.jpg"))
                .categoria(categoria2)
                .build();
        Producto producto5 = Producto.builder()
                .id(5L)
                .nombre("Protector solar facial")
                .desc("Los mejores protectores solares faciales del mercado")
                .pvp(23.00)
                .imagenes(Arrays.asList("imagen8.jpg","imagen9.jpg"))
                .categoria(categoria2)
                .build();
        Producto producto6 = Producto.builder()
                .id(6L)
                .nombre("Desmaquillantes y agua micelar")
                .desc("Los mejores desmaquillantes y agua micelar del mercado")
                .pvp(78.00)
                .imagenes(Arrays.asList("imagen10.jpg","imagen11.jpg","imagen12.jpg"))
                .categoria(categoria2)
                .build();

        Producto producto7 = Producto.builder()
                .id(7L)
                .nombre("Smartphone")
                .desc("El mejor smartphone del mercado")
                .pvp(699.99)
                .imagenes(Arrays.asList("imagen13.jpg","imagen14.jpg"))
                .categoria(categoria3)
                .build();
        Producto producto8 = Producto.builder()
                .id(8L)
                .nombre("Samsung Tab A")
                .desc("El mejor Samsung Tab A del mercado")
                .pvp(469.99)
                .imagenes(Arrays.asList("imagen14.jpg","imagen15.jpg"))
                .categoria(categoria3)
                .build();

        GetProductoDto productoDTO = GetProductoDto.ofProducto(producto1);
        GetProductoDto productoDTO2 = GetProductoDto.ofProducto(producto2);
        GetProductoDto productoDTO3 = GetProductoDto.ofProducto(producto3);
        GetProductoDto productoDTO4 = GetProductoDto.ofProducto(producto4);
        GetProductoDto productoDTO5 = GetProductoDto.ofProducto(producto5);
        GetProductoDto productoDTO6 = GetProductoDto.ofProducto(producto6);
        GetProductoDto productoDTO7 = GetProductoDto.ofProducto(producto7);
        GetProductoDto productoDTO8 = GetProductoDto.ofProducto(producto8);

        Direccion direccion1 = Direccion.builder()
                .id(1L)
                .tipoVia("Avenida")
                .linea1("123 Lopez Gomara")
                .linea2("Apt 12")
                .cp("12345")
                .poblacion("Sevilla")
                .provincia("Sevila")
                .build();
        Curso curso1 = Curso.builder()
                .id(1L)
                .nombre("Matemáticas")
                .tipo("Ciencias")
                .tutor("Jose")
                .aula("Aula 666")
                .build();
        Alumno alumno1 = Alumno.builder()
                .id(1L)
                .nombre("Rodrigo")
                .apellido1("Rodriguez")
                .apellido2("Lopez")
                .email("rodri.rolo@example.com")
                .curso(curso1)
                .direccion(direccion1)
                .build();

        Direccion direccion2 = Direccion.builder()
                .id(1L)
                .tipoVia("Calle")
                .linea1("123 Main St")
                .linea2("Apt 4B")
                .cp("12345")
                .poblacion("Ciudad")
                .provincia("Provincia")
                .build();
        Curso curso2 = Curso.builder()
                .id(1L)
                .nombre("Informatica")
                .tipo("Ciencias")
                .tutor("Miguel")
                .aula("Aula 777")
                .build();
        Alumno alumno2 = Alumno.builder()
                .id(2L)
                .nombre("Samuel")
                .apellido1("De Luque")
                .apellido2("")
                .email("samdeluq@example.com")
                .curso(curso2)
                .direccion(direccion2)
                .build();
        GetAlumnoDto alumnoDTO = GetAlumnoDto.ofAlumno(alumno1);
        GetAlumnoDto alumnoDTO2 = GetAlumnoDto.ofAlumno(alumno2);

        System.out.println(productoDTO);
        System.out.println(productoDTO2);
        System.out.println(productoDTO3);
        System.out.println(productoDTO4);
        System.out.println(productoDTO5);
        System.out.println(productoDTO6);
        System.out.println(productoDTO7);
        System.out.println(productoDTO8);
        System.out.println(alumnoDTO);
        System.out.println(alumnoDTO2);



    }
}
