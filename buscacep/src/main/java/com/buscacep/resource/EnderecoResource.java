package com.buscacep.resource;

import com.buscacep.model.Endereco;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;


@RestController
@RequestMapping(value="/api")
@CrossOrigin(origins = "*")
public class EnderecoResource {

    Endereco endereco;

    @GetMapping("/cep/{cep}")
    public Endereco buscaPorNumeroCep(@PathVariable(value="cep") Long cep){
        RestTemplate restTemplate = new RestTemplate();
        try{
            endereco = restTemplate.getForObject("https://viacep.com.br/ws/" + cep + "/json/", Endereco.class);
        }catch(Exception e){
            System.out.println(e);
            return new Endereco();
        }

        return endereco;
    }
}
