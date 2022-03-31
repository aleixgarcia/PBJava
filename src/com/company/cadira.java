package com.company;

public class cadira {
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
        color="marro";
        return color;
    }

    public void setColor(String c){
        this.color = c;
    }

    public void printcadira(){
        System.out.println("El color de la cadira es: "+getColor()+"\nTe "+getPotes()+" potes");
    }
}
