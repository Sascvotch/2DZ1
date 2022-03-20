package ru.skypro;

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, String surName, int magic, int transgretion, int nobility, int honor, int bravery) {
        super(name, surName, magic, transgretion);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Griffindor{" +
                "name=" + this.getName() + '\'' +
                ", surName='" + this.getSurName() + '\'' +
                ", magic=" + this.getMagic() +
                ", transgretion=" + this.getTransgretion() +
                ", nobility=" + this.getNobility() +
                ", honor=" + this.getHonor() +
                ", bravery=" + this.getBravery() +
                '}';
    }


    public void moreHonor (Griffindor other) {
        if (this.getHonor() >other.getHonor() ) {
            System.out.println(this.getName() + " " + this.getSurName() + " благороднее чем " + other.getName() +" " + other.getSurName() );
        } else {
            if (this.getHonor() <other.getHonor() ) {
                System.out.println(other.getName() + " " + other.getSurName() + " благороднее чем " + this.getName() + " " + this.getSurName());
            } else {
                System.out.println(other.getName() + " " + other.getSurName()+ " и " + this.getName() + " " + this.getSurName() + " одинаково благородны " );
            }

        }

    };
}
