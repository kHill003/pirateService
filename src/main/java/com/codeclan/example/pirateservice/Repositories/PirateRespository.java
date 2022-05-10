package com.codeclan.example.pirateservice.Repositories;
import  com.codeclan.example.pirateservice.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PirateRespository extends JpaRepository<Pirate, Long> {
    @Repository //NEW
    public interface PirateRepository extends JpaRepository<Pirate, Long> {
    }


}
