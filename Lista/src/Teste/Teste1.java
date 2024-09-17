package Teste;

import ListaDupla.ListaDupla;

class DLinkedListTest {

    public static void main(String[] args) {
        System.out.println("Teste 1: Adicionar elementos e imprimir");
        ListaDupla lista1 = new ListaDupla();
        lista1.adicionar("A");
        lista1.adicionar("B");
        lista1.adicionar("C");
        lista1.imprimir(); // Esperado: A B C
        lista1.imprimirReverso(); // Esperado: C B A

        System.out.println("Teste 2: Remover um elemento do meio e imprimir");
        lista1.remover("B");
        lista1.imprimir(); // Esperado: A C
        lista1.imprimirReverso(); // Esperado: C A

        System.out.println("Teste 3: Remover o primeiro e o último elemento e imprimir");
        lista1.remover("A");
        lista1.remover("C");
        lista1.imprimir(); // Esperado: (vazio)
        lista1.imprimirReverso(); // Esperado: (vazio)

        System.out.println("Teste 4: Adicionar elementos novamente e remover o último");
        lista1.adicionar("X");
        lista1.adicionar("Y");
        lista1.adicionar("Z");
        lista1.imprimir(); // Esperado: X Y Z
        lista1.imprimirReverso(); // Esperado: Z Y X
        lista1.remover("Z");
        lista1.imprimir(); // Esperado: X Y
        lista1.imprimirReverso(); // Esperado: Y X

        System.out.println("Teste 5: Adicionar elementos e remover o único elemento");
        ListaDupla lista2 = new ListaDupla();
        lista2.adicionar("1");
        lista2.imprimir(); // Esperado: 1
        lista2.imprimirReverso(); // Esperado: 1
        lista2.remover("1");
        lista2.imprimir(); // Esperado: (vazio)
        lista2.imprimirReverso(); // Esperado: (vazio)
    }
}