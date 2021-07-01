package com.mercadolivre.crudproduto.controllers;

import com.mercadolivre.crudproduto.models.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RequestMapping("/produtos")
public interface ProdutoController {

    @PostMapping
    ResponseEntity<?> criar(@RequestBody Produto produto, UriComponentsBuilder uriComponentsBuilder);

    @GetMapping(path = "/{id}")
    ResponseEntity<Produto> lerPeloId(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<Produto>> ler();

    @DeleteMapping(path = "/{id}")
    void remover(@PathVariable Long id);

    @PutMapping(path = "/{id}")
    ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody Produto produto);

}
