import java.sql.*;
public class Main {
    public static void main(String[] args) {

        String url = "jdbc:sqlite:todo.db";

        try(Connection connection = DriverManager.getConnection(url);
        Statement statement = connection.createStatement()) {

            String sql = """
                    CREATE TABLE IF NOT EXISTS tasks (
                        id INTEGER PRIMARY KEY,
                        task TEXT NOT NULL
                    )
                    """;
            statement.executeUpdate(sql);
            System.out.println("Database ready!");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
