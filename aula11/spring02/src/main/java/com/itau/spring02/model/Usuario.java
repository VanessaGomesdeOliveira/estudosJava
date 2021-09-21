package com.itau.spring02.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // esta classe será mapeada no Banco de Dados
@Table(name = "tb_usuario") // nome da tabela no MySql
public class Usuario {

    @Id // será a chave primária
    // o BD gera esse código automaticamente em sequencia: 1, 2, 3
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome", length = 200, nullable = false)
    private String nome;
    @Column(name = "email", length = 80, nullable = false, unique = true)
    private String email;

    // um usuario pode ter vários carros
    @OneToMany(mappedBy = "proprietario")
    @JsonIgnoreProperties("proprietario")
    private List<Carro> carros;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

}
