package by.tms.dao;

import by.tms.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    static final List<User> users = new ArrayList<>();
    static User currentUser = new User();

    public void save(User user){
        users.add(user);
    }

    public User getByEmail(String email){
        for (User user : users) {
            if (user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }

    public static List<User> getUsers() {
        return users;
    }

    public static User getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(User currentUser) {
        UserDAO.currentUser = currentUser;
    }
}

