/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.modelo.Cosmetic;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto2_Web.interfaces.InterfaceCosmetic;

/**
 *
 * @author USUARIO
 */
@Repository
public class CosmeticRepository {
    @Autowired
    private InterfaceCosmetic repository;

    public List<Cosmetic> getAll() {
        return repository.findAll();
    }

    public Optional<Cosmetic> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Cosmetic create(Cosmetic clothe) {
        return repository.save(clothe);
    }

    public void update(Cosmetic clothe) {
        repository.save(clothe);
    }
    
    public void delete(Cosmetic clothe) {
        repository.delete(clothe);
    }
}
