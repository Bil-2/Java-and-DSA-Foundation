public class task93 {
    public static void main(String[] args) {
String sql = "INSERT INTO students (id, name) VALUES (1, 'Alice');"; // Correct SQL insert statement

/*
Explanation:
- INSERT INTO specifies the table
- Column names are given in brackets
- VALUES keyword provides the data to insert
- This prepares students to work with databases using SQL commands
*/
// Portal test output
        if (sql.equals("INSERT INTO students (id, name) VALUES (1, 'Alice');")) {
            System.out.println("insert statement ready");
        } else {
            System.out.println("incorrect statement");
        }
    }
}