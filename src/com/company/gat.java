package com.company;

public class gat {
    int potes;
    String color;

    public int getPotes(){
        potes=3;
        return potes;
    }

    public void setPotes(int p){
        this.potes =p;
    }

    public String getColor(){
        color="taronja";
        return color;
    }

    public void setColor(String c){
        this.color = c;
    }

    public void printgats(){
        System.out.println("El seu color es: "+getColor()+"\nTe "+getPotes()+" potes");
    }
}
