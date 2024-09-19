public class App {
    public static void main(String[] args) throws Exception {

        // String primeiroNome = "Vitório";
        // String segundoNome = "Corrêa";

        // String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        // System.out.println("Bem vindo " + nomeCompleto + "!");

        SmartTv smartTv = new SmartTv();
    
        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
