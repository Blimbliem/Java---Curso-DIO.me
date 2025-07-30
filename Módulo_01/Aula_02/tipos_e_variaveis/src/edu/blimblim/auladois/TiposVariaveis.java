public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
       double salarioMinimo = 2500.53;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // Este é o recurso casting
        short numeroCurto2 = (short) numeroNormal;
       
        double a = 9.8;
        int b = (int) a; // double → int (necessário casting)
        System.out.println(b); // imprime 9 (perdeu a parte decimal)

        // constante utilizando o final
        final double NUMERO_PI =  3.14;
        System.out.println(NUMERO_PI);

        // constante sem final, somente convenção - ela não barra a alteração da variavel, para isso é necessário o "final"
        int DATA_DE_NASCIMENTO = 2002;
        System.out.println(DATA_DE_NASCIMENTO);
        DATA_DE_NASCIMENTO = 2022;
        System.out.println(DATA_DE_NASCIMENTO);
    }
}
