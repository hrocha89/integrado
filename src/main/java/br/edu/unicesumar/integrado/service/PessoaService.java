package br.edu.unicesumar.integrado.service;

import br.edu.unicesumar.integrado.entity.Pessoa;
import br.edu.unicesumar.integrado.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public void salvarPessoa(Pessoa pessoa) {
        repository.save(pessoa);
    }

    public List<Pessoa> recuperarPessoa() {
        return repository.findAll();
    }
}
