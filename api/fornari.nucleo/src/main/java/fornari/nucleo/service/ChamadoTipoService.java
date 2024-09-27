package fornari.nucleo.service;

import fornari.nucleo.domain.dto.ChamadoTipoDto;
import fornari.nucleo.domain.entity.ChamadoTipo;
import fornari.nucleo.domain.mapper.ChamadoTipoMapper;
import fornari.nucleo.repository.ChamadoTipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChamadoTipoService {
    
    @Autowired 
    private ChamadoTipoRepository repository;

    public ChamadoTipo create(ChamadoTipoDto dto) {
        dto.setId(null);
        return repository.save(ChamadoTipoMapper.toChamadoTipo(dto));
    }
}
