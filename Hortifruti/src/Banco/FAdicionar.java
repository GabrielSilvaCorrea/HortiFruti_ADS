package Banco;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Dados.Fornecedor;

public class FAdicionar{
    
    public String nome;
    public String endereco;
    public String tel1;
    public String tel2;
    
    Connection connection = null;
    
    public boolean Inserir(Fornecedor insert){
    	connection = Conectar.getInstance().getConnection();
        System.out.println("Conectado e verificando acesso");
        Statement stmt = null;
        
        boolean status = true;
        
        try{
            nome = insert.getNome();
            endereco = insert.getEndereco();
            tel1 = insert.getTelp();
            tel2 = insert.getTels();
            
            stmt = connection.createStatement();
            String query = "INSERT INTO `fornecedor` (`id_forn`, `nome`, `endereco`, `tel_prin`, `tel_sec`) VALUES (NULL, '"+nome+"', '"+endereco+"', '"+tel1+"', '"+tel2+"')";
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