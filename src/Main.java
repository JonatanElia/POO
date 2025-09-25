import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner teclado=new Scanner(System.in);
        CuentaBanco b1 =new CuentaBanco();
        boolean bandera=true;
        int opcion;
        double dineroIngresado,dineroRetirado;
        do {
            System.out.println("Ingrese una opcion");
            System.out.println("1.1Regristrar cuenta");
            System.out.println("2.Consultar saldo");
            System.out.println("3.Ingresar dinero");
            System.out.println("4.Retirar dinero");
            System.out.println("5.Retiro rapido (20%)");
            System.out.println("6.Salir");
            opcion=teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el numero de cuenta");
                    b1.setNumeroCuenta(teclado.nextInt());
                    System.out.println("Ingrese el numero de cedula");
                    b1.setCedula(teclado.nextInt());
                    System.out.println("Ingrese cuanta plata tiene");
                    b1.setSaldoActual(teclado.nextInt());
                    break;
                case 2:
                    System.out.println("Su saldo actual es de: "+b1.consultarSaldo());
                    break;
                case 3:
                    System.out.println("Ingrese el valor a ingresar");
                    dineroIngresado=teclado.nextDouble();
                    b1.ingresarDinero(dineroIngresado);
                    break;
                case 4:
                    System.out.println("Ingrese el valor a retirar");
                    dineroRetirado=teclado.nextDouble();
                    b1.retirarDinero(dineroRetirado);

                    break;
                case 5:
                    b1.extraccionRapida();
                    break;
                case 6:
                    bandera=false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while (bandera);

    }
}