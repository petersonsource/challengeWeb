package com.example.challengeWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.challengeWeb.model.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long>{

}
