package ru.nkazakov.zoo.dto;

import lombok.Builder;
import lombok.Data;
import ru.nkazakov.zoo.entity.Color;

@Data
@Builder
public class CatDto {
    private final Long id;
    private final String name;
    private final Integer weight;
    private final Color color;
}
