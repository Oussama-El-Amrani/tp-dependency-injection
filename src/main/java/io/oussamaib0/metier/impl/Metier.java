package io.oussamaib0.metier.impl;

import io.oussamaib0.dao.IDao;
import io.oussamaib0.dao.impl.Dao;
import io.oussamaib0.metier.IMetier;

public class Metier implements IMetier {
    private IDao dao = new Dao();

    @Override
    public Long calcul() {
        System.out.println("calcule");
        return dao.getData() * 10_00;
    }
}
