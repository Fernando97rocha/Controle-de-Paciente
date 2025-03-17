package service;

import model.User;

public class UserService {

    public User createUser(String name, String email, String password) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);

        System.out.println("usuário criado com sucesso!");
        return user;
    }

    public void login(String name) {}

}
