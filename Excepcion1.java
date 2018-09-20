
package excepcion1;

public class Excepcion1 {


    public static void main(String[] args) {
       
      try {
          int[] numeros = {2,3,6};
      
      
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        
        
          } catch (ArrayIndexOutOfBoundsException arrayE)
          {
              System.out.println("Esta posicion no existe");
              
          } finally
            {
                
            }
    }
    
}
