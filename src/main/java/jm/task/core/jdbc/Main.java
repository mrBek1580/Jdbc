package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import org.hibernate.collection.internal.PersistentBag;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.dropUsersTable();
        userService.saveUser("Test1", "Test2", (byte) 23);
        userService.saveUser("Test1", "Test2", (byte) 24);
        userService.saveUser("Test1", "Test2", (byte) 25);
        userService.saveUser("Test1", "Test2", (byte) 26);
        List<User> users = userService.getAllUsers();
        for (User user: users) {
            System.out.println(user);
        }
        userService.cleanUsersTable();
        userService.removeUserById(1);
    }
}
