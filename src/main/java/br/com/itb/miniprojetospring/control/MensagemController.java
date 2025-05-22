package br.com.itb.miniprojetospring.control;

import br.com.itb.miniprojetospring.model.Mensagem;
import br.com.itb.miniprojetospring.service.MensagemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173") // Libera o front
@RequestMapping("/mensagem")
public class MensagemController {

    private final MensagemService service;

    public MensagemController(MensagemService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Mensagem>> listarMensagens() {
        return ResponseEntity.ok(service.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirMensagem(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<Mensagem> criarMensagem(@RequestBody Mensagem mensagem) {
        Mensagem salva = service.save(mensagem);
        return ResponseEntity.status(201).body(salva);
    }
}
