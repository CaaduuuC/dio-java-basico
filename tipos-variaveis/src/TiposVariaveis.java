public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Casting necessário para converter de int para short

        int numero = 5;
        numero = 10; 
        System.out.println(numero); 
    }
}
