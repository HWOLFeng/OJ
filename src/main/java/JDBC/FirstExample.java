package JDBC;

import java.sql.*;

/**
 * Created by HWOLF on 2017/3/21.
 */
public class FirstExample {
    // JDBC driver name and database URL
//    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/EMP";
    // Database credentials(证书)
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            //STEP 2: Register JDBC driver(注册驱动程序)
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection（打开链接）
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);//also have else way you can override it 
            //STEP 4: Execute a query(执行查询)
            statement = connection.createStatement();
            String sql;
            sql = "SELECT id,age,first,last FROM Employees";
            ResultSet resultSet = statement.executeQuery(sql);
            //STEP 5: Extract data from result set(从结果中查询数据)
            while (resultSet.next()) {
                //Retrieve by column name(按名列检索)
                int id = resultSet.getInt("id");
                int age = resultSet.getInt("age");
                String first = resultSet.getString("first");
                String last = resultSet.getString("last");
                //Display values
                System.out.println("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", First: " + first);
                System.out.println(", Last: " + last);
            }
            //STEP 6: Clean-up environment
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
            } catch (SQLException se2) {
            }//nothing we can do
            try {
                if (connection != null) connection.close();
            }catch (SQLException se3){
                se3.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("bye~");
    }//end main
}//end class
