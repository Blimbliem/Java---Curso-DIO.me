public class Usuario {
    public static void main(String[] args) throws Exception {
     
        Televisao tv = new Televisao();

        tv.diminuirVolume();
        tv.diminuirVolume();        
        tv.diminuirVolume();
        tv.diminuirVolume();


        System.out.println("TV ligada? " + tv.ligada);
        System.out.println("Canal atual: " + tv.canal);
        System.out.println("Volume atual: " + tv.volume);

        tv.ligar();
        System.out.println("Novo Status: TV ligada? " + tv.ligada);

        tv.desligar();
        System.out.println("Novo Status: TV ligada? " + tv.ligada);
        
        tv.mudarCanal(15);
    }
}
