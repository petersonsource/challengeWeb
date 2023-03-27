package com.example.challengeWeb.converter;

import org.springframework.stereotype.Component;

import com.example.challengeWeb.dto.FilmeDTO;
import com.example.challengeWeb.model.Filme;
import com.example.challengeWeb.vo.FilmeVO;

@Component
public class FilmeConverter {

	public Filme converteParaFilme(FilmeDTO filmeDTO) {
		Filme filme = new Filme();		
		filme.setTitle(filmeDTO.getTitle());
		filme.setYear(filmeDTO.getYear());
		return filme;
	}

	public FilmeVO converteParaFilmeVO(Filme filme) {
		FilmeVO filmeVO = new FilmeVO();
		filmeVO.setId(filme.getId());
		filmeVO.setTitle(filme.getTitle());
		filmeVO.setYear(filme.getYear());
		return filmeVO;
	}

	
	
}
