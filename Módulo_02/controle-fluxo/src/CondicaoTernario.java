public class CondicaoTernario {
    public static void main(String[] args) {
       
        // primeiro cenário
        int nota = 7;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        // segundo cenario
        int nota2 = 6;

        String resultado2 = nota2 >= 7 ? "Aprovado" : nota2 >= 5  &&  nota2 <7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado2);
    }
}
