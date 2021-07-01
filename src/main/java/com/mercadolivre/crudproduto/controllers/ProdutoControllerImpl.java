package com.mercadolivre.crudproduto.controllers;

import com.mercadolivre.crudproduto.models.Produto;
import com.mercadolivre.crudproduto.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Controller
public class ProdutoControllerImpl implements ProdutoController{
    private ProdutoService produtoService;

    @Autowired
    public ProdutoControllerImpl(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @Override
    public ResponseEntity<?> criar(Produto produto, UriComponentsBuilder uriComponentsBuilder) {
        produto = produtoService.criar(produto);
       UriComponents uriComponents = uriComponentsBuilder.path("/produtos/{id}").buildAndExpand(produto.getId());
       return ResponseEntity.created(uriComponents.toUri()).build() ;
    }

    @Override
    public ResponseEntity<Produto> lerPeloId(Long id) {
        return new ResponseEntity<>(produtoService.lerPeloId(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Produto> >ler() {
        return new ResponseEntity<>(produtoService.ler(), HttpStatus.OK) ;
    }

    @Override
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(Long id) {
        produtoService.remover(id);
    }

    @Override
    public ResponseEntity<Produto> update(Long id, Produto produto) {
        return new ResponseEntity<>(produtoService.update(id, produto), HttpStatus.OK);
    }
}
