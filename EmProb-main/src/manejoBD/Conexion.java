/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoBD;
import java.sql.*;

/**
 *
 * @author Slonder
 */
public class Conexion {
    public static Connection getConexion(){
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                + "database= EmProb;"
                + "user=sa;"
                + "password=RPSsql12345;"
                + "loginTimeout=30;";
        try{
            Connection con = DriverManager.getConnection(conexionUrl);
            return con;
        }catch(SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
    }
}
