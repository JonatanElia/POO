import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        menu();
    }
    public static void menu(){
        Scanner teclado=new Scanner(System.in);
        CuentaBanco b1 =new CuentaBanco();
        List <CuentaBanco> lista=new ArrayList();
        boolean bandera=true;
        int opcion,numeroCuenta,cedula;
        double dineroIngresado,dineroRetirado;
        do {
            System.out.println("Ingrese una opcion");
            System.out.println("1.Regristrar cuenta");
            System.out.println("2.Mostrar Cuentas");
            System.out.println("3.Eliminar cuenta");
            System.out.println("4.Buscar cuenta");
            System.out.println("5.Salir");

            opcion=teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el numero de cuenta");
                    numeroCuenta=teclado.nextInt();
                    System.out.println("Ingrese el numero de cedula");
                    cedula=teclado.nextInt();
                    System.out.println("Ingrese cuanta plata tiene");
                    dineroIngresado=teclado.nextDouble();
                    lista.add(new CuentaBanco(numeroCuenta,cedula,dineroIngresado));
                    break;
                case 2:
                    for(CuentaBanco p:lista){
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el numero de cuenta a eliminar");
                    numeroCuenta=teclado.nextInt();
                    for(CuentaBanco p:lista){
                        if(p.getNumeroCuenta()==numeroCuenta){
                            lista.remove(p);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el numero de cuenta");
                    numeroCuenta=teclado.nextInt();
                    for(CuentaBanco p:lista){
                        if(p.getNumeroCuenta()==numeroCuenta){
                            submenu(p);
                        }
                    }
                    break;
                case 5:
                    bandera=false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while (bandera);
    }
    public static void submenu(CuentaBanco b1){
        Scanner teclado=new Scanner(System.in);
        boolean bandera=true;
        int opcion;
        double dineroIngresado,dineroRetirado;
        do {
            System.out.println("Ingrese una opcion");
            System.out.println("1.Informacion de cuenta");
            System.out.println("2.Consultar saldo");
            System.out.println("3.Ingresar dinero");
            System.out.println("4.Retirar dinero");
            System.out.println("5.Retiro rapido (20%)");
            System.out.println("6.Salir");
            opcion=teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println(b1);
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