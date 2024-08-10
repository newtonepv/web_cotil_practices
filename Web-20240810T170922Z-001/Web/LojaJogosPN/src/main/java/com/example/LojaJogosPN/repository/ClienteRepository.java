package com.example.LojaJogosPN.repository;
import com.example.LojaJogosPN.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
    /*
    @Query(value="select c from Cliente c where c.nome like %?1%")
    public List<Cliente> findByNome (String nome);
    @Query(value="select c from Cliente c where c.codigo = ?1")
    public List<Cliente> findByCodigo (int codigo);
    @Query(value="select c from Cliente c where c.email like ?1%")
    public List<Cliente> findByEmail (String email);


    @Query(value = "select a from Cliente a where a.nome like %?1%")
    public List<Cliente> findByLetra (String nome);
    @Query(value="select c.nome from Cliente c where c.codigo > ?1")
    public List<Cliente> findByMaiorCodigo (int codigo);
    @Query(value="select c.nome from Cliente c where c.email like %?1%")
    public List<Cliente> findByInicioEmail (String email);
    */

}
