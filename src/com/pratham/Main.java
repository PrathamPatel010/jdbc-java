package com.pratham;
// Step-1: Importing sql class
import java.sql.*;

public class Main {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String uname= "root";
        String pw = "";

        // Step-2 : Loading and Registering Drivers

        // Loading Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Registering Driver
        Connection con = DriverManager.getConnection(url,uname,pw);

        // Step-3 : Create a statement
        Statement st = con.createStatement();
        String sql = "select * from student";

        // Step-4 : Executing a query
        ResultSet result = st.executeQuery(sql);

        // Step-5 : Processing the result
        // result.next() is condition check which holds true till there is single element remaining in list
        while(result.next()){
            System.out.println("S_ID: " + result.getString("s_id"));
            System.out.println("Name: " + result.getString("s_name"));
        }

        // Step-6 : Closing the Statement & Connection
        st.close();
        con.close();
    }
}

