package com.example.trabajoPractico5.services;

import com.example.trabajoPractico5.entities.Categoria;
import com.example.trabajoPractico5.repositories.BaseRepository;
import com.example.trabajoPractico5.repositories.CategoriaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl extends BaseServiceImpl<Categoria,Long> implements CategoriaService {

    private CategoriaRepository categoriaRepository;

    public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
        super((BaseRepository<Categoria, Long>) categoriaRepository);
        this.categoriaRepository = categoriaRepository;
    }
}