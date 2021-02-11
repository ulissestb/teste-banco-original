package com.buscacep.model;

import lombok.Data;

@Data
public class Endereco {
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

}
