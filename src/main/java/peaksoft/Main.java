package peaksoft;

import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;
import peaksoft.service.UserService;
import peaksoft.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        User user = new User("Nargiza", "Sultanmuratova", (byte) 18);
        User user1 = new User("Ulan", "Kubanychbekov", (byte) 26);
        User user2 = new User("Nurisa", "Abdykalykova", (byte) 19);
        UserService userService = new UserServiceImpl();
//        userService.createUsersTable();
//        userService.saveUser(user.getName(), user.getLastName(), user.getAge());
//        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
//        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());

//        userService.cleanUsersTable();
//        System.out.println(userService.existsByFirstName("Nargiza"));
//        userService.removeUserById(4);

    }
}
