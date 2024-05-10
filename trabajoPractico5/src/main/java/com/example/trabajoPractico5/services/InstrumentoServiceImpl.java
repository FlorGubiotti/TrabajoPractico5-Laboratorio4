package com.example.trabajoPractico5.services;

import com.example.trabajoPractico5.entities.Instrumento;
import com.example.trabajoPractico5.repositories.BaseRepository;
import com.example.trabajoPractico5.repositories.InstrumentoRepository;
import org.springframework.stereotype.Service;

@Service
public class InstrumentoServiceImpl extends BaseServiceImpl<Instrumento, Long> implements InstrumentoService {

    private InstrumentoRepository instrumentoRepository;

    public InstrumentoServiceImpl(InstrumentoRepository instrumentoRepository) {
        super((BaseRepository<Instrumento, Long>) instrumentoRepository);
        this.instrumentoRepository = instrumentoRepository;
    }
}
