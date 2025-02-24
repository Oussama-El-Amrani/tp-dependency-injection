package io.oussamaib0.presentation;

import io.oussamaib0.metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpringAnnotation {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("io.oussamaib0");
        var metier = (IMetier) context.getBean("metier");
        System.out.println("results = " + metier.calcul());
    }
}
