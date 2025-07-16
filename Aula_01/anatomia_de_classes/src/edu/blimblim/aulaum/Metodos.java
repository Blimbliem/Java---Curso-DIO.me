package edu.blimblim.aulaum;
public class Metodos {
    
    public static void main (String [] args){
        String primeiroNome = "Gabriel";
        String segundoNome = "Blimbliem";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }


    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
