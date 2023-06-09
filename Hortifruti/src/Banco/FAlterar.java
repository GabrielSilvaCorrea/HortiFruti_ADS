package Banco;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Dados.Fornecedor;

public class FAlterar{
    
    public String id;
    public String nome;
    public String endereco;
    public String tel1;
    public String tel2;
    
    Connection connection = null;

    public boolean Alterar(Fornecedor forn){
    	
    	connection = Conectar.getInstance().getConnection();
        System.out.println("Conectado e verificando acesso");
        Statement stmt = null;
        
        boolean status = true;
        
        try{
            id = forn.getID();
            nome = forn.getNome();
            endereco = forn.getEndereco();
            tel1 = forn.getTelp();
            tel2 = forn.getTels();
            
            stmt = connection.createStatement();            
            String query = "UPDATE `fornecedor` "
                    + "SET `nome` = '"+nome+"', `endereco` = '"+endereco+"', `tel_prin` = '"+tel1+"', `tel_sec` = '"+tel2+"' WHERE `fornecedor`.`id_forn` = "+id+"";
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