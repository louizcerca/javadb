/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import jdk.nashorn.internal.runtime.Version;

/**
 *
 * @author Luiz
 */
public class Conexao {
 private static Scanner scanner = new Scanner( System.in ) ;
    static String pr;
public Conexao () {    } //Possibilita instancias
public static Connection con = null;
 
public static void Conectar() {
System.out.println("Conectando ao banco...");
/*try {
  Class.forName("com.mysql.jdbc.Driver");
  con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1/projeto","root","");
  System.out.println("Conectado.");
} catch (ClassNotFoundException ex) {
    System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
  Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
  } catch(SQLException e) {
    System.out.println(e);
    throw new RuntimeException(e);
}*/
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con =  DriverManager.getConnection("jdbc:mysql://127.0.0.1/projeto","root","");
    System.out.print("Type search");
    //String input = scanner.nextLine();
    System.out.println("Conectado.");

    System.out.print(pr);
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM professor");

    
        //if (rs.next()) {//get first result
        while (rs.next()){
            if(rs.getString("nome").equals(pr)){
                System.out.println(rs.getString("nome") + "/" + rs.getString("email"));//coloumn 1
            }
        
        }

    } catch (SQLException ex) {
        Logger lgr = Logger.getLogger(Version.class.getName());
        lgr.log(Level.SEVERE, ex.getMessage(), ex);

    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
    } /*finally {
        {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            */

        }
    }





