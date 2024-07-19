package br.alura.curso.appDeFrasesDeSeries.controller;


import br.alura.curso.appDeFrasesDeSeries.dto.FraseDTO;
import br.alura.curso.appDeFrasesDeSeries.servico.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@Autowired
    FraseService service;
@GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria(){
    return service.obterFraseAleatoria();
}
}
