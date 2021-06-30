package com.mercadolivre.crudproduto.controllers;

import com.mercadolivre.crudproduto.models.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/produtos")
public interface ProdutoController {

    @PostMapping
    @ResponseBody
    Produto criar(@RequestBody Produto produto);

    @GetMapping(path = "/{id}")
    @ResponseBody
    Produto lerPeloId(@PathVariable Long id);

    @GetMapping
    @ResponseBody
    List<Produto> ler();

    @DeleteMapping(path = "/{id}")
    void remover(@PathVariable Long id);

    @PutMapping(path = "/{id}")
    @ResponseBody
    Produto update(@PathVariable Long id, @RequestBody Produto produto);

}
