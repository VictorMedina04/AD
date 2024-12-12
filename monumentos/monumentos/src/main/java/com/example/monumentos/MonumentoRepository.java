package com.example.monumentos;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class MonumentoRepository {

    private HashMap<Long, Monumento> monumentos = new HashMap<>();

    @PostConstruct
    public void init() {
        add(Monumento.builder()
                .id(1L)
                .codigoPais("ES")
                .nombrePais("España")
                .nombreCiudad("Ubeda")
                .latitud(38.0078)
                .longitud(-3.3683)
                .descripcion("La plaza Vázquez de Molina es una plaza situada en la localidad de Úbeda," +
                        " en la provincia de Jaén, constituye uno de los mejores ejemplos de urbanismo " +
                        "renacentista que existen en España. Este ha sido uno de los motivos para que esta plaza," +
                        " junto con parte del conjunto monumental de Baeza fuesen declarados el 3 de julio de 2003 " +
                        "Patrimonio de la Humanidad por la Unesco.")
                .nombreMonumento("Plaza Vázquez de Molina")
                .urlImagen("https://www.vandelviraturismo.com/wp-content/uploads/2020/09/plaza-vazquez-molina-en-ubeda.jpg")
                .build());

        add(Monumento.builder()
                .id(2L)
                .codigoPais("ES")
                .nombrePais("España")
                .nombreCiudad("Sevilla")
                .latitud(37.382412)
                .longitud(-5.996490)
                .descripcion("La Torre del Oro de Sevilla es una torre albarrana situada en el margen oriental" +
                        " del río Guadalquivir, en la ciudad de Sevilla, Andalucía, España. Es una construcción" +
                        " almohade de entre 1220 y 1221.El segundo cuerpo es mudéjar, construido durante el" +
                        " reinado de Pedro I.")
                .nombreMonumento("Torre del oro")
                .urlImagen("https://upload.wikimedia.org/wikipedia/commons/4/4c/Torre_del_Oro%2C_Guadalquivir%2C_Sevilla.jpg")
                .build());

        add(Monumento.builder()
                .id(3L)
                .codigoPais("DE")
                .nombrePais("Alemania")
                .nombreCiudad("Hohenschwangau")
                .latitud(47.5576)
                .longitud(10.7498)
                .descripcion("Neuschwanstein es un castillo del siglo XIX que combina elementos medievales y modernos. " +
                        "Construido como un tributo a los mitos y la música de Richard Wagner, cuenta con vistas panorámicas" +
                        " impresionantes de los Alpes Bávaros y el valle circundante. Es uno de los destinos turísticos más" +
                        " visitados de Alemania, siendo una fuente de inspiración para el castillo de la Bella Durmiente en Disneyland.")
                .nombreMonumento("Neuschwanstein Castle")
                .urlImagen("https://upload.wikimedia.org/wikipedia/commons/f/f8/Schloss_Neuschwanstein_2013.jpg")
                .build());
        add(Monumento.builder()
                .id(4L)
                .codigoPais("RU")
                .nombrePais("Rusia")
                .nombreCiudad("Moscú")
                .latitud(55.751244)
                .longitud(37.618423)
                .descripcion("El Kremlin de Moscú es una histórica ciudadela fortificada y un núcleo político y religioso. "
                        + "Es conocido por su distintiva arquitectura, que incluye catedrales ortodoxas con cúpulas doradas, el Gran Palacio del Kremlin, "
                        + "y la Torre Spasskaya, rematada con una estrella roja. Este complejo, que data del siglo XII, es símbolo de la historia y el poder ruso.")
                .nombreMonumento("Kremlin de Moscú")
                .urlImagen("https://upload.wikimedia.org/wikipedia/commons/a/a3/Moscow_Kremlin_view_from_the_cathedral.jpg")
                .build());
        Monumento.builder()
                .id(5L)
                .codigoPais("BR")
                .nombrePais("Brasil")
                .nombreCiudad("Río de Janeiro")
                .latitud(-22.951944)
                .longitud(-43.210556)
                .descripcion("El Cristo Redentor es una estatua Art Deco de Jesús en la cima del Monte Corcovado, en Río de Janeiro, Brasil. " +
                        "Con una altura de 30 metros, más un pedestal de 8 metros, y brazos extendidos de 28 metros de ancho, es uno de los símbolos " +
                        "más reconocidos del país y del mundo. Construida entre 1922 y 1931, la estatua está hecha de hormigón armado recubierto " +
                        "de piedra jabón. Fue elegida como una de las Nuevas Siete Maravillas del Mundo en 2007.")
                .nombreMonumento("Cristo Redentor")
                .urlImagen("https://upload.wikimedia.org/wikipedia/commons/d/d4/Cristo_Redentor_-_Rio_de_Janeiro%2C_Brasil.jpg")
                .build();
        add(Monumento.builder()
                .id(5L)
                .codigoPais("CN")
                .nombrePais("China")
                .nombreCiudad("Varios puntos a lo largo del norte de China")
                .latitud(40.431908)
                .longitud(116.570375)
                .descripcion("La Gran Muralla China es una antigua fortificación construida entre el siglo VII a.C. y el siglo XVII d.C. " +
                        "para proteger las fronteras del Imperio Chino. Con más de 21,000 kilómetros de extensión en su máxima expansión, " +
                        "es un símbolo de la ingeniería y la tenacidad de la civilización china. Los tramos más conocidos, como Badaling " +
                        "cerca de Beijing, han sido restaurados y son populares entre los turistas.")
                .nombreMonumento("La Gran Muralla China")
                .urlImagen("https://upload.wikimedia.org/wikipedia/commons/e/e3/The_Great_Wall_of_China_at_Jinshanling-edit.jpg")
                .build());


    }

    public Monumento add(Monumento monumento) {
        monumentos.put(monumento.getId(), monumento);
        return monumento;
    }

    public Optional<Monumento> get(Long id) {
        return Optional.ofNullable(monumentos.get(id));
    }

    public List<Monumento> getAll() {
        return List.copyOf(monumentos.values());
    }

    public Optional<Monumento> edit(Long id, Monumento newValue) {
        return Optional.ofNullable(monumentos.computeIfPresent(id, (k, v) -> {
            v.setNombreCiudad(newValue.getNombreCiudad());
            v.setNombrePais(newValue.getNombrePais());
            return v;
        }));
    }

    public void delete(Long id) {
        monumentos.remove(id);
    }

    public List<Monumento> query(double maxLatitude, String sortDirection) {
        List<Monumento> data = new ArrayList<>(monumentos.values());
        List<Monumento> result;


        if (maxLatitude < 0) {
            result = data;
        } else {
            result = data.stream().filter(m -> m.getLatitud() <= maxLatitude)
                    .collect(Collectors.toCollection(ArrayList::new));
        }


        if (sortDirection.equalsIgnoreCase("asc")) {
            result.sort(Comparator.comparing(Monumento::getNombreMonumento));
        } else if (sortDirection.equalsIgnoreCase("desc")) {
            result.sort(Comparator.comparing(Monumento::getNombreMonumento).reversed());
        }
        return Collections.unmodifiableList(result);


    }
}
