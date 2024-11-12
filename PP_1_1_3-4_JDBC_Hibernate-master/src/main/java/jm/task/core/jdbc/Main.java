package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Мики", "К", (byte) 23);
        userService.saveUser("Лоран", "Л", (byte) 40);
        userService.saveUser("Боб", "А", (byte) 27);
        userService.saveUser("Даня", "Э", (byte) 18);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}