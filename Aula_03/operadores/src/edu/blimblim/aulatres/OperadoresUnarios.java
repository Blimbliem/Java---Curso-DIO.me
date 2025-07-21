package edu.blimblim.aulatres;

public class OperadoresUnarios{
public static void main(String[] args) {
    int numero = 5;
    System.out.println(- numero);  
    System.out.println(numero);  

    numero = - numero;
    System.out.println(numero);  

    // somar não torna o numero positivo;
    numero = + numero;
    System.out.println(numero);

    //multiplica-lo por '-1' sim
    numero = numero * -1;
    System.out.println(numero);

    // incrementos - repetições
    numero++;
    //é a mesma coisa que:
    //numero = numero +1;
    System.out.println(numero);

    //rodar em modo debug para ver us prefixos e sufixos de incremento
    System.out.println(numero++);
    System.out.println(numero);
    System.out.println(++numero);

    boolean variavel = true;
    System.out.println(!variavel);
    System.out.println(variavel);

    variavel = !variavel;
    System.out.println(variavel);
}

}