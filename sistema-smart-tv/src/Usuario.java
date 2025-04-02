public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal atual:" + smartTv.canal);
        System.out.println("Volume atual: " +smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Tv Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " +smartTv.volume);

        smartTv.mudarCanal(15);
        smartTv.diminuirCanal();
        smartTv.desligar();

        System.out.println("Tv Ligada? " + smartTv.ligada);
        System.out.println("Canal atual:" + smartTv.canal);
        System.out.println("Volume atual: " +smartTv.volume);


    }
}
