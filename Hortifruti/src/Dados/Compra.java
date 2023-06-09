package Dados;

public class Compra{
    public String id;
    public String cod;
    public String quant;
    public String data;
    public String hora;
    public String proid;
   

    public Compra(){
        
    }

    public Compra(String id, String cod, String quant, String data, String hora, String proid){
        this.id = id;
        this.cod = cod;
        this.quant = quant;
        this.data = data;
        this.hora = hora;     
        this.proid = proid;     
    }
    
    public String getID(){
        return id;
    }

    public void setID(String id){
        this.id = id;
    }
    
    public String getCod(){
        return cod;
    }

    public void setCod(String cod){
        this.cod = cod;
    }

    public String getQuant(){
        return quant;
    }
    
    public void setQuant(String quant){
        this.quant = quant;
    }
    
    public String getData(){
        return data;
    }

    public void setData(String data){
        this.data = data;
    }
    
    public String getHora(){
        return hora;
    }

    public void setHora(String hora){
        this.hora = hora;
    }
    
    public String getProid(){
        return proid;
    }

    public void setProid(String proid){
        this.proid = proid;
    }
}