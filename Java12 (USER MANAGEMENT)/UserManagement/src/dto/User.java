package dto;

public class User {

    // Model or Schema
    private int id;
    private String name;
    private String email;
    private String password;
    private int age;

    // Parametrized Constructor
    public User(String name, String email, String password, int age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    // Default Construcotr
    public User() {
        this.name = "John Doe";
        this.email = "johndoe@gmail.com";
        this.password = "user";
        this.age = 20;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isUserAdult(int age) {
        if (age > 18) {
            return true;
        }

        return false;
    }

    public void getUserInfo() {
        System.out.println(
                "User name is : " + this.getName() + " additonally user email is : " + this.getEmail()
                        + " and the user is an adult :  " + this.isUserAdult(age));
    }
}
