package ru.nkazakov.zoo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.nkazakov.zoo.dto.CatDto;
import ru.nkazakov.zoo.service.CatService;

import java.util.List;

@RestController
@RequestMapping("/cat")
@RequiredArgsConstructor
public class CatController {
    private final CatService catService;

    @GetMapping("/{id}")
    public CatDto getCat(@PathVariable Long id) {
        return catService.find(id);
    }

    @GetMapping()
    public List<CatDto> getAllCats() {
        return catService.findAll();
    }

    @PostMapping()
    public CatDto createCat(CatDto catDto) {
        return catService.create(catDto);
    }
}
