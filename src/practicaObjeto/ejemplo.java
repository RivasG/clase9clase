
package practicaObjeto;

import javax.swing.JOptionPane;

public class ejemplo {

    public void ingresarDatos() { // método
        //atributos
        String raza;   
        String color;
        int edad;
        int peso;
        // ingreso datos
    raza=JOptionPane.showInputDialog("Ingerse la raza del animal"); 
    color=JOptionPane.showInputDialog("Ingerse la color del animal");
     edad=Integer.parseInt(JOptionPane.showInputDialog("ingrese la edad del animal"));
     peso=Integer.parseInt(JOptionPane.showInputDialog("ingrese el peso del animal"));
     
     // salida de datos
     JOptionPane.showMessageDialog(null,"La raza del animal es :"+raza);
      JOptionPane.showMessageDialog(null,"el color del animal es :"+color);
     JOptionPane.showMessageDialog(null,"La edad del  animal :"+edad);
      JOptionPane.showMessageDialog(null,"el peso del animal :"+peso);
       
     System.out.println("La raza del animal es :"+raza);
     System.out.println("el color  del animal es :"+color);
    }
    
    // main principal e instanciar el método
    public static void main(String[] args) {
        ejemplo dato=new ejemplo(); // objeto que llama al método
        dato.ingresarDatos();
    }
     }