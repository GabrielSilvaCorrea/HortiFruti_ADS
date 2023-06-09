package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class Conectar 
{

    Connection con = null;
    private static Conectar instance = null;

    public Conectar() 
    {
    	try 
    	{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Carregado com sucesso!!!");
        } 
    	catch (ClassNotFoundException e) 
    	{
            System.out.println("O driver do Mysql não pode ser carregado!");
        }
    }
    
   
    public static Conectar getInstance() 
    {
        if (instance == null) 
        {
            instance = new Conectar();
        }
        return instance;
    }

    public Connection getConnection() 
    {
        try 
        {
            if ((con == null) || (con.isClosed())) 
            {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_horti", "root", "");
                System.out.println("Conexão estabelecida");
            }
        }   
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return con;
    }

    public void destroy() 
    {
        try 
        {
            con.close();
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    
}