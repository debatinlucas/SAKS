package br.com.saks.emprestimoservice.service;

import br.com.saks.emprestimoservice.model.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="usuario-service")
public interface UsuarioService {
    @GetMapping(value = "/usuarios/{idUsuario}")
    Usuario listarPeloId (@PathVariable("idUsuario") Long idUsuario);
}
