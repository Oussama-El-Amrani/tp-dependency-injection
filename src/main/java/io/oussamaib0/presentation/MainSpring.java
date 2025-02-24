package io.oussamaib0.presentation;

import io.oussamaib0.metier.IMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("config.xml");
        var metier = (IMetier) context.getBean("metier");
        System.out.println("results = " + metier.calcul());
    }
}
