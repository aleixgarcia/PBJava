package com.company;

import java.util.Scanner;

public class Main {
    private static final String MSG_NAME = "Introdueix el teu nom: ";
    private static final String MSG_SUR = "Introdueix el teu cognom: ";
    private static final String MSG_PORTES = "Introdueix el num de portes: ";
    private static final String MSG_RODES = "Indica el num de rodes del cotxe: ";
    private static final String MSG_MARCA = "Indica la marca del cotxe: ";
    private static final String MSG_MODEL = "Indica el model del cotxe: ";
    private static final String MSG_POTES = "Introdueix el num de potes: ";
    private static final String MSG_COLOR = "Indica el color: ";
    private static final String MSG_DIM = "Indica la dimensio: ";
    private static final String MSG_COSTATS = "Indica la quantitat de costats: ";
    private static final String MSG_DIMCOST = "Introdueix la dimensio d'un costat:";
    private static final String MSG_DIMCOST2 = "Introdueix la dimensio d'un altre costat:";
    private static final String MSG_LONG = "Introdueix la longitud: ";
    private static final String MSG_ALT = "Introdueix la altura: ";
    private static final String MSG_ANCH = "Introdueix la anchura: " ;

    public static void main(String[] args) {
	// write your code here
        Person asix = new Person();
        Person daw = new Person();
        Person p = new Person();
        cotxe aleix = new cotxe();
        cotxe c = new cotxe();
        gat capicua = new gat();
        gat g = new gat();
        cadira aula = new cadira();
        cadira ca = new cadira();
        quadrat nou = new quadrat();
        quadrat q = new quadrat();
/*
        System.out.println("-------------Persona ASIX-------------");
        asix.setDni("53644949W");
        asix.setHeight(167);
        asix.setName("Aleix");
        asix.setSurname("Garcia");
        asix.setWidthPersona(92);
        asix.printNomCognom();

        System.out.println("-------------Persona DAW--------------");
        daw.setDni("53644833R");
        daw.setName("Irene");
        daw.setSurname("Zaro");
        daw.setHeight(156);
        daw.setWidthPersona(80);
        daw.printNomCognom();

        System.out.println("-------------COTXE ALEIX--------------");
        aleix.setMarca("Dacia");
        aleix.setModel("Sandero");
        aleix.setPortes(5);
        aleix.setRodes(5);
        aleix.printcotxe();

        System.out.println("-------------GATS--------------");
        capicua.setColor("Taronja");
        capicua.setPotes(3);
        capicua.printgats();

        System.out.println("-------------CADIRA--------------");
        aula.setColor("Verd");
        aula.setPotes(5);
        aula.printcadira();

        System.out.println("-------------QUADRAT--------------");
        nou.setColor("Blau");
        nou.setCostats(6);
        nou.setDimensio(60);
        nou.printquadrat();

        System.out.println("-------------PROVA--------------");
        Person alumne = new Person();
        alumne.setName("Aleix");
        System.out.println(alumne.getName());

        System.out.println("-------------PROVA SCANNER Person--------------");
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_NAME);
        p.setName(sc.next());
        System.out.println(MSG_SUR);
        p.setSurname(sc.next());
        System.out.println("El seu nom: "+p.getName()+"\nEl seu cognom: "+p.getSurname());


        System.out.println("-------------PROVA SCANNER Cotxe--------------");
        System.out.println(MSG_PORTES);
        c.setPortes(sc.nextInt());
        System.out.println(MSG_RODES);
        c.setRodes(sc.nextInt());
        System.out.println(MSG_MARCA);
        c.setMarca(sc.next());
        System.out.println(MSG_MODEL);
        c.setModel(sc.next());
        System.out.println("Te "+c.getPortes()+" portes\nAmb "+c.getRodes()+" rodes\nLa marca es "+c.getMarca()+"\nI el model "+c.getModel());


        System.out.println("-------------PROVA SCANNER gat--------------");
        System.out.println(MSG_POTES);
        g.setPotes(sc.nextInt());
        System.out.println(MSG_COLOR);
        g.setColor(sc.next());
        System.out.println("El gat te "+g.getPotes()+" potes\nEs de color "+g.getColor());


        System.out.println("-------------PROVA SCANNER cadira--------------");
        System.out.println(MSG_POTES);
        ca.setPotes(sc.nextInt());
        System.out.println(MSG_COLOR);
        ca.setColor(sc.next());
        System.out.println("Aquesta cadire te "+ca.getPotes()+" potes\nEs de color "+ca.getColor());


        System.out.println("-------------PROVA SCANNER quadrat--------------");
        System.out.println(MSG_COLOR);
        q.setColor(sc.next());
        System.out.println(MSG_DIM);
        q.setDimensio(sc.nextInt());
        System.out.println(MSG_COSTATS);
        q.setCostats(sc.nextInt());
        System.out.println("El quadrat es de color "+q.getColor()+"\nLa seva dimensio es de "+q.getDimensio()+" cm\nI te "+q.getCostats()+" costats");

        Scanner sc = new Scanner(System.in);
        System.out.println("-------------PROVA SCANNER I VALIDAR quadrat--------------");
        System.out.println(MSG_COSTATS);
        int costat = sc.nextInt();
        while (costat <= 0){
            System.out.println(MSG_COSTATS);
            costat = sc.nextInt();
        }
        q.setCostats(costat);
        System.out.println("El num de costats son: "+q.getCostats());

        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_DIMCOST);
        int costat1 = sc.nextInt();
        while (costat1 <= 0){
            System.out.println(MSG_DIMCOST);
            costat1 = sc.nextInt();
        }
        System.out.println(MSG_DIMCOST2);

        int costat2 = sc.nextInt();
        while (costat2 <= 0){
            System.out.println(MSG_DIMCOST2);
            costat2 = sc.nextInt();
        }
        int area = costat1 * costat2;
        System.out.println("El area del quadrat es de: "+area+" cm");
*/
        Scanner sc = new Scanner(System.in);
        System.out.println(MSG_LONG);
        int lon = sc.nextInt();
        while (lon <= 0){
            System.out.println(MSG_LONG);
            lon = sc.nextInt();
        }

        System.out.println(MSG_ALT);
        int alt = sc.nextInt();
        while (alt <= 0){
            System.out.println(MSG_ALT);
            alt = sc.nextInt();
        }

        System.out.println(MSG_ANCH);
        int anch = sc.nextInt();
        while (anch <= 0){
            System.out.println(MSG_ANCH);
            anch = sc.nextInt();
        }
        int volum = alt * lon * anch;
        System.out.println("El volum del quadrat es de "+volum+" cm");
    }
}
