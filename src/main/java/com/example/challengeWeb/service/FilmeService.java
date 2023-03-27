package com.example.challengeWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.challengeWeb.client.FilmeClientOMDBFeign;
import com.example.challengeWeb.converter.FilmeConverter;
import com.example.challengeWeb.dto.FilmeDTO;
import com.example.challengeWeb.model.Filme;
import com.example.challengeWeb.repository.FilmeRepository;
import com.example.challengeWeb.vo.FilmeOMDB;

@Service
public class FilmeService {
	
	@Value("${imdb.apikey}")
	private String apiKey;
	
	@Autowired
	private FilmeConverter filmeConverter;
		
	@Autowired
	private FilmeRepository filmeRepository;
	
	@Autowired
	private FilmeClientOMDBFeign filmeClientFeign;
	
	public FilmeOMDB getFilme(String tema) {
		return filmeClientFeign.getFilme(tema, apiKey);
	}
	
	public Filme save(FilmeDTO filmeDTO) {
		Filme filme = filmeConverter.converteParaFilme(filmeDTO);
		return filmeRepository.save(filme);
	}

	public Filme getById(Long id) {
		return filmeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("filme não encontrado"));
	}

}
