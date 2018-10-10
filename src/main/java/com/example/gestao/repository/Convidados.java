package com.example.gestao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gestao.model.Convidado;

//indica o modelo de dados que a classe vai trabalhar e o tipo da chave primária
public interface Convidados extends JpaRepository <Convidado,Long> {

}
