/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grupo2_cajeroautomatico;

/** Grupo 2
 *
 * 
 */
public class Grupo2_CajeroAutomatico {

    public static void main(String[] args) {
                
        int opci;
        
        int saldo =1000000;
        
        System.out.println("Opcion 1: Mostrar saldo actual");
        System.out.println("Opcion 2: Retirar ");
        System.out.println("Opcion 3: Consignar");
        System.out.println("Opcion 4: Consultar Historial");
        System.out.println("Opcion 5: Salir");
        opci = sc.nextInt();
        
        
        switch (opci) {
            case 1:
                System.out.println("Su saldo actual es de : " + saldo);
                break;
                
            case 2:
                System.out.println("Ingrse saldo a retirar: ");
                int salretirar = sc.nextInt();
                
                if (salretirar>saldo) {System.out.println("Fondos insuficientes");
                    
                } else {
                    int retiro = saldo-salretirar;
                    System.out.println("Su saldo actual es de:" + retiro );
                }
                
            case 3:
                System.out.println("Ingrese el numero de su cuenta: ");
                
                

                
                
            default:

        }

    }
    
}
