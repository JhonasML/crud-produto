package com.mercadolivre.crudproduto.controllers;

import com.mercadolivre.crudproduto.models.Produto;
import com.mercadolivre.crudproduto.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Controller
public class ProdutoControllerImpl implements ProdutoController{
    private ProdutoService produtoService;

    @Autowired
    public ProdutoControllerImpl(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @Override
    @ResponseStatus(HttpStatus.CREATED)
    public Produto criar(Produto produto) {
        return produtoService.criar(produto);
    }

    @Override
    @ResponseStatus(HttpStatus.OK)
    public Produto lerPeloId(Long id) {
        return produtoService.lerPeloId(id);
    }

    @Override
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> ler() {
        return produtoService.ler();
    }

    @Override
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(Long id) {
        produtoService.remover(id);
    }

    @Override
    @ResponseStatus(HttpStatus.OK)
    public Produto update(Long id, Produto produto) {
        return produtoService.update(id, produto);
    }
}
