public class Televisao {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++; // operador unário
        System.out.println("Aumentando o volume para: " + volume);
    }

     public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume); // operador unário
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("O canal atual é: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("O canal atual é: " + canal);
    }

    public void mudarCanal(int novoCanal){
       canal = novoCanal;
       System.out.println("O canal atual é: " + canal);
    }


}
