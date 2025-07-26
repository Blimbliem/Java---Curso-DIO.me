public class Conta {

    double saldo = 10.0;

    public void sacar (Double valor) {
        // variavel local de método
        double novoSaldo = saldo - valor;
    }
        //"novo saldo" e "valor" só estarão disponíveis dentro do método acima

    public void imprimirSaldo(){
        //disponível em toda classe
        System.out.println(saldo);
        //somente o método sacar conhece esta variavel
 //     System.out.println(novoSaldo);
    }
}
