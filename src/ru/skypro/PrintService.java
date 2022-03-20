package ru.skypro;

import java.lang.reflect.Array;

public class PrintService {

    public void print (Hogwarts [] hogwarts) {
              for (int i=0; i< hogwarts.length; i++){
                  System.out.println(hogwarts[i].toString());
             }
    }
    public void print (Griffindor [] griffindors) {
       System.out.println("Студенты Грифиндора:");
        for (int i=0; i< griffindors.length; i++){
            System.out.println(griffindors[i].toString());
        }
        System.out.println();
    }
    public void print (Cogtevran [] cogtevrans) {
        System.out.println("Студенты Когтеврана:");
        for (int i=0; i< cogtevrans.length; i++){
            System.out.println(cogtevrans[i].toString());
        }
        System.out.println();
    }

    public void print (Puffendy [] puffendies) {
        System.out.println("Студенты Пуфендуя:");
        for (int i=0; i< puffendies.length; i++){
            System.out.println(puffendies[i].toString());
        }
        System.out.println();
    }
    public void print (Slizerin [] slizerins) {
        System.out.println("Студенты Слизерина:");
        for (int i=0; i< slizerins.length; i++){
            System.out.println(slizerins[i].toString());
        }
        System.out.println();
    }
}
