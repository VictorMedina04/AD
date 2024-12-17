package com.example.ejeval01.controller;

import com.example.ejeval01.dto.GetPlaceDto;
import com.example.ejeval01.service.PlaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/place/")
public class PlaceController {

    private final PlaceService placeService;

    public GetPlaceDto getPlace(){

    }
}
