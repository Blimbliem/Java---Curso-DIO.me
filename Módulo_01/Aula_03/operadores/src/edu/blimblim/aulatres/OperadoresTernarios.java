package edu.blimblim.aulatres;

public class OperadoresTernarios {

    public static void main(String[] args) {
        
    int a, e;
    a = 5;
    e = 6;

    // utilizando o IF/ELSE
    String resultado = "";
    if (a==e)
        resultado = "Verdadeiro";
    else
        resultado = "Falso";

    System.out.println(resultado);

    // utilizando o operador ternaário: A primeira expressão sempre deve ser uma expressão booleana

    int c, d;
    c = 1;
    d = 9;
    String resultado1 = c==d ?"Verdadeiro":"Falso";
    System.out.println(resultado1);

    }
}
