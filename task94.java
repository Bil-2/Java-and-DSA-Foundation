public class task94 {
    public static void main(String[] args) {
String sql = "SELECT * FROM students;"; // Correct SQL select statement

/*
Explanation:
- SELECT * means fetch all columns
- FROM students specifies the table
- This is the simplest form of reading data using SQL
*/
if (sql.equals("SELECT * FROM students;")) {
            System.out.println("select statement ready");
        } else {
            System.out.println("incorrect statement");
        }
    }
}