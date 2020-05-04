package com.springboot.cursoVirtual.models.servicesImpl;

import com.springboot.cursoVirtual.models.entity.Usuario;

public interface IUsuarioService {
        
	public Usuario findByUsername(String username);
}
