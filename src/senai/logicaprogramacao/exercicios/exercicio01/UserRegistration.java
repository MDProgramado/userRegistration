package senai.logicaprogramacao.exercicios.exercicio01;
import java.util.Scanner;
import java.util.ArrayList;

class User {
    String names;
    int age;
}
public class UserRegistration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<User> listUser = new ArrayList<>();
        int amountMenu = 0;


        while (amountMenu != 3) {
            System.out.println("Bem-vindo ao sistema de cadastro Menu\n");
            System.out.println("Escolha uma das opções a seguir");
            System.out.println("1 - Cadastrar pessoa \n2 - Listar pessoas cadastradas \n3 - Encerrar programa \n\n");
            amountMenu = scanner.nextInt();
            switch (amountMenu) {
                case 1:
                    System.out.println("Digite o nome da pessoa");
                     String nameDigit = scanner.next();
                    System.out.println("Digite a idade da pessoa");
                     int ageDigit = scanner.nextInt();
                    User newUser = new User();
                    newUser.names = nameDigit;
                    newUser.age = ageDigit;
                    listUser.add(newUser);

                    break;
                case 2:

                    if (listUser.isEmpty()) {
                        System.out.println("Nenhuma pessoa cadastrada ainda.");
                    } else {

                       for (User userMoment : listUser) {
                           System.out.println("Nome: " + userMoment.names + ", idade: " + userMoment.age);
                       }
                    }

                    System.out.println("----------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Encerrando programa");
                    break;
                default:
                    System.out.println("Nenhuma opção selecionada. Tente novamente!");
            }

        }

    }
}