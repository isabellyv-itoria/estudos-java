/* import  java.util.Scanner;

public class EstruturasCondicionais {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sua idade: ");
        int idade = input.nextInt();
        String categoria;

        if(idade < 15 ){
            categoria = "Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Juvenil";
        } else{
            categoria = "Adulto";
        }

        System.out.println(categoria);
    }
}*/

/*import java.util.Scanner;

public class EstruturasCondicionais {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String positivo = "positivo";
        String negativo = "negativo";

        System.out.println("Sua inteiro: ");
        int inteiro = input.nextInt();

        String resultado = inteiro > 0 ? positivo : negativo ;

        System.out.println(resultado);
    }

}*/

/*import java.util.Scanner;

public class EstruturasCondicionais {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia;

        System.out.println("Escolha um dia da semana: ");
        dia = input.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Fora do scopo");
        }
    }

}*/

import java.util.Scanner;

public class EstruturasCondicionais {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2, r;
        char operacao;

        System.out.println("================ OPERACOES ==============");
        System.out.println("        qual operacao deseja fazer?      ");
        System.out.println(" 1 - soma \n 2 - subtracao \n 3 - multiplicacao \n 4 - divisao \n");
        System.out.println("=========================================");

        System.out.println("Operacao: ");
        operacao = input.next().charAt(0);

        System.out.println("=========================================");
        System.out.println("digite 2 valores para realizar a operacao");

        System.out.println("Digite o primeiro numero: ");
        n1 = input.nextDouble();

        System.out.println("Digite o segundo numero: ");
        n2 = input.nextDouble();

        switch (operacao) {
            case '1':
                r = n1 + n2;
                System.out.printf("Sua soma: %.2f", r);
                break;
            case '2':
                r = n1 - n2;
                System.out.printf("Sua sub: %.2f", r);
                break;
            case '3':
                r = n1 * n2;
                System.out.printf("Sua mul: %.2f", r);
                break;
            case '4':
                r = n1 / n2;
                System.out.printf("Sua div: %.2f", r);
                break;
            default:
                System.out.print("Fora da lista!");
                break;

        }

    }
}
