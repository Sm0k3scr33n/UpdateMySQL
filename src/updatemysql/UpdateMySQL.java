/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package updatemysql;

import java.sql.*;

/**
 *
 * @author root
 */
public class UpdateMySQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        updateIT();
    }
    
    
    private static void updateIT(int Aid, String Aspecies, String Acolor, String Ahabitat)
    {
        
        try{
     String driver="com.mysql.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306/Animals";
    String uname="root";
    String pass="password";
    Class.forName(driver);
    Connection c=(Connection) DriverManager.getConnection(url,uname,pass);
    Statement s=c.createStatement();
    ///sql statement definitions
    
    //s.executeUpdate("INSERT INTO `animals` (species,color,habitat) VALUE ('"+Aspecies+"','"+Acolor+"',"+Ahabitat + ")");
    s.executeUpdate("UPDATE animals SET species='"+Aspecies+"', color='"+Acolor+"', habitat='"+Ahabitat+"' WHERE id='"+Aid+"';");
        }
        catch(SQLException e)
        {
        System.out.println(e.getMessage());
        }
     catch (ClassNotFoundException e)
        {
        
        System.out.println(e.getMessage());
        System.out.println("did not work.. class not found");
        System.exit(0);
        }

    }
}
