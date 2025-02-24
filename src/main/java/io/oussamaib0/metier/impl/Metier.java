package io.oussamaib0.metier.impl;

import io.oussamaib0.dao.IDao;
import io.oussamaib0.metier.IMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class Metier implements IMetier {
    @Autowired
    private final IDao dao;

    public Metier(IDao daoImpl) {
        dao = daoImpl;
    }

    @Override
    public Long calcul() {
        Long results = dao.getData() * 10_00;
        return results;
    }
}
