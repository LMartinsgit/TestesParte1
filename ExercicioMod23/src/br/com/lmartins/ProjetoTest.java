package br.com.lmartins;

import org.junit.Test;
import org.junit.Assert;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.List;

public class ProjetoTest {

    @Test
    public void testListaContemApenasMulheres() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", 'F'));
        pessoas.add(new Pessoa("João", 'M'));
        pessoas.add(new Pessoa("Ana", 'F'));
        pessoas.add(new Pessoa("Pedro", 'M'));

        boolean contemApenasMulheres = pessoas.stream()
                .allMatch(pessoa -> pessoa.getGen() == 'F');
    }

    
        @Test
        public void testLista() {
            String input = "Ana\nMaria\np\n";
            InputStream in = new ByteArrayInputStream(input.getBytes());
            System.setIn(in);

            Projeto.main(new String[]{});

        
        
    }
}