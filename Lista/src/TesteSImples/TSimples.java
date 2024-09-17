package TesteSImples;

import Simples.SimplesE;

public class TSimples {

    public static void main(String[] args) {
        System.out.println("Teste 1: Adicionar elementos e imprimir");
        TSimples lista = new TSimples();
        lista.adicionar("A");
        lista.adicionar("B");
        lista.adicionar("C");
        lista.imprimir(); // Esperado: A B C

        System.out.println("Teste 2: Remover um elemento e imprimir");
        lista.remover("B");
        lista.imprimir(); // Esperado: A C

        System.out.println("Teste 3: Remover o primeiro elemento e imprimir");
        lista.remover("A");
        lista.imprimir(); // Esperado: C

        System.out.println("Teste 4: Remover o último elemento e imprimir");
        lista.remover("C");
        lista.imprimir(); // Esperado: (vazio)

        System.out.println("Teste 5: Adicionar elementos e imprimir novamente");
        lista.clone("X");
        lista.clone("Y");
        lista.clone("Z");
        lista.imprimir(); // Esperado: X Y Z
    }
}