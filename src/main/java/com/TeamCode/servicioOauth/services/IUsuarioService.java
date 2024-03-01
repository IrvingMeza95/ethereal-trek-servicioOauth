package com.TeamCode.servicioOauth.services;

import com.TeamCode.servicioOauth.models.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
	
	public Usuario update(Usuario usuario, String id);

}
