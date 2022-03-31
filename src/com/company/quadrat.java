package com.company;

public class quadrat {
    int dimensio,costats;
    String color;

    public String getColor(){
        color = "blau";
        return color;
    }

    public void setColor(String c){
        this.color = c;
    }

    public int getDimensio(){
        dimensio = 40;
        return dimensio;
    }

    public void setDimensio(int d){
        this.dimensio = d;
    }

    public int getCostats(){
        costats = 4;
        return costats;
    }

    public void setCostats(int c){
        this.costats = c;
    }

    public void printquadrat(){
        System.out.println("El color del quadrat es: "+this.getColor()+"\nTe "+this.getCostats()+" costats\nLa seva dimensio es de: "+this.getDimensio()+" cm");
    }

}
