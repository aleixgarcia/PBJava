package com.company;

public class gat {
    int potes;
    String color;

    public int getPotes(){
        return potes;
    }

    public void setPotes(int p){
        this.potes =p;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String c){
        this.color = c;
    }

    public void printgats(){
        System.out.println("El seu color es: "+this.getColor()+"\nTe "+this.getPotes()+" potes");
    }
}
