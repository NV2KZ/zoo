package ru.nkazakov.zoo.mapper;

import ru.nkazakov.zoo.dto.CatDto;
import ru.nkazakov.zoo.entity.Cat;

public class CatMapper {

    public static CatDto mapToDto(Cat cat) {
        return CatDto.builder()
                .name(cat.getName())
                .weight(cat.getWeight())
                .color(cat.getColor())
                .build();
    }

    public static Cat mapToEntity(CatDto catDto) {
        Cat cat = new Cat();
        cat.setName(catDto.getName());
        cat.setWeight(catDto.getWeight());
        cat.setColor(catDto.getColor());
        return cat;
    }
}
