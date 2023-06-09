package Banco;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Dados.Compra;
import Telas.Caixa;
import javax.swing.table.DefaultTableModel;

public class CAdicionar{
    
    public String cod;
    public String quant;
    public String data;
    public String hora;
    public String proid;
    
    Connection connection = null;
    
    public boolean Inserir(Compra insert){
    	connection = Conectar.getInstance().getConnection();
        System.out.println("Conectado e verificando acesso");
        Statement stmt = null;
        
        boolean status = true;
        
        Caixa cx = new Caixa();
        DefaultTableModel model = (DefaultTableModel)cx.jTable1.getModel();
        
        try{
            cod = insert.getCod();
            quant = insert.getQuant();
            data = insert.getData();
            hora = insert.getHora();
            proid = insert.getProid();
            
            stmt = connection.createStatement();
            
            
            String query = "INSERT INTO `compra` (`id_compra`, `codigo`, `quantidade`, `data_compra`, `hora_compra`, `id_prod`) VALUES (NULL, '"+cod+"', '"+quant+"', '"+data+"', '"+hora+"', '"+proid+"')";
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