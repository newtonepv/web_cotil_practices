package com.example.LojaJogosPN.controller;
import com.example.LojaJogosPN.model.Cliente;
import com.example.LojaJogosPN.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/apiCliente")
public class ClienteController {

    @Autowired
    ClienteRepository cliRepo;

    @DeleteMapping("/remover")
    public void removerCliente (@RequestBody Cliente cli) {
        cliRepo.delete(cli);}

    @PutMapping ("/atualizar")
    public void atualizarCliente (@RequestBody Cliente cli){
        cliRepo.save(cli);}

    @PostMapping ("/inserir")
    public void inserirCliente(@RequestBody Cliente cli)
    {
        cliRepo.save(cli);
    }

    @PostMapping ("/listarTodos")
    public List<Cliente> encontrarClientes() {
        return cliRepo.findAll();
    }



/*
    @GetMapping("/codigo/{codigo}")
    public List<Cliente> listarPorCodigo (@PathVariable(value="codigo") int codigo){
        return cliRepo.findByCodigo(codigo);
    }

    @GetMapping("/nome/{nome}")
    public List<Cliente> listarPorNome (@PathVariable(value="nome") String nome){
        return cliRepo.findByNome(nome);
    }

    @GetMapping("/email/{email}")
    public List<Cliente> listarPorEmail (@PathVariable(value="email") String email){
        return cliRepo.findByEmail(email);
    }

    @GetMapping("/nomeEspec/{nome}")
    public List<Cliente> listarPorLetra (@PathVariable(value="nome")String nome){
        return cliRepo.findByLetra(nome);
    }

    @GetMapping("/maiorCodigo/{codigo}/{n}")
    public List<Cliente> listarPorMaiorCodigo (@PathVariable(value="codigo") int codigo){
        return cliRepo.findByMaiorCodigo(codigo);
    }

    @GetMapping("/inicioEmail/{email}")
    public List<Cliente> listarPorInicioEmail (@PathVariable(value="email") String email){
        return cliRepo.findByInicioEmail(email);
    }
    */

}
