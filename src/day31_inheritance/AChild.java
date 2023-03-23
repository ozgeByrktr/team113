package day31_inheritance;

import day30_inheritance.GGrandParent;

public class AChild extends GGrandParent {
    String childStr;

    AChild(){
        super();
        System.out.println("Child class constructor calıstı");
    }

    public static void main(String[] args) {
        AChild objeChild=new AChild();


    }
}
