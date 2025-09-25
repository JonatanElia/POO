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
                            submenu
                        }
                    }
                    submenu(numeroCuenta);
                    break;
                case 5:
                    bandera=false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while (bandera);
    }
    public static void submenu(){



    }
}