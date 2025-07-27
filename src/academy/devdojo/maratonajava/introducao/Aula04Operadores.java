package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        int resultadoSoma = numero01 + numero02;
        int resultadoSubtracao = numero01 - numero02;
        int resultadoMultiplicacao = numero01 * numero02;
        int resultadoDivisao = numero01 / numero02;

        // Resto - Par ou impar
        int resto = 20 % 2;

        // <> <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;

        System.out.println("Valor: " + numero02 + numero01);
        System.out.println(+ numero02 + numero01 + " Valor" );

        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Subtração: " + resultadoSubtracao);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
        System.out.println("Divisão: " + resultadoDivisao);

        System.out.println("O resto é: " + resto);

        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte: " + isDezIgualVinte);
        System.out.println("isDezDiferenteDeVinte: " + isDezDiferenteDeVinte);

    }
}
