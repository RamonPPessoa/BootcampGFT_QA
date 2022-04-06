package br.com.dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    @Test
    void validarCalculDeIdade(){
        Pessoa pessoa = new Pessoa("João", LocalDate.of(2000,3,27));
        Assertions.assertEquals(22,pessoa.getIdade());
    }
}
