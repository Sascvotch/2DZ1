package ru.skypro;

public class Puffendy extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffendy(String name, String surName, int magic, int transgretion, int industriousness, int loyalty, int honesty) {
        super(name, surName, magic, transgretion);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Puffendy{" +
                "name=" + this.getName() + '\'' +
                ", surName='" + this.getSurName() + '\'' +
                ", magic=" + this.getMagic() +
                ", transgretion=" + this.getTransgretion() +
                ", industriousness=" + this.getIndustriousness() +
                ", loyalty=" +this.getLoyalty() +
                ", honesty=" + this.getHonesty() +
                '}';
    }
    public void moreHonesty (Puffendy other) {
        if (this.getHonesty() >other.getHonesty() ) {
            System.out.println(this.getName() + " " + this.getSurName() + " чеснее чем " + other.getName() +" " + other.getSurName() );
        } else {
            if (this.getHonesty() <other.getHonesty() ) {
                System.out.println(other.getName() + " " + other.getSurName() + " чеснее чем " + this.getName() + " " + this.getSurName());
            } else {
                System.out.println(other.getName() + " " + other.getSurName()+ " и " + this.getName() + " " + this.getSurName() + " одинаково чесны " );
            }

        }

    };
}
