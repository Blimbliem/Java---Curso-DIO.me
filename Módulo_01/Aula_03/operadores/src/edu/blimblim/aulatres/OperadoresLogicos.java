package edu.blimblim.aulatres;

public class OperadoresLogicos {
    public static void main(String[] args) {
    
        boolean condicao = true;
        boolean condicao2 = false;
        
        if(condicao && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        System.out.println("Fim");

        
        if(condicao || condicao2){
            System.out.println("Uma das condições é verdadeiras");
        }
        System.out.println("Fim");
    }
    
}
