package ru.nkazakov.zoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nkazakov.zoo.entity.Cat;

public interface CatRepository extends JpaRepository<Cat, Long> {
}
