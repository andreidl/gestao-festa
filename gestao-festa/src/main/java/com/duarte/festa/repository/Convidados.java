package com.duarte.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duarte.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
