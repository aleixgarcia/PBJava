package com.company;

public class cadira {
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

    public void printcadira(){
        System.out.println("El color de la cadira es: "+this.getColor()+"\nTe "+this.getPotes()+" potes");
    }
}
