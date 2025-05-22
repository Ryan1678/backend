package br.com.itb.miniprojetospring.model;

import br.com.itb.miniprojetospring.model.Mensagem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MensagemRepository extends JpaRepository<Mensagem, Long> {

    Optional<Mensagem> findById(Long id);
}
