package com.example.brinquedos.brinquedos_api.repository;

import com.example.brinquedos.brinquedos_api.model.Brinquedo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrinquedoRepository extends JpaRepository<Brinquedo, Long> {
}