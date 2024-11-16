package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static UserService userService = new UserServiceImpl();

    public static void main(String[] args) throws SQLException {

        userService.createUsersTable();
        userService.saveUser("Мики", "К", (byte) 55);
        userService.saveUser("Ваня", "Х", (byte) 60);
        userService.saveUser("Андрей", "Д", (byte) 42);
        userService.saveUser("Степан", "А", (byte) 36);
        userService.removeUserById(3);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}