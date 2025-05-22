package br.com.itb.miniprojetospring.service;

import br.com.itb.miniprojetospring.model.Mensagem;
import br.com.itb.miniprojetospring.model.MensagemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensagemService {

    private final MensagemRepository repository;

    public MensagemService(MensagemRepository repository) {
        this.repository = repository;
    }

    public List<Mensagem> findAll() {
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Mensagem save(Mensagem mensagem) {
        return repository.save(mensagem);
    }
}
