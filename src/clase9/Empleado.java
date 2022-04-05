
package clase9;

public class Empleado extends DatosPersonales {
    
    private int cedula;
    private int salario;

    public Empleado(int cedula, int salario, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad); // heredo atributos de la clase datos personales
        this.cedula = cedula;
        this.salario = salario;
    }
    @Override
    public void mostrarDatos(){
        System.out.println("Nombre :"+getNombre()+
                "\nApelliod :"+getApellido()+
                "\nEdad :"+getEdad()+
                "\nCedula :"+cedula+
                "\nSalario :"+salario);
    }
   
}
