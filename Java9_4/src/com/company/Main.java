package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<String> lista1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti numarul de elemente din lista 1: ");
        int l=scanner.nextInt();
        int i,s,f,p;
        String x;
        System.out.println("Introduceti elementele listei 1: ");
        scanner.nextLine();
        for (i = 0; i < l; i++){
            x=scanner.nextLine();
            lista1.add(x);
        }
        ArrayList<String> lista2 = new ArrayList<>();
        System.out.print("Introduceti numarul de elemente din lista 2: ");
        l=scanner.nextInt();
        System.out.println("Introduceti elementele listei 2: ");
        scanner.nextLine();
        for (i = 0; i < l; i++){
            x=scanner.nextLine();
            lista2.add(x);
        }
        System.out.print("Introduceti pozitia de inceput din prima lista: ");
        s=scanner.nextInt();
        System.out.print("Introduceti pozitia de final din prima lista: ");
        f=scanner.nextInt();
        System.out.print("Introduceti pozitia dupa care se face paste din a doua lista: ");
        p=scanner.nextInt();
        for(i=s;i<=f;i++)
        {
            p++;
            lista2.add(p,lista1.get(i));
            lista1.remove(i);
            i--;
            f--;
        }
        System.out.println("Elementele listei 1, in urma modificarilor, sunt: "+lista1);
        System.out.println("Elementele listei 2, in urma modificarilor, sunt: "+lista2);
    }
}