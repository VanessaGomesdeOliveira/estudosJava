package com.itau.spring02.repository;

import java.util.List;

import com.itau.spring02.model.Usuario;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepo extends CrudRepository<Usuario, Long> {
    public List<Usuario> findAllByOrderByNome();

    // consulta nativa no BD, diretamente em SQL
    @Query(value = "select * from tb_usuario where id = ?", nativeQuery = true)
    public Object buscaUsuario(long id);

}
