package Banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Dados.Usuario;

public class Acessar{

    Connection connection = null;

    public boolean verificaAcesso(Usuario logar){
    	
    	connection = Conectar.getInstance().getConnection();
        System.out.println("Conectado e verificando acesso");
        Statement stmt = null;
        
        boolean status = true;
        
        try{
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM usuario");
            
            while(res.next()){
	        if(logar.getLogin().compareTo(res.getString("login"))==0 && logar.getSenha().compareTo(res.getString("senha"))==0){
		   status = true;		   
		} else
		{
		   status = false;
		}
	  
	    }
            
        } 
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            status = false;
        }
        finally
        {
          
            try
            {
              stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    	
        return status;
    }
    
}