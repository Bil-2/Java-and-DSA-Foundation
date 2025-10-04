import java.sql.Connection;
import java.sql.DriverManager;

/*
Explanation:
- The Connection class represents the link between your program and the database
- The DriverManager class helps to create that connection
- Both are present in java.sql package, so we import them
- This task prepares you to write database programs by importing correctly
*/
public class task91 {
    public static void main(String[] args) {

        // The below code requires correct imports to compile
        Connection con = null;
        DriverManager dm = null;

        // Output statement, for portal testing only
        System.out.println("import successful");
    }
}