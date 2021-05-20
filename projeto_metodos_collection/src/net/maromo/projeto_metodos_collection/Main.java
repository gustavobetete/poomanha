package net.maromo.projeto_metodos_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List lista = new ArrayList();
        lista.add("Maromo");
        lista.add(1);
        lista.add(System.currentTimeMillis());
        lista.add(new Object());
        lista.add("Maromo");
        lista.add(12.8);
        lista.add(100);
        System.out.println("Qtd de elementos na lista: " + lista.size());
        //Varrer os 06 itens - mostrando na tela
        for (int i = 0; i <lista.size() ; i++) {
            System.out.println(lista.get(i));
        }
        //for each
        System.out.println();
        for (Object x: lista) {
            System.out.println(x);
        }
        //
        System.out.println();
        Iterator o = lista.iterator();
        while(o.hasNext()){
            System.out.println(o.next());
        }
        boolean tem = lista.contains("Maromo");
        System.out.println(tem);

        while(lista.contains("Maromo")){
            lista.remove("Maromo");
        }
        lista.remove(Integer.valueOf(100));
        System.out.println("Lista sem Maromo e sem o 100");
        for (Object x: lista) {
            System.out.println(x);
        }

    }
}
