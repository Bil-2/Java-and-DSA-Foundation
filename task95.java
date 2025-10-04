public class task95 {
    public static void main(String[] args) {
String sql = "UPDATE students SET name = 'Bob' WHERE id = 1;"; // Correct SQL update statement

/*
Explanation:
- UPDATE specifies the table
- SET assigns new value to column
- WHERE filters which record to update
- This task teaches basic SQL update syntax safely
*/
// Portal test output
        if (sql.equals("UPDATE students SET name = 'Bob' WHERE id = 1;")) {
            System.out.println("update statement ready");
        } else {
            System.out.println("incorrect statement");
        }
    }
}