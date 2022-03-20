package ru.skypro;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
	Griffindor griffindors[] ={
            new Griffindor("Гарри", "Поттер", 30,40,33,44,45 ),
            new Griffindor("Гермиона", "Грейнджер", 35,46,32,41,47 ),
            new Griffindor("Рон", "Уизли", 56,42,39,42,48 ),
    };

    Puffendy puffendys[]={
            new Puffendy("Захария", "Смит",23,34,45,56,67),
            new Puffendy("Седрик", "Диггори",23,34,45,56,67),
            new Puffendy("Джастин", "Финч-Флетчли",23,34,45,56,67),
    };
    Cogtevran cogtevrans[]={
            new Cogtevran("Чжоу","Чанг",34,32,54,67,32,56),
            new Cogtevran("Падма","Патил",34,32,54,67,32,56),
            new Cogtevran("Маркус","Белби",34,32,54,67,32,56),
    };
    Slizerin slizerins[]={
            new Slizerin("Драко","Малфой",34,45,67,89,90,34,23),
            new Slizerin("Грэхэм","Монтегю",34,45,67,89,90,34,23),
            new Slizerin("Грегори","Гойл",34,45,67,89,90,34,23),
    };
    PrintService printService=new PrintService();
    printService.print(griffindors);
    printService.print(slizerins);
    printService.print(puffendys);
    printService.print(cogtevrans);
    System.out.println(slizerins[0].toString() );
    griffindors[1].moreHonor(griffindors[2]);
    cogtevrans [0].moreMind(cogtevrans[1]);
    puffendys[2].moreHonesty(puffendys[1]);
    slizerins[1].moreAmbition(slizerins[0]);
    puffendys[0].moreMagic(slizerins[0]);
    slizerins[2].moreTransgretion(griffindors[0]);


    }
}
