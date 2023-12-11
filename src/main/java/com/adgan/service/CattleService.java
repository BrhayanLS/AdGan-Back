package com.adgan.service;

import com.adgan.persitence.entity.CattleEntity;
import com.adgan.persitence.repository.CattleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CattleService {
    private final CattleRepository cattleRepository;

    @Autowired
    public CattleService(CattleRepository cattleRepository) {
        this.cattleRepository = cattleRepository;
    }

    public CattleEntity saveCattle (CattleEntity cattle){
        return this.cattleRepository.save(cattle);
    }

    public List<CattleEntity> getAll(){
        return  this.cattleRepository.findAll();
    }

    public CattleEntity getById(int idCattle){
        return this.cattleRepository.findById(idCattle).orElse(null);
    }

    public Boolean exists(int idCattle) {
        return this.cattleRepository.existsById(idCattle);
    }

    public void deleteCattle (int idCattle){
        this.cattleRepository.deleteById(idCattle);
    }
}
