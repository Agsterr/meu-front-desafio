package br.alura.curso.appDeFrasesDeSeries.repositorio;

import br.alura.curso.appDeFrasesDeSeries.modelo.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    Frase buscaFraseAleatoria();


}
