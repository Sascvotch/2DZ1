package ru.skypro;

public class Cogtevran extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Cogtevran(String name, String surName, int magic, int transgretion, int mind, int wisdom, int wit, int creation) {
        super(name, surName, magic, transgretion);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return "Cogtevran{" +
                "name=" + this.getName() + '\'' +
                ", surName='" + this.getSurName() + '\'' +
                ", magic=" + this.getMagic() +
                ", transgretion=" + this.getTransgretion() +
                ", mind=" + this.getMind() +
                ", wisdom=" + this.getMagic() +
                ", wit=" + this.getWit() +
                ", creation=" + this.getCreation() +
                '}';
    }
    public void moreMind (Cogtevran other) {
        if (this.getMind() >other.getMind() ) {
            System.out.println(this.getName() + " " + this.getSurName() + " умнее чем " + other.getName() +" " + other.getSurName() );
        } else {
            if (this.getMind() <other.getMind() ) {
                System.out.println(other.getName() + " " + other.getSurName() + " умнее чем " + this.getName() + " " + this.getSurName());
            } else {
                System.out.println(other.getName() + " " + other.getSurName()+ " и " + this.getName() + " " + this.getSurName() + " одинаково умны " );
            }

        }

    };
}
