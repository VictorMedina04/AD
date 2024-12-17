package com.example.monumentosV3.Controller;

import com.example.monumentosV3.Models.Monumento;
import com.example.monumentosV3.Models.MonumentoRepository;
import com.example.monumentosV3.Service.MonumentoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/monumento")
@RequiredArgsConstructor
@Tag(name = "Monumento", description = "Controlador de monumentos")
public class MonumentoController {

    private final MonumentoRepository monumentoRepository;
    private final MonumentoService monumentoService;

    @Operation(summary = "Obtiene todos los monumentos")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Se han encontrado monumentos",
                    content = {@Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Monumento.class)),
                            examples = {@ExampleObject(
                                    value = """
                                            [
                                                    {
                                                        "id": 1,
                                                        "countryCode": "ES",
                                                        "countryName": "España",
                                                        "cityName": "Úbeda",
                                                        "latitude": 38.0078,
                                                        "longitude": -3.3683,
                                                        "name": "Plaza Vázquez de Molina",
                                                        "description": "La plaza Vázquez de Molina es una plaza situada en la localidad de Úbeda, en la provincia de Jaén, constituye uno de los mejores ejemplos de urbanismo renacentista que existen en España. Este ha sido uno de los motivos para que esta plaza, junto con parte del conjunto monumental de Baeza fuesen declarados el 3 de julio de 2003 Patrimonio de la Humanidad por la Unesco.",
                                                        "imagen": "https://www.vandelviraturismo.com/wp-content/uploads/2020/09/plaza-vazquez-molina-en-ubeda.jpg"
                                                    },
                                                    {
                                                        "id": 2,
                                                        "countryCode": "ES",
                                                        "countryName": "España",
                                                        "cityName": "Sevilla",
                                                        "latitude": 37.382412,
                                                        "longitude": -5.996490,
                                                        "name": "Torre del Oro",
                                                        "description": "La Torre del Oro de Sevilla es una torre albarrana situada en el margen oriental del río Guadalquivir, en la ciudad de Sevilla, Andalucía, España. Es una construcción almohade de entre 1220 y 1221. El segundo cuerpo es mudéjar, construido durante el reinado de Pedro I.",
                                                        "imagen": "https://upload.wikimedia.org/wikipedia/commons/4/4c/Torre_del_Oro%2C_Guadalquivir%2C_Sevilla.jpg"
                                                    }
                                            
                                            
                                            ]
                                            """
                            )}
                    )}),
            @ApiResponse(responseCode = "404",
                    description = "No se ha encontrado ningún monumento",
                    content = @Content),
    })
    @GetMapping("/lista")
    public ResponseEntity<List<Monumento>> getAllWithParams(
            @RequestParam(required = false, value = "maxLatitud", defaultValue = "") Double latitud,
            @RequestParam(required = false, value = "sort", defaultValue = "no") String sort) {
        List<Monumento> result = monumentoService.query(latitud, sort);


        return ResponseEntity.ok(result);
    }

    @Operation(summary = "Crear un monumento")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Se ha creado el monumento",
                    content = {@Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Monumento.class)),
                            examples = {@ExampleObject(

                            )}
                    )}),
            @ApiResponse(responseCode = "404",
                    description = "No se ha encontrado ningún monumento",
                    content = @Content),
    })


    @PostMapping
    public ResponseEntity<Monumento> create(
            @RequestBody Monumento monumento) {
        return ResponseEntity.status(HttpStatus.CREATED).body(monumentoService.add(monumento));
    }


    @Operation(summary = "Obtener un monumento")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Se ha encontrado el monumento",
                    content = {@Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Monumento.class)),
                            examples = {@ExampleObject(
                                    value = """
                                            {
                                                         "id": 2,
                                                         "countryCode": "ES",
                                                         "countryName": "España",
                                                         "cityName": "Sevilla",
                                                         "latitude": 37.382412,
                                                         "longitude": -5.996490,
                                                         "name": "Torre del Oro",
                                                         "description": "La Torre del Oro de Sevilla es una torre albarrana situada en el margen oriental del río Guadalquivir, en la ciudad de Sevilla, Andalucía, España. Es una construcción almohade de entre 1220 y 1221. El segundo cuerpo es mudéjar, construido durante el reinado de Pedro I.",
                                                         "imagen": "https://upload.wikimedia.org/wikipedia/commons/4/4c/Torre_del_Oro%2C_Guadalquivir%2C_Sevilla.jpg"
                                                     }
                                            """
                            )}
                    )}),
            @ApiResponse(responseCode = "404",
                    description = "No se ha encontrado ningún monumento",
                    content = @Content),
    })
    @GetMapping("/{id}")
    public Monumento getById(@PathVariable Long id) {
        return monumentoService.get(id);
    }

    @Operation(summary = "Editar un monumento")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Se ha editado el monumento",
                    content = {@Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Monumento.class)),
                            examples = {@ExampleObject(

                            )}
                    )}),
            @ApiResponse(responseCode = "404",
                    description = "No se ha encontrado ningún monumento",
                    content = @Content),
    })
    @PutMapping("/{id}")
    public Monumento edit(
            @RequestBody Monumento monumento,
            @PathVariable("id") Long id) {
        return monumentoService.edit(id, monumento);
    }


    @Operation(summary = "Borrar un monumento")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Se ha eliminado el monumento",
                    content = {@Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = Monumento.class)),
                            examples = {@ExampleObject(

                            )}
                    )}),
            @ApiResponse(responseCode = "404",
                    description = "No se ha encontrado ningún monumento",
                    content = @Content),
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        monumentoService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
