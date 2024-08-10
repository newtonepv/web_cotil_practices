package com.example.LojaJogosPN.controller;
import com.example.LojaJogosPN.repository.ClienteRepository;
import com.example.LojaJogosPN.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class JogoController {

    @Autowired
    JogoRepository jogoRepo;

}
