package jm.task.core.jdbc;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        UserDaoHibernateImpl userService = new UserDaoHibernateImpl();
        userService.dropUsersTable();
        userService.createUsersTable();
        userService.saveUser("Anton", "Garkusha", (byte) 32);
        userService.saveUser("Ivan", "Ivanov", (byte) 22);
        userService.saveUser("Sergei", "Smirnov", (byte) 27);
        userService.saveUser("Petr", "Petrov", (byte) 18);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.getAllUsers();

        //userService.dropUsersTable();
        /*
        try(Session session = Util.getSessionFactory().openSession()) {
            // Check MySQL database version
            String sql = "select version()";

            String result = (String) session.createNativeQuery(sql).getSingleResult();
            System.out.println("MySql Database Version is:::");
            System.out.println(result);
        } catch (HibernateException e) {
            e.printStackTrace();
        }

        */
        /*
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Anton", "Garkusha", (byte) 32);
        userService.saveUser("Ivan", "Ivanov", (byte) 22);
        userService.saveUser("Sergei", "Smirnov", (byte) 27);
        userService.saveUser("Petr", "Petrov", (byte) 18);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();


         */
    }
}
