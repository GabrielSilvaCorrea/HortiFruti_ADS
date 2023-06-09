package Banco;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Dados.Produto;

public class PAlterar{
    
    public String id;
    public String nome;
    public String preco;
    public String quant;
    public String forid;
    
    Connection connection = null;

    public boolean Alterar(Produto prod){
    	
    	connection = Conectar.getInstance().getConnection();
        System.out.println("Conectado e verificando acesso");
        Statement stmt = null;
        
        boolean status = true;
        
        try{
            id = prod.getID();
            nome = prod.getNome();
            preco = prod.getPreco();
            quant = prod.getQuant();
            forid = prod.getForID();
            
            stmt = connection.createStatement();            
            String query = "UPDATE `produto` "
                    + "SET `nome` = '"+nome+"', `preco` = '"+preco+"', `quant_prod` = '"+quant+"', `fornecedor_id_forn` = '"+forid+"' WHERE `produto`.`id_prod` = "+id+"";
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