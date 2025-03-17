import controller.UserController;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        UserController userController = new UserController();
        userController.run();
    }
}