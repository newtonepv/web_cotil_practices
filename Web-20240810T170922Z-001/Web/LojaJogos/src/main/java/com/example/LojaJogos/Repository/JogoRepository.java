package com.example.LojaJogos.Repository;

import com.example.LojaJogos.control.JogoController;
import com.example.LojaJogos.model.ClienteModel;
import com.example.LojaJogos.model.JogoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JogoRepository extends JpaRepository <JogoModel, Integer>{



    @Query(value = "select j from JogoModel j where j.descricao like %?1%")
    public List<JogoModel> findByDes (String descricao);

    @Query (value = "select j from JogoModel j where j.codigo = ?1")
    public List<JogoModel> findByCodigo (int codigo);

    @Query (value = "select j from JogoModel j where j.preco = ?1")
    public List<JogoModel> findByPreco (double preco);

    @Query (value = "select j from JogoModel j where j.empresa like %?1%")
    public List<JogoModel> findByEmpresa (String empresa);

    @Query (value = "select j from JogoModel j where j.descricao like %?1%")
    public List<JogoModel> findByInicioDes (String descricao);

    @Query (value = "select j from JogoModel j where j.empresa like %?1%")
    public List<JogoModel> findByInicioEmp (String empresa);


}
