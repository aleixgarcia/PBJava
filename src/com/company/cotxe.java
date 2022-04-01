package com.company;

public class cotxe {
    int portes, rodes;
    String marca, modelo;

    //get retorna (String) el valor del atributo 'marca'
    public String getMarca(){
        return this.marca;
    }
    //set asigna el valor del argumento 'String m' al atributo 'marca'
    public void setMarca(String m){
        this.marca = m;
    }

    public String getModel(){
        return this.modelo;
    }

    public void setModel(String mod){
        this.modelo=mod;
    }

    public int getPortes(){
        return this.portes;
    }

    public void setPortes(int p){
        this.portes = p;
    }

    public int getRodes(){
        return this.rodes;
    }

    public void setRodes(int r){
        this.rodes = r;
    }

    public void printcotxe(){
        System.out.println("La marca del cotxe: "+this.getMarca()+"\nEl seu model: "+this.getModel()+"\nTe "+this.getPortes()+" portes\nTe "+this.getRodes()+" rodes");
    }
}
