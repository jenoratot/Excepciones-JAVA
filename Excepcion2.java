package excepcion2;
import java.io.IOException;
import java.io.FileReader;

public class Excepcion2 {

    public static void main(String[] args) {
                try{
            
            FileReader fr=new FileReader("POC");
            
        }catch(IOException e)
        {
            System.out.println("El fichero seleccionado no existe");
        }finally{
                    
                }
                 

    }
    
}
