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

import java.util.Scanner;

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

}
