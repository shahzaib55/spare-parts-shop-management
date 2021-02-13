/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;

/**
 *
 * @author aoun5
 */
public class Login {

    public static Connection getConnection(){
        Connection con = null;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        }catch (Exception ex){
        System.out.println(ex.getMessage());
        }
        return con;
        
    }
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
