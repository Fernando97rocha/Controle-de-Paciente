package controller;

import service.UserService;
import java.util.Scanner;

public class UserController {

    private UserService service;
    private Scanner scanner;

    public UserController() {
        service = new UserService();
        scanner = new Scanner(System.in);
    }

    public void run() {

        boolean boo = true;

        while (boo) {
            System.out.println("Bem vindo ao seu controle de pacientes!");
            System.out.println("1 - Entrar");
            System.out.println("2 - Cadastrar");
            System.out.println("0 - Sair");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    login();
                    break;
                case 2:
                    create();
                    break;
                case 0:
                    boo = false;
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção invalida. Tente novamente.");
                    break;
            }
        }

    }

    public void login() {
        String name;


    }

    public void create() {
        String name;
        String email;
        String password;

        System.out.println("Qual o seu nome?");
        name = scanner.nextLine();
        System.out.println("Qual o seu email" + name + "?");
        email = scanner.nextLine();
        System.out.println("Digite uma senha:");
        password = scanner.nextLine();

        service.createUser(name, email, password);
    }




}
