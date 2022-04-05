package clase9;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String nombre, apellido;
        int cedula, edad, salario, i;
        for (i = 1; i < 4; i++) {
            nombre = JOptionPane.showInputDialog("Ingrese Nombre del empleado");
            apellido = JOptionPane.showInputDialog("Ingrese Apellido del empleado");
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado"));
            cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula del empleado"));
            salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario empleado"));

            Empleado datos = new Empleado(cedula, salario, nombre, apellido, edad);

            datos.mostrarDatos();
            System.out.println("---------------------------------------");
        }
    }
}
