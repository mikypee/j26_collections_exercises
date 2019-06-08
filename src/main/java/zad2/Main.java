package zad2;

import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        List<Integer> listA = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int liczbaZaladowana = random.nextInt(1000);
            listA.add(liczbaZaladowana);

        }
        List<Integer> listB = new ArrayList(listA);
        // listB.addAll(listaA);   alternatywa dla kopiowania elementow z listy a do b
        for (int i = 0; i < 10; i++) {
            int liczbaZaladowana = random.nextInt(1000);
            listB.add(liczbaZaladowana);

        }
        System.out.println(listB);
        double suma = 0.0;
        for (Integer elementListy : listB) {
            suma += elementListy;
        }

        System.out.println("Suma: " + suma);
        System.out.println("Srednia wszystkich elementow to :" + (suma / listB.size()));



        Collections.sort(listB);
        System.out.println("sorted B :" + listB);

        if (listB.size() % 2 == 0) { //parzysta
            int indeksLewySrodkowy = (listB.size()/2) - 1;
            int indeksPrawySrodkowy = (listB.size()/2);

            double mediana = (listB.get(indeksLewySrodkowy)+ listB.get(indeksPrawySrodkowy))/2.0;
            System.out.println("Mediana :" + mediana);
        } else {
            int indeksSrodkowy = (listB.size()/2);
            int mediana = listB.get(indeksSrodkowy);
            System.out.println("Mediana :" + mediana);

        }
        int min = listA.get(0);
        int max = listA.get(0);
        for (Integer elementListy : listA){
            if (min > elementListy){
                min = elementListy;
            }
        }
        for (Integer elementListy : listA){
            if (max < elementListy){
                max = elementListy;
            }
        }
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);

        // znajdowanie indeksu min i max elemenetu
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i <listA.size(); i++){
            if (max == listA.get(i)) {
                indexMax = i;
            }
            if (min == listA.get(i)){
                indexMin = i;
            }
        }

        System.out.println("index max : " + indexMax);
        System.out.println("index min : " + indexMin);

        System.out.println("index max (indexof) : " + listA.indexOf(max));
        System.out.println("index min (indexof) : " + listA.indexOf(min));
    }



}


