package com.example.LojaJogos.Repository;

import com.example.LojaJogos.control.ClienteController;
import com.example.LojaJogos.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository <ClienteModel, Integer> {

    @Query (value = "select c from ClienteModel c where c.nome like ?1%")
    public List<ClienteModel> findByNome (String nome);

    @Query (value = "select c from ClienteModel c where c.codigo = ?1")
    public List<ClienteModel> findByCodigo (int codigo);

    @Query (value = "select c from ClienteModel c where c.email like ?1%")
    public List<ClienteModel> findByEmail (String email);

    @Query (value = "select c from ClienteModel c where c.nome like %?1%")
    public List<ClienteModel> findByInicioNome (String nome);

    @Query (value = "select c from ClienteModel c where c.codigo > ?1")
    public List<ClienteModel> findByCodigoMaior (int codigo);
}
