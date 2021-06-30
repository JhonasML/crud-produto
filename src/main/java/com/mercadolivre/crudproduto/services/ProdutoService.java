package com.mercadolivre.crudproduto.services;

import com.mercadolivre.crudproduto.models.Produto;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ProdutoService {
    Produto criar(@RequestBody Produto produto);

    Produto lerPeloId(@PathVariable Long id);

    List<Produto> ler();

    void remover(@PathVariable Long id);

    Produto update(@PathVariable Long id, @RequestBody Produto produto);
}
