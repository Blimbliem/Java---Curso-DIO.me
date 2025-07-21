package edu.blimblim.aulatres;

public class OperadoresRelacionais {
    
    public static void main(String[] args) {

    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;
    System.out.println("numero1 é igual a numero2? " + simNao);
    
    simNao = numero1 != numero2;
    System.out.println("numero1 é diferente a numero2? " + simNao);


    simNao = numero1 > numero2;
    System.out.println("numero1 é maior a numero2? " + simNao);

    simNao = numero1 >= numero2;
    System.out.println("numero1 é maior ou igual a numero2? " + simNao);

    simNao = numero1 < numero2;
    System.out.println("numero1 é menor a numero2? " + simNao);

    simNao = numero1 <= numero2;
    System.out.println("numero1 é menor ou igual a numero2? " + simNao);

    //dois objetos na memória
    String nomeUm = "Gabriel";
    String nomeDois = new String ("Gabriel");

    // aqui está sendo validado o objeto na memória
    System.out.println(nomeUm == nomeDois);

    //equals compara conteúdo
    System.out.println(nomeUm.equals(nomeDois));

    }
    
}
