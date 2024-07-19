package br.alura.curso.appDeFrasesDeSeries.servico;

import br.alura.curso.appDeFrasesDeSeries.dto.FraseDTO;
import br.alura.curso.appDeFrasesDeSeries.modelo.Frase;
import br.alura.curso.appDeFrasesDeSeries.repositorio.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FraseService {

    @Autowired
    FraseRepository repositorio;
    public FraseDTO obterFraseAleatoria() {

        Frase frase = repositorio.buscaFraseAleatoria();

        return new FraseDTO(frase.getTitulo(),frase.getFrase(),frase.getPersonagem(),frase.getPoster());
    }
}
