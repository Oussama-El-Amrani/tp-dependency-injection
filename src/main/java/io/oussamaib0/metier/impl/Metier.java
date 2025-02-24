package io.oussamaib0.metier.impl;

import io.oussamaib0.dao.IDao;
import io.oussamaib0.metier.IMetier;

public class Metier implements IMetier {
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
