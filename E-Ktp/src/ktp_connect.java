/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author AR7
 */
public class ktp_connect {
    private static final String USERNAME= "root";
    private static final String PASSWORD= "root";
    private static final String CONN_STRING= "localhost/program_ktp";
    
    public static void main(String[] args){
        Connection conn = null;
        
        try{
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("Connected");  
        }catch(SQLException e){
            System.err.println(e); 
        }
    }
}
