package Controle;

public class DesafioFor {

    public static void main(String[] args) {

        String valor = "#";
        for (int i = 1; i < 5; i++){
            System.out.println(valor);
            valor += "#";
        }
        //Versão do Desafio
        // Não pode usar valor numérico para controlar o laço!

        for (String x = "#"; !x.equals("######"); x += "#") {
            System.out.println(x);
        }
    }
}
