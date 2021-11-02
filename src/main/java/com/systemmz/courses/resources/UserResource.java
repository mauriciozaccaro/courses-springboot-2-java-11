package com.systemmz.courses.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.systemmz.courses.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping // Indica que o método responde a uma requisição GET do HTTP... traz no "localhost:8080/users" um JSON do usuario "u"
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L, "Mauricio Neto", "neto.mauricio@unemat.br", "(66) 3439-5931", "264492");
		return ResponseEntity.ok().body(u);
		
	}
	
}
