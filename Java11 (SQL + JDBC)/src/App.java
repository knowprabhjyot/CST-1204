import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            connectionSetup();
        } catch (SQLException e) {
            System.out.println("Unable to connect!" + e);
        }
       
    }

    public static void connectionSetup() throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/student_database"; 
        String user = "root";
        String password = "roottoor";

        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
   
        // statement.executeUpdate("UPDATE student_record SET numberOfCourses = 10 WHERE ID = 2");

        System.out.println("Database is Sucesfully Connected");
       
        addData(statement);
        printTable(statement);

    }

    public static void printTable(Statement statement) throws SQLException {
        ResultSet  resultSet = statement.executeQuery("SELECT * FROM student_record");
        while(resultSet.next()) {
            System.out.println("ID : " + resultSet.getInt("id"));
            System.out.println("NAME : " + resultSet.getString("name"));
            System.out.println("DEPARTMENT : " + resultSet.getString("department"));
            System.out.println("COURSES : " + resultSet.getInt("numberOfCourses"));
            System.out.println("*****************************");
        }
    }

    public static void addData(Statement statement) throws SQLException {
        statement.execute("INSERT INTO student_record VALUES (3, 'Stacy', 'HR', 3)");
        printTable(statement);
        // return resultSet;
    }
}
