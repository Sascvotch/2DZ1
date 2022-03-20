package ru.skypro;

public class Hogwarts {
    private  String name;
    private   String surName;
    private   int magic;
    private  int transgretion;

    public Hogwarts(String name, String surName, int magic, int transgretion) {
        this.name = name;
        this.surName = surName;
        this.magic = magic;
        this.transgretion = transgretion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgretion() {
        return transgretion;
    }

    public void setTransgretion(int transgretion) {
        this.transgretion = transgretion;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name=" + this.getName() + '\'' +
                ", surName='" + this.getSurName() + '\'' +
                ", magic=" + this.getMagic() +
                ", transgretion=" + this.getTransgretion() +
                '}';
    }

    public void moreMagic (Hogwarts other) {
        if (this.getMagic() > other.getMagic()) {
            System.out.println(this.getName() + " " + this.getSurName() + " магически сильнее чем " + other.getName() + " " + other.getSurName());
        } else {
            if (this.getMagic() < other.getMagic()) {
                System.out.println(other.getName() + " " + other.getSurName() + " магически сильнее чем " + this.getName() + " " + this.getSurName());
            } else {
                System.out.println(other.getName() + " " + other.getSurName() + " и " + this.getName() + " " + this.getSurName() + " одинаково магически сильны");
            }

        }
    }
    public void moreTransgretion (Hogwarts other) {
        if (this.getTransgretion() > other.getTransgretion()) {
            System.out.println(this.getName() + " " + this.getSurName() + " имеет расстояние трансгресии больше чем " + other.getName() + " " + other.getSurName());
        } else {
            if (this.getTransgretion() < other.getTransgretion()) {
                System.out.println(other.getName() + " " + other.getSurName() + " имеет расстояние трансгресии больше чем " + this.getName() + " " + this.getSurName());
            } else {
                System.out.println(other.getName() + " " + other.getSurName() + " и " + this.getName() + " " + this.getSurName() + " имеют одинаоквое расстояние трансгресии");
            }

        }
    }

    }
