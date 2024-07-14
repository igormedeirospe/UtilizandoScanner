package Scanner;

import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {
        //new Scanner = Instancia um Objeto da classe
        //System.in - Lê  as informações do teclado
        //Scanner - Objeto da classe  Scanner
        java.util.Scanner obejtoNome = new Scanner(System.in);
        System.out.println("Digite seu nome: ");

        //nextLine - ler oque o usuario digitar e armazenar na variavel nome
        String nome = obejtoNome.nextLine();
        System.out.println("Nome digitado " + nome);

        //idade
        System.out.println("digite sua idade: ");
        int idade = obejtoNome.nextInt();
        System.out.println("Idade digitada " + idade);





    }
}
