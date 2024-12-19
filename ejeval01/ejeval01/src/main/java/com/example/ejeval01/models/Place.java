package com.example.ejeval01.models;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Place {

    private Long id;
    private String name;
    private String direccion;
    private String localizacion;
    private String imagen;

    @Setter(AccessLevel.NONE)
    @Builder.Default
    private List<String> listaTags =new ArrayList<>();


    public void addTag(String tag) {
        if (listaTags.stream().noneMatch(t -> t.equalsIgnoreCase(tag)))
            listaTags.add(tag);

        listaTags.add(tag);
    }
    public void removeTag(String tag) {
        listaTags.remove(tag);
    }
}
