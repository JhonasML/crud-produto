package com.mercadolivre.crudproduto.services;

import com.mercadolivre.crudproduto.models.Produto;

import java.util.List;

public interface ProdutoService {
    Produto criar(Produto produto);

    Produto lerPeloId(Long id);

    List<Produto> ler();

    void remover(Long id);

    Produto update(Long id, Produto produto);
}
