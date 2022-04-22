package jm.task.core.jdbc;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Anton", "Garkusha", (byte) 32);
        userService.saveUser("Ivan", "Ivanov", (byte) 22);
        userService.saveUser("Sergei", "Smirnov", (byte) 27);
        userService.saveUser("Petr", "Petrov", (byte) 18);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}
