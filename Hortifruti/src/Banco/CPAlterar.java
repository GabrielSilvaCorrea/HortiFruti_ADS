package Banco;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Dados.Produto;

public class CPAlterar{
    
    public String id;
    public String quant;
    
    Connection connection = null;

    public boolean Alterar(Produto prod){
    	
    	connection = Conectar.getInstance().getConnection();
        System.out.println("Conectado e verificando acesso");
        Statement stmt = null;
        
        boolean status = true;
        
        try{
            id = prod.getID();
            quant = prod.getQuant();
            
            stmt = connection.createStatement();            
            String query = "UPDATE `produto` SET `quant_prod` = '"+quant+"' WHERE `produto`.`id_prod` = "+id+"";
;
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