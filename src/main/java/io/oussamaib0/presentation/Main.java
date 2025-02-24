package io.oussamaib0.presentation;

import io.oussamaib0.dao.IDao;
import io.oussamaib0.dao.impl.Dao;
import io.oussamaib0.metier.IMetier;
import io.oussamaib0.metier.impl.Metier;

public class Main {
    public static void main(String[] args) {
        IDao daoImp = new Dao();
        IMetier metier = new Metier(daoImp);

        System.out.println("results = " + metier.calcul());
    }
}
