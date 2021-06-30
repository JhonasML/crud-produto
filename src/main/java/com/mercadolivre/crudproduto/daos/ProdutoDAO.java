package com.mercadolivre.crudproduto.daos;

import com.mercadolivre.crudproduto.models.Produto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProdutoDAO {
    Produto persistir(Produto produto);

    List<Produto> get();

    Produto getById(Long id);

    void remove(Long id);

    Produto update(Long id, Produto produto);
}
