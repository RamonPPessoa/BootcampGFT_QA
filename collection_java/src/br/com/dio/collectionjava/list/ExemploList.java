package br.com.dio.collectionjava.list;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as 7 notas");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.0);
        notas.add(7d);
        notas.add(5.5);
        notas.add(9.0);
        notas.add(8.5);

        System.out.println(notas);
        System.out.println(notas.toString());

        System.out.println(" Exiba a posição da nota 8.5 :  " + notas.indexOf(8.5));
        System.out.println("Adcione na lista a nota 10.0 na posição4: ");
        notas.add(4,10.0);
        System.out.println(notas);
        System.out.println(" substitua a nota 5.5 pela nota 9.5");
        notas.set(notas.indexOf(5.5),9.5);
        System.out.println(notas);

        System.out.println("COnfira se a nota 9.5 esta na lista: " + notas.contains(9.5));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota: notas) {
            System.out.println(nota);

        }

        System.out.println(" Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas);

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println(notas);

        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println(notas);

        System.out.println("Exiba a soma dos valores");
        Iterator<Double> iterator = notas.iterator();
         Double soma =0d; // ou 0.0
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println(" Exibida a soma dos valores: " + soma);
        System.out.println(" Exibida a soma dos valores: " + soma/ notas.size());
        System.out.println(" Remova a nota 7.0");
        notas.remove(7.0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 8.0 e exiba a lista");
        Iterator<Double> elimina = notas.iterator();
        while (elimina.hasNext()){
            Double next = elimina.next();
            if (next < 8.0)elimina.remove();
        }

        System.out.println(notas);

        System.out.println("Apague todas as notas da lista");

        notas.clear();

        System.out.println(notas);

        System.out.println(" A lsita está vazia? " + notas.isEmpty());





    }
}
