package io.oussamaib0.presentation;

import io.oussamaib0.dao.IDao;
import io.oussamaib0.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class SuperMain {
    public static void main(String[] args) {
        try {
            var scanner = new Scanner(new File("config-app"));
            var daoClassname = scanner.nextLine();

            var cDao = Class.forName(daoClassname);
            var dao = (IDao) cDao.getConstructor().newInstance();

            var metierClassname = scanner.nextLine();

            var cMetier = Class.forName(metierClassname);
            var metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

            System.out.println("results = " + metier.calcul());
        } catch (ClassNotFoundException | NoSuchMethodException | FileNotFoundException | InstantiationException |
                 IllegalAccessException | InvocationTargetException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
