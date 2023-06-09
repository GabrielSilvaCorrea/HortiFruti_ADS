package Banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Dados.Produto;

public class CPSelecionar{
    
   Connection connection = null;

    public String id;
    public String nome;
    public String preco;
    public String quant;

    public void Caixa(Produto select){
        connection = Conectar.getInstance().getConnection();
        System.out.println("Conectado e verificando acesso");
        Statement stmt = null;
        
        boolean status = true;
    
        try{
            id = select.getID();
            
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM `produto` WHERE `id_prod` = "+id+";");
            
            Produto prod;
            
            while(res.next()){
                nome = res.getString("nome");
                preco = res.getString("preco");
                quant = res.getString("quant_prod");
                status = true;
                select.setNome(nome);
                select.setPreco(preco);
                select.setQuant(quant);
	    }            
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
    }  
}