
package practicaObjeto;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class principal {
    public void ingresarDatos() {  Readable input = null;
//  crear método
    Scanner entrada=new Scanner (System.in);
     Animal mianimal=new Animal(); // crar objet
     String raza;
     //ingresar datos
     
      mianimal.setRaza(JOptionPane.showInputDialog("Ingerse la raza del animal"));
      System.out.println("Ingrese la raza del perro");
      raza=entrada.nextLine();
      mianimal.setRaza(raza);
     // mianimal.setRaza(entrada.nextLine());
       
     //salida  o imprimir  por ventana
     JOptionPane.showMessageDialog(null,"La raza del animal es :"+mianimal.getRaza());
     // salida o imprimir por consola 
     System.out.println("La raza del animal es :"+mianimal.getRaza());
    }
   //// main principal e instanciar el método
     public static void main(String[] args) {
        principal dato=new principal(); // crear objeto para instancair el método ingresar datos
        dato.ingresarDatos();
    }
}
