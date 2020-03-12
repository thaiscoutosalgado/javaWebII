package com.example.demo.resoucer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Categoria;
import com.example.demo.service.CategoriaService;




@RestController
@RequestMapping("/categoria")
public class CategoriaResoucer {

	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Categoria>> searchAll(){
		List<Categoria> searchAll = service.searchAll();
		
		return ResponseEntity.ok().body(searchAll);	}
}
