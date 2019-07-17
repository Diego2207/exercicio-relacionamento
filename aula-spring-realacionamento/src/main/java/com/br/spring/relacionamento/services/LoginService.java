package com.br.spring.relacionamento.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jca.cci.core.InteractionCallback;
import org.springframework.stereotype.Service;

import com.br.spring.relacionamento.models.LoginModel;
import com.br.spring.relacionamento.models.UsuarioModel;
import com.br.spring.relacionamento.repositories.LoginRepository;

@Service
public class LoginService {
	@Autowired
	private LoginRepository loginRepository;
	
	public String cadastrarLogin(UsuarioModel user, LoginModel login) {
		login.setUsuario(user);
		loginRepository.save(login);
		return "Login cadastrado";
	}
}
