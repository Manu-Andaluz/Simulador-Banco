package banco;
import java.util.Scanner;

public class Cuenta {
    //Atributos 
    Scanner input = new Scanner(System.in);
    static float saldoDisponible = 0;
    static float saldoDisponible2 = 1200;
    
    //Metodos o Constructures
    public void consultarSaldo(){
        System.out.println("El saldo disponible de la cuenta 1 es de: " + saldoDisponible);
        System.out.println("El saldo disponible de la cuenta 2 es de: " + saldoDisponible2);
        
        //System.out.println("Tu dni es:  " + Persona.Dni);
    }
    
    public void ingresarDinero(){

        System.out.println("**CUENTA Nº1**");
        System.out.println("Usted recibio sueldo de: $5500 ");
        saldoDisponible += 5500;
    }
    
    public void transferencia(){
        System.out.println("**REALIZANDO TRANSFERENCIA BANCARIA**");
        saldoDisponible2 += saldoDisponible;
        saldoDisponible = 0;
    }
    
}
