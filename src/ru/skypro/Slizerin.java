package ru.skypro;

public class Slizerin extends Hogwarts{
    private  int cunning;
    private  int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;


    public Slizerin(String name, String surName, int magic, int transgretion, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surName, magic, transgretion);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Slizerin{" +
                "name=" + this.getName() + '\'' +
                ", surName='" + this.getSurName() + '\'' +
                ", magic=" + this.getMagic() +
                ", transgretion=" + this.getTransgretion() +
                ", cunning=" + this.getCunning() +
                ", determination=" + this.getDetermination() +
                ", ambition=" + this.getAmbition() +
                ", resourcefulness=" + this.getResourcefulness() +
                ", lustForPower=" + this.getLustForPower() +
                '}';
    }
    public void moreAmbition (Slizerin other) {
        if (this.getAmbition() >other.getAmbition() ) {
            System.out.println(this.getName() + " " + this.getSurName() + " амбициознее чем " + other.getName() +" " + other.getSurName() );
        } else {
            if (this.getAmbition() <other.getAmbition() ) {
                System.out.println(other.getName() + " " + other.getSurName() + " амбициознее чем " + this.getName() + " " + this.getSurName());
            } else {
                System.out.println(other.getName() + " " + other.getSurName()+ " и " + this.getName() + " " + this.getSurName() + " одинаково амбициозны " );
            }

        }

    };
}
