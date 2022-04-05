
package clase9;

import java.util.Date;
import java.util.Scanner;

public class entrada {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner (System.in);
        Date fecha=new Date();
        // Se definen las variables
        String nombre;
        String cedula;
        int i, contador=0,factura=0,tiquet1,tiquet2;
        double cantidad;
        int menuTiquete, menuPrincipal=0, cantidadtiquetes=0,tiquetes;
        float montototalfacturado=0,costocompra=0,subtotal=0,iva,montototal,vendidas;
        float costotiquete=0,cantidadtiquetes1=0,cantidadtiquetes2=0;
       
        //Se definen los vectores
        String[] clientes=new String[100];
        String[] cedulas=new String[100];
        int[] entradas1=new int[100];
        int[] entradas2=new int[100];
        float[] montostotales=new float[100];
        
        //Se utiliza la herramienta Try para la funcionalidad de terminar 
        try
        {
            tiquet1=4000;
            tiquet2=11000;
            do{
                //SE DAN LOS PUNTOS PRINCIPALES DEL MENU
                System.out.println("Tiquetera");
                System.out.println("1.) Ventas");
                System.out.println("2.) Buscar");
                System.out.println("3.) Resultados");
                System.out.println("4.) Salir");
                menuPrincipal= entrada.nextInt();
                switch (menuPrincipal){
                    //SE DEFINEN LAS OPCIONES DEL MEUNU, SIENDO 3, DEBIDO A QUE LA CUARTA ES SALIR 
                    case 1:
                        contador++;
                        System.out.println("Digite su nombre: ");
                        nombre= entrada.next();
                        clientes[contador]=nombre;
                        
                        System.out.println("----------------------------");
                        System.out.println("Digite su numero de cedula: ");
                        cedula= entrada.next();
                        cedulas[contador]=cedula;
                        
                        System.out.println("------------------------");
                        System.out.println("Escoga cual tiquet desea");
                        System.out.println("1- Tiquet ₡4000 (Graderia sombra)");
                        System.out.println("2- Tiquet ₡11000 (Palco)");
                        menuTiquete=entrada.nextInt();
                        
                        System.out.println("------------------------------");
                        System.out.println("Cuantos tiquetes desea comprar");
                        tiquetes= entrada.nextInt();
                        cantidadtiquetes= cantidadtiquetes+tiquetes;
                        
                        switch (menuTiquete){
                            case 1:
                                entradas1[contador]=tiquetes;
                                costotiquete= tiquet1;
                                subtotal= costotiquete*tiquetes;
                                costocompra=subtotal*1.13f;
                                montostotales[contador]=costocompra;
                                montototalfacturado=montototalfacturado+costocompra;
                                cantidadtiquetes1=cantidadtiquetes1+tiquetes;
                                break;
                            case 2:
                                entradas2[contador]=tiquetes;
                                costotiquete= tiquet2;
                                subtotal= costotiquete*tiquetes;
                                costocompra=subtotal*1.13f;
                                montostotales[contador]=costocompra;
                                montototalfacturado=montototalfacturado+costocompra;
                                cantidadtiquetes2=cantidadtiquetes2+tiquetes;
                                break;
                            default:
                                
                        }
                        System.out.println("-----------------------------");
                        System.out.println("Numero de factura: "+contador);
                        System.out.println("Fecha: "+fecha);
                        System.out.println("cliente: "+nombre+" cedula: "+cedula);
                        System.out.println("Cantidad: "+tiquetes);
                        System.out.println("Precio Tiquete: "+costotiquete);
                        System.out.println("SubTotal: "+subtotal);
                        System.out.println("Iva 13%: "+subtotal*0.13f);
                        System.out.println("Total(IVA): "+costocompra);
                        System.out.println("------------------------------");
                        break;
                    case 2:
                        System.out.println("------------------------------");
                        System.out.println("Busqueda");
                        System.out.println("Ingrese numero de factura: ");
                        factura= entrada.nextInt();
                        System.out.println("Fecha: "+fecha);
                        System.out.println("Cliente: "+clientes[factura]+"cedula");
                        System.out.println("Cantidad de tiquetes graderia sombra: "+entradas1[factura]);
                        System.out.println("Cantidad de tiquetes Palco"+entradas2[factura]);
                        System.out.println("Total IVA:"+montostotales[factura]);
                        System.out.println("-------------------------------");
                        break;
                    case 3:
                        System.out.println("--------------------------------");
                        System.out.println("Totales:");
                        System.out.println("Monto total facturado"+montototalfacturado);
                        System.out.println("Cantidad de entrdas:"+cantidadtiquetes);
                        System.out.println("Cantidad de tiquetes graderia sombra: "+ cantidadtiquetes);
                        System.out.println("Cantidad de tiquetes Palco:"+cantidadtiquetes);
                        System.out.println("--------------------------------");
                        break;
                    default:
                        
                }
            }while (menuPrincipal!=4);
            
        }
        catch (Exception e){
            System.out.println("Error de indice "+e);
        }
    }  
}
