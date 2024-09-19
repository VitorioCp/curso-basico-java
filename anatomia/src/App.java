public class App {
    public static void main(String[] args) throws Exception {

        String primeiroNome = "Vitório";
        String segundoNome = "Corrêa";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println("Bem vindo " + nomeCompleto + "!");
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
