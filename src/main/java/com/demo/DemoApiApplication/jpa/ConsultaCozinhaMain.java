package com.demo.DemoApiApplication.jpa;

import com.demo.DemoApiApplication.DemoApiApplication;

import com.demo.DemoApiApplication.domain.model.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

public class ConsultaCozinhaMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(DemoApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);


//        Para retornar a lista com todos os nomes da tabela cozinha
        List<Cozinha> cozinhas = cadastroCozinha.listar();

        for (Cozinha cozinha : cozinhas) {
            System.out.println(cozinha.getNome());
        }
    }
}
