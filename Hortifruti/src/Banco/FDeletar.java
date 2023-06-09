package Banco;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Dados.Fornecedor;

public class FDeletar{
    
    public String id;
    
    Connection connection = null;

    public boolean Deletar(Fornecedor forn){
    	
    	connection = Conectar.getInstance().getConnection();
        System.out.println("Conectado e verificando acesso");
        Statement stmt = null;
        
        boolean status = true;
        
        try{
            id = forn.getID();
            
            stmt = connection.createStatement();            
            String query = "DELETE FROM `fornecedor` WHERE `fornecedor`.`id_forn` = "+id+"";
            stmt.execute(query);
	}
        
        
        catch (SQLException e){
            System.out.println(e.getMessage());
            status = false;
        }
        
        finally{
          
            try{
              stmt.close();
                connection.close();
            }
            
            catch (SQLException e){
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
        return status;
    }
}