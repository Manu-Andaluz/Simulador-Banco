
package banco;

public class Main {

    public static void main(String[] args){
        //Instanciar objeto persona con dni, dos objetos cuenta una sin saldo inicial y otra con $1200
        Persona persona = new Persona();       
        Cuenta cuenta = new Cuenta();
        
        persona.mostrarDatos();
        cuenta.consultarSaldo();
        cuenta.ingresarDinero();
        persona.pagosAtrasados();
        persona.estadoCuenta();
        cuenta.transferencia();
        cuenta.consultarSaldo();
        persona.estadoCuenta();
        
    }

}