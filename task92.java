public class task92 {
    public static void main(String[] args) {
String url = "jdbc:sqlite:test.db"; // Correct connection string for SQLite

/*
Explanation:
- All SQLite JDBC connections start with "jdbc:sqlite:"
- The database file name comes after the colon
- This prepares your code to work with SQLite database
- No real database connection is made in this task
*/
// Portal test output
        if (url.equals("jdbc:sqlite:test.db")) {
            System.out.println("connection string ready");
        } else {
            System.out.println("incorrect connection string");
        }
    }
}