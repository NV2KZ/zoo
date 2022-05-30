package ru.nkazakov.zoo.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nkazakov.zoo.dto.CatDto;
import ru.nkazakov.zoo.mapper.CatMapper;
import ru.nkazakov.zoo.repository.CatRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CatService {
    private final CatRepository catRepository;

    public CatDto find(Long id) {
        return catRepository.findById(id)
                .map(CatMapper::mapToDto)
                .orElseThrow(() -> new EntityNotFoundException(String.format("Cat with id %s not found", id)));
    }

    public List<CatDto> findAll() {
        return catRepository.findAll().stream()
                .map(CatMapper::mapToDto)
                .collect(Collectors.toList());
    }

    public CatDto create(CatDto catDto) {
        var catNew = CatMapper.mapToEntity(catDto);
        return CatMapper.mapToDto(catRepository.save(catNew));
    }
}
