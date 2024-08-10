package com.example.LojaJogos.control;

import com.example.LojaJogos.Repository.ClienteRepository;
import com.example.LojaJogos.model.ClienteModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/apiCliente")
public class ClienteController {

    @Autowired
    ClienteRepository cliRepo;

    @PostMapping ("/inserir")
    public void inserirCliente(@RequestBody ClienteModel cli){cliRepo.save(cli);}

    @DeleteMapping ("/remover")
    public void removerCliente (@RequestBody ClienteModel cli) {cliRepo.delete(cli);}

    @PutMapping("/atualizar")
    public void atualizarCliente(@RequestBody ClienteModel cli){cliRepo.save(cli);}

    @GetMapping (value="/todos")
    public List<ClienteModel> buscarTodos()
    {
        return  cliRepo.findAll();
    }

    @GetMapping("/nome/{nome}")
    public List<ClienteModel> buscarPorNome(@PathVariable(value = "nome") String nome){
        return cliRepo.findByNome(nome);
    }

    @GetMapping("/codigo/{codigo}")
    public List<ClienteModel> buscarPorCodigo(@PathVariable(value = "codigo") int codigo){
        return cliRepo.findByCodigo(codigo);
    }

    @GetMapping("/email/{email}")
    public List<ClienteModel> buscarPorEmail(@PathVariable(value = "email") String email){
        return cliRepo.findByEmail(email);
    }

    @GetMapping ("/nomeInicio/{nome}")
    public List<ClienteModel> listarPorInicioNome (@PathVariable(value="nome") String nome)
    {
        return cliRepo.findByInicioNome(nome);
    }



}
