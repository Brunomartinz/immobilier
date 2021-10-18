package com.ninjastech.immobilier.resources;

import com.ninjastech.immobilier.entities.Produto;
import com.ninjastech.immobilier.entities.Usuario;
import com.ninjastech.immobilier.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/user")
@ComponentScan(basePackages = { "com.*" })
public class UsuarioResource {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping("/allUsers")
    @ResponseBody
    public String getUsers() {
        return "{\"users\":[{\"name\":\"Lucas\", \"country\":\"Brazil\"}," +
                "{\"name\":\"Jackie\",\"country\":\"China\"}]}";
    }
   
   @GetMapping(value = "/pesquisa/{email}")
	public ResponseEntity<List<Usuario>> findEmail(@PathVariable String email) {
		List<Usuario> list = usuarioService.findEmail(email);
		return ResponseEntity.ok().body(list);
   }
   
    @GetMapping
    public ResponseEntity<List<Usuario>> findAll() {
        List<Usuario> list = usuarioService.listAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Usuario> insert(@RequestBody Usuario obj) {
        obj = usuarioService.insertUsuario(obj);
        return ResponseEntity.ok().body(obj);
    }
    
	@PostMapping(value = "/excluir")
	public void deleteUser(@Valid @RequestBody Usuario obj) {
                    usuarioService.deletUser(obj);
	}

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Long id) {
        Usuario obj = usuarioService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

	@PostMapping(value = "/editar")
	public ResponseEntity<Usuario> edit(@Valid @RequestBody Usuario obj) {
        obj = usuarioService.editUsuario(obj);
        return ResponseEntity.ok().body(obj);
    }



}
