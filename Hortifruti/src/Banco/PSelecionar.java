package Banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Dados.Produto;

public class PSelecionar{
    
   Connection connection = null;

    public String id;
    public String nome;
    public String preco;
    public String quant;
    public String forid;

    public ArrayList<Produto> prodLista(){
        ArrayList<Produto> plista = new ArrayList<>();
        
        connection = Conectar.getInstance().getConnection();
        System.out.println("Conectado e verificando acesso");
        Statement stmt = null;
        
        boolean status = true;
    
        try{
            stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM produto");
            
            Produto prod;
            
            while(res.next()){
                prod = new Produto(
                String.valueOf(res.getInt("id_prod")),
                res.getString("nome"),
                res.getString("preco"),
                res.getString("quant_prod"),
                String.valueOf(res.getString("fornecedor_id_forn")));
                plista.add(prod);
                status = true;
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
        return plista;
    }  
}