/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package examenUT4;


public class Main {

    public static void main(String[] args) {
    	//Seleccionamos miCuenta y con el clic derecho 
    	//damos a refactor y rename y cambiamos el nombre
        CCuenta cuenta1;
        double saldoActual;
        float cantidad = 0;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
        //Seleccionamos el metodo hacemos clic derecho refactor
        //y le damos a Extract Method le ponemos el nombre
        //y le ponemos operativa_cuenta
        operativa_cuenta(cuenta1, cantidad);
    }

	private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		try {
            cuenta1.retirar(2300);
            //modificado
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
