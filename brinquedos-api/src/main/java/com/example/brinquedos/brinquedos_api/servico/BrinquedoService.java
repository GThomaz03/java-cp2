package com.example.brinquedos.brinquedos_api.servico;

import com.example.brinquedos.brinquedos_api.model.Brinquedo;
import com.example.brinquedos.brinquedos_api.repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrinquedoService {

    @Autowired
    private BrinquedoRepository brinquedoRepository;

    public List<Brinquedo> findAll() {
        return brinquedoRepository.findAll();
    }

    public Brinquedo save(Brinquedo brinquedo) {
        return brinquedoRepository.save(brinquedo);
    }

    public Optional<Brinquedo> findById(Long id) {
        return brinquedoRepository.findById(id);
    }
}