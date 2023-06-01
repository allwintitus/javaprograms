/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbcproject;
import java.sql.*;

/**
 *
 * @author allwi
 */
public class JdbcProject {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        String url="jdbc:mysql://localhost:3306/church_project";
        String userName="root";
        String password="root123";
        String query="select * from token";
        
     Connection conn=DriverManager.getConnection(url,userName,password);
     Statement st=conn.createStatement();
     st.executeQuery(query);
     ResultSet rs=st.executeQuery(query);
     rs.next();
     
     while (rs.next()) {
                String userNameValue = rs.getString("user_name");
                String phoneNumber = rs.getString("phone_number");
                int noOfTokens = rs.getInt("no_of_tokens");
                String paidThrough = rs.getString("paid_through");
                String paidStatus = rs.getString("paid_status");
                int amountToBePaid = rs.getInt("amount_to_be_paid");
                System.out.println("UserName: " + userNameValue);
                System.out.println("Phone Number: " + phoneNumber);
                System.out.println("No. of Tokens: " + noOfTokens);
                System.out.println("Paid Through: " + paidThrough);
                System.out.println("Paid Status: " + paidStatus);
                System.out.println("Amount to be Paid: " + amountToBePaid);
                System.out.println();
                conn.close();
      
     
    }
    }
}
    

