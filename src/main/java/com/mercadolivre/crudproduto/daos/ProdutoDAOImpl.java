package com.mercadolivre.crudproduto.daos;

import com.mercadolivre.crudproduto.models.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class ProdutoDAOImpl implements ProdutoDAO{
    private Map<Long, Produto> db;
    private Random idGen;

    public ProdutoDAOImpl() {
        db = new ConcurrentHashMap<>();
        idGen = new Random();
    }

    @Override
    public Produto persistir(Produto produto) {
        Long id = idGen.nextLong();
        produto.setId(id);
        db.put(id, produto);
        return produto;
    }

    @Override
    public List<Produto> get() {
        return new ArrayList<>(db.values());
    }

    @Override
    public Produto getById(Long id) {
        return db.get(id);
    }

    @Override
    public void remove(Long id) {
        db.remove(id);
    }

    @Override
    public Produto update(Long id, Produto produto) {
        produto.setId(id);
        db.put(id, produto);
        return db.get(id);
    }
}
