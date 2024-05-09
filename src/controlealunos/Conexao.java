/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlealunos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class Conexao {
    Connection con;
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql:/localhost/test", "root", "");
        }catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
