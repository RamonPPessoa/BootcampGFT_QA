package br.com.dio.collectionjava.set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {


        System.out.println("Crie um conjunto  adicionando as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7.0, 9.5, 8.5, 5d, 7d, 2d, 4.5));
        System.out.println(notas.toString());

        // TRABALHANDONCOM SET NÃO É POSSIVEL FAZER A BUSCA POR POSIÇÃO PRINCIPALMENTE NO HASHSET E NÃO E POSSIVEL TRABALHAR COM POSIÇÃO

        System.out.println("Verificando se a nota 8.5 faz parte do conjunto: " + notas.contains(8.5));
        System.out.println("Exibindo a menor nota" + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exibindo a soma das notas: " + soma);
        System.out.println("Exibindo a média das notas: " + (soma/ notas.size()));
        notas.remove(9.5);
        System.out.println(notas);


        System.out.println("Removendo  notas menores que 7 : ");
        Iterator<Double> menorNota = notas.iterator();
        while(menorNota.hasNext()){
            Double next = menorNota.next();
            if (next < 7) menorNota.remove();
        }
        System.out.println(notas);

        System.out.println("Exibindo todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exibindo  as notas em ordem crescente: ");
        Set<Double> notasCrescente = new TreeSet<>(notas2);
        System.out.println(notasCrescente);

        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " + notasCrescente.isEmpty());


    }
}
