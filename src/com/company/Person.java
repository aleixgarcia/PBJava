package com.company;
import java.util.Scanner;
/*
public class Person {
    String nom,cognom;

    public String getNom(){
        return this.nom;
    }

    public String getCognom(){
        return this.cognom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setCognom(String cognom){
        this.cognom = cognom;
    }

    public void printNomCognom(){
        System.out.println(this.getNom()+" "+this.getCognom());
    }

}*/

/*String es un objeto, asi que empieza por mayus*/

public class Person {
    String name, surname,dni;
    float height, widthPersona;



    /*getter retorna, asi que se indica tipo de dato*/
    /*name*/
    public String getName(){

        return this.name;
    }

    public void setName(String n){
        this.name= n;
    }

    /*surname*/
    public String getSurname(){

        return this.surname;
    }

    public void setSurname(String s){
        this.surname=s;
    }

    /*dni*/
    public String getDni(){

        return this.dni;
    }

    public void setDni(String d){
        this.dni=d;
    }

    /*height*/
    public float getHeight(){

        return this.height;
    }

    public void setHeight(float h){
        this.height=h;
    }

    /*widthPersona*/
    public float getWidthPersona(){

        return this.widthPersona;
    }

    public void setWidthPersona(float w){
        this.widthPersona=w;
    }


    /*Printar los datos*/
    public void printNomCognom(){
        System.out.println("El seu nom es: "+this.getName()+"\nEl seu cognom: "+this.getSurname()+"\nEl seu DNI: "+this.getDni()+"\nLa seva altura: "+this.getHeight()+"\nSu cadera: "+this.getWidthPersona());
    }
}


