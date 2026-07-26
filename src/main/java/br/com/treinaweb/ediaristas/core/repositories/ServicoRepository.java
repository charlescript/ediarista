package br.com.treinaweb.ediaristas.core.repositories;

import br.com.treinaweb.ediaristas.core.models.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
    
}
