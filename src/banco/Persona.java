package banco;
import java.util.Scanner;
public class Persona {
    Scanner input = new Scanner(System.in);
    //Atributos
    static String Dni  = "55.478.202" ;
    String numeroCuenta1 = "4289";
    String numeroCuenta2 = "5489";
    
    //Metodos o Constructores
    public void mostrarDatos(){
        System.out.println("Los datos de la persona guardados son: ");
        System.out.println("Dni: "+ Dni + " Numero de cuenta nº1: " + numeroCuenta1 +" Numero cuenta nº2: " + numeroCuenta2);
    }
    
    public void pagosAtrasados(){
        System.out.println("Se cobrara el pago del primer alquiler a su cuenta nº2 ");
        System.out.println("Total a pagar: $2.500");
        Cuenta.saldoDisponible2 -= 2500;
    }
    public void estadoCuenta(){
        if(Cuenta.saldoDisponible2 < 0 ){
            System.out.println("Usted es una persona morosa con un saldo negativo de: " + Cuenta.saldoDisponible2 );
        }
        else{
            System.out.println("¡FELITACIONES! Usted dejo de ser una persona morosa");
        }
    }
}
