package senai.logicaprogramacao.exercicios.exercicio01;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        String userName;
        int userAge;
        int amountUsers;
        int menuOption;
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------Bém vindo ao sistema de cadastro SENAI-----------------------");
        System.out.println("Escolha umas das opções do MENU:\n" +
                "1 – Cadastrar novo usuário\n" +
                "2 – Listar todos os usuários cadastrados\n" +
                "3 – Sair do sistema");

        menuOption = scanner.nextInt();
        switch (menuOption) {
            case 1:
                System.out.println("Digite o nome do usuário");
                userName = scanner.next();
                System.out.println("Digite a idade do usuário");
                userAge = scanner.nextInt();
            break;
        }
    }
}