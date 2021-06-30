package com.mercadolivre.crudproduto.services;

import com.mercadolivre.crudproduto.daos.ProdutoDAO;
import com.mercadolivre.crudproduto.models.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private ProdutoDAO produtoDAO;

    @Autowired
    public ProdutoServiceImpl(ProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }

    @Override
    public Produto criar(Produto produto) {
        return produtoDAO.persistir(produto);
    }

    @Override
    public Produto lerPeloId(Long id) {
        return produtoDAO.getById(id);
    }

    @Override
    public List<Produto> ler() {
        return produtoDAO.get();
    }

    @Override
    public void remover(Long id) {
        produtoDAO.remove(id);
    }

    @Override
    public Produto update(Long id, Produto produto) {
        return produtoDAO.update(id, produto);
     }
}
