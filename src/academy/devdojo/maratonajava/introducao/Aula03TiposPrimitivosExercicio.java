package academy.devdojo.maratonajava.introducao;

/*
 * Prática: <br>
 *
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:<br>
 *
 * Eu <nome>, morando no endereço <endereco>,<br>
 * confirmo que recebi o salário de <slario>, na data <data><br>
 */

public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String nome = "Kiko";
        String endereco = "Rua das Ostras";
        double salario = 1000.00;
        String dataRecebimentoSalario = "10/05/2021";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de R$ "
                + salario + ", na data " + dataRecebimentoSalario;

        System.out.println(relatorio);
    }

}
