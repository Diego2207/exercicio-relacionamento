package com.br.spring.relacionamento.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.br.spring.relacionamento.models.LoginModel;

@Repository
public interface LoginRepository extends CrudRepository<LoginModel, Integer> {

}
