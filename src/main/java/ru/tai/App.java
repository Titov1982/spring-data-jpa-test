package ru.tai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import ru.tai.model.Role;
import ru.tai.model.User;
import ru.tai.service.RoleService;
import ru.tai.service.UserService;

import java.util.List;

/**
 * Start application
 *
 */
@SpringBootApplication
@EnableTransactionManagement // включаем работу с транзакциями (SpringBootApplication - является @Configuration)
public class App implements CommandLineRunner
{
    @Autowired
    private UserService userService;

    @Autowired
    @Qualifier("roleService")
    private RoleService roleService;

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        List<User> users = userService.findAll();
//        User user1 = userService.findByLogin("titov");
//        User user2 = userService.findByLoginWithRoles("titov");
//        User user3 = userService.findByLoginWithRolesAndMessages("titov");

        /**
         * Создаем тестового пользователя --> admin
         */
//        Role role1 = new Role();
//        role1.setRole("ADMIN_R");
//        User user1 = new User("admin", "admin", "Admin", "Admin", "admin@admin.net", role1);
//        //role1.addUser(user1);
//        userService.add(user1);

        /**
         * Находим его в базе для проверки
         */
//        User user2 = userService.findByLoginWithRoles("admin");

        /**
         * Создаем новую роль --> USER_R
         * Добавляем ее извлеченному из базы пользователю
         * Обновляем запись пользователя с добавленной новой ролью
         */
//        Role role2 = new Role();
//        role2.setRole("USER_R");
//        user2.addRole(role2);
//        userService.update(user2.getId(), user2);

        /**
         * Опять находим его в базе для проверки
         */
//        user2 = userService.findByLoginWithRoles("admin");

        /**
         * Создаем нового пользователя --> user
         * Находим в базе необходимую ему роль и используя специальный сервисный метод назначаем ее пользователю
         * Далее производим выборку всех пользователей с ролями и сообщениями
         */
//        User user3 = new User("user", "user", "User", "User", "user@user.net", null);
//        userService.addRoleToUser(user3, "USER_R");
//        List<User> users = userService.findAllWithRolesAndMessages();

        Long id = userService.findByLogin("user").getId();
        userService.deleteById(id);


        System.out.println("#------------- Hello! -------------#");
    }

}
