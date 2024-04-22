/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package prueba;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
/**
 *
 * @author britz
 */
public class Prueba {
    
    Connection con;
    String url = "jdbc:mysql://192.168.1.23:3306/test";
    String user = "Britza";
    String password = "taxandlegalbritza2024";
    
    public Prueba(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        }catch(Exception e){
            System.err.println("No se pudo establecer la conexión con la base de datos. Error: " + e);
        }
    }
    
    public Connection getConnection(){
        return con;
    }
     /*public static void main(String[] args) {
 
        
       String url = "jdbc:mysql://192.168.1.23:3306/test";
        String user = "Britza";
        String password = "taxandlegalbritza2024";
        
        try(Connection con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement()){
            
            String query = "SELECT * FROM usuarios ";
            //String query = "SELECT * FROM usuarios where id_usuario=1 ";
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                int id = rs.getInt("id_usuario");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                String email = rs.getString("correo_electronico");
                
                //System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Email: " + email);
                System.out.println("ID: " + id + "\n" + "Nombre: " + nombre);
            }
        }catch(SQLException ex){
            System.out.println("Error al conectarse: " + ex);
        }
    }*/
    

   
     
    
}
