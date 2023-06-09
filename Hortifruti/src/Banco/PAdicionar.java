package Banco;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Dados.Produto;

public class PAdicionar{
    
    public String nome;
    public String preco;
    public String quant;
    public String forid;
    
    Connection connection = null;
    
    public boolean Inserir(Produto insert){
    	connection = Conectar.getInstance().getConnection();
        System.out.println("Conectado e verificando acesso");
        Statement stmt = null;
        
        boolean status = true;
        
        try{
            nome = insert.getNome();
            preco = insert.getPreco();
            quant = insert.getQuant();
            forid = insert.getForID();
                        
            stmt = connection.createStatement();
            String query = "INSERT INTO `produto` (`id_prod`, `nome`, `preco`, `quant_prod`, `fornecedor_id_forn`) VALUES (NULL, '"+nome+"', '"+preco+"', '"+quant+"', '"+forid+"')";
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