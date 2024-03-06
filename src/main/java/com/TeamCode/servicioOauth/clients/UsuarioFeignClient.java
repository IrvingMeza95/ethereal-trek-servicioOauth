package com.TeamCode.servicioOauth.clients;

import com.TeamCode.servicioOauth.models.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="gestionEmpCli")
public interface UsuarioFeignClient {
	@GetMapping("/auth/{param}")
	Usuario buscar(@RequestParam String param);
	@PutMapping("/auth/{param}")
	Usuario editar(@RequestBody Usuario usuario, @PathVariable String param);
}
