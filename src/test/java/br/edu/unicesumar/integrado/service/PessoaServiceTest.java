package br.edu.unicesumar.integrado.service;


import br.edu.unicesumar.integrado.entity.Pessoa;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Rollback
@SpringBootTest
public class PessoaServiceTest {

    @Autowired
    private PessoaService service;

    @Test
    public void deveSalvarPessoaAndRecuperarLista() {

        Pessoa manuel = new Pessoa();
        manuel.setNome("Manuel");
        manuel.setDocumento("123");

        service.salvarPessoa(manuel);

        Pessoa joao = new Pessoa();
        joao.setNome("Joao");
        joao.setDocumento("321");

        service.salvarPessoa(joao);

        List<Pessoa> resultado = service.recuperarPessoa();


    }

}
