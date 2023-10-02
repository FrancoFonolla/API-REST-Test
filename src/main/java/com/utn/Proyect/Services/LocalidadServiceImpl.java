package com.utn.Proyect.Services;

import com.utn.Proyect.Entities.Localidad;
import com.utn.Proyect.Repositories.BaseRepository;
import com.utn.Proyect.Repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {

        super(baseRepository);
    }
}
