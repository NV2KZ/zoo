package ru.nkazakov.zoo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@SequenceGenerator(name="cat_sequence_generator", sequenceName="cat_sequence", allocationSize = 1)
public class Cat {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cat_sequence_generator")
    private Long id;

    private String name;

    private Integer weight;

//    @OneToMany()
//    List<Cat> child;

    @Enumerated(value = EnumType.STRING)
    private Color color;
}
