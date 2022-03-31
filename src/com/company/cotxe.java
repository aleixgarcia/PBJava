package com.company;

public class cotxe {
    int portes, rodes;
    String marca, modelo;

    public String getMarca(){
        marca="dacia";
        return this.marca;
    }

    public void setMarca(String m){
        this.marca = m;
    }

    public String getModel(){
        modelo = "sandero";
        return this.modelo;
    }

    public void setModel(String mod){
        this.modelo=mod;
    }

    public int getPortes(){
        portes = 5;
        return this.portes;
    }

    public void setPortes(int p){
        this.portes = p;
    }

    public int getRodes(){
        rodes = 4;
        return this.rodes;
    }

    public void setRodes(int r){
        this.rodes = r;
    }

    public void printcotxe(){
        System.out.println(getMarca()+"\n"+getModel()+"\n"+getPortes()+"\n"+getRodes());
    }
}
