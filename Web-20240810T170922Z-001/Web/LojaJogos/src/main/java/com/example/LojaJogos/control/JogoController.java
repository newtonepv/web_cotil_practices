package com.example.LojaJogos.control;

import com.example.LojaJogos.Repository.JogoRepository;
import com.example.LojaJogos.model.ClienteModel;
import com.example.LojaJogos.model.JogoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/apiJogo")
public class JogoController {

    @Autowired
    JogoRepository jogoRepo;

    @PostMapping("/inserir")
    public void inserirJogo(@RequestBody JogoModel jogo){jogoRepo.save(jogo);}

    @DeleteMapping("/remover")
    public void removerJogo (@RequestBody JogoModel jogo) {jogoRepo.delete(jogo);}

    @PutMapping("/atualizar")
    public void atualizarJogo(@RequestBody JogoModel jogo){jogoRepo.save(jogo);}

    @GetMapping (value="/todos")
    public List<JogoModel> buscarTodos()
    {
        return  jogoRepo.findAll();
    }

    @GetMapping("/descricao/{descricao}")
    public List<JogoModel> buscarPorDescricao(@PathVariable(value = "descricao") String descricao){
        return jogoRepo.findByDes(descricao);
    }

    @GetMapping("/codigo/{codigo}")
    public List<JogoModel> buscarPorCodigo(@PathVariable(value = "codigo") int codigo){
        return jogoRepo.findByCodigo(codigo);
    }

    @GetMapping("/jogo/{jogo}")
    public List<JogoModel> buscarPorPreco(@PathVariable(value = "preco") double preco){
        return jogoRepo.findByPreco(preco);
    }

    @GetMapping("/empresa/{empresa}")
    public List<JogoModel> buscarPorEmpresa(@PathVariable(value = "empresa") String empresa){
        return jogoRepo.findByEmpresa(empresa);
    }

    @GetMapping ("/descricaoInicio/{descricao}")
    public List<JogoModel> listarPorInicioDes(@PathVariable(value="descricao") String descricao)
    {
        return jogoRepo.findByInicioDes(descricao);
    }

    @GetMapping ("/empresaInicio/{empresa}")
    public List<JogoModel> listarPorInicioEmp(@PathVariable(value="empresa") String empresa)
    {
        return jogoRepo.findByInicioEmp(empresa);
    }
}
