import java.sql.*;

public class Jdbc{
    public static void main(String []args){
        // 1. Load
        // 2. Connection
        // 3. Statement
        // 4. ResultSet(executeQuery)
        // 5. Process the Result
        // 6. Close the connection
        // 1.
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 2.
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3300/testdemo",
            "root",
            "password"
        )
        // 3.
        Statement st = con.createStatement();
        // 4.
        ResultSet rs = st.executeQuery("SELECT * FROM students");
        // 5.
        while(rs.next()){
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
        // 6.
        con.close();    
    }
}