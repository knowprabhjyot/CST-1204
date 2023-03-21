package dao;

import java.util.List;

import dto.User;

public interface UserDAO {
    
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/user";
    public static final String USER = "root";
    public static final String PASSWORD = "Support@123";

    // Create a user
    public void insert(User user);
    
    // Updating a user
    public void update(User user);

    // Delete a user
    public void delete(int id);

    // // Get User By ID
    // public void getUserById(int id);

    // Get All the users
    public List<User> getUserList();

    // // Get User By email and password
    // public UserDTO getUserByEmailAndPassword(String email, String password);
}
