package Constructor;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        String nombre, numero, DPI;
        double tipo, importe;

        Cuenta cuenta1 = new Cuenta();

        System.out.print("DPI : ");
        DPI = sc.nextLine();
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Numero de Cuenta: ");
        numero = sc.nextLine();
        System.out.print("tipo de Interes: ");
        tipo = sc.nextDouble();
        System.out.print("Saldo: ");
        importe = sc.nextDouble();;

        cuenta1.setDPI(DPI);
        cuenta1.setNombre(nombre);
        cuenta1.setNumeroCuenta(numero);
        cuenta1.setTipoInteres(tipo);
        cuenta1.setSaldo(importe);

        Cuenta cuenta2 = new Cuenta("3295670250101", "pablo Escobar gardemia", "329484949025", 1.75, 300);

        Cuenta cuenta3 = new Cuenta(cuenta1);


        System.out.println("Datos de la cuenta 1");
        System.out.println("Nombre del titular: " + cuenta1.getNombre());
        System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
        System.out.println("Saldo: " + cuenta1.getSaldo());
        System.out.println();

        //se realiza un ingreso en cuenta1
        cuenta1.ingreso(4000);

        //mostrar el saldo de cuenta1 después del ingreso
        System.out.println("Saldo: " + cuenta1.getSaldo());

        //mostrar los datos de cuenta2
        System.out.println("Datos de la cuenta 2");
        System.out.println("Nombre del titular: " + cuenta2.getNombre());
        System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta2.getTipoInteres());
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        //mostrar los datos de cuenta3
        System.out.println("Datos de la cuenta 3");
        System.out.println("Nombre del titular: " + cuenta3.getNombre());
        System.out.println("Número de cuenta: " + cuenta3.getNumeroCuenta());
        System.out.println("Tipo de interés: " + cuenta3.getTipoInteres());
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();

        //realizar una transferencia de 10€ desde cuenta3 a cuenta2
        cuenta3.transferencia(cuenta2, 10);

        //mostrar el saldo de cuenta2
        System.out.println("Saldo de la cuenta 2");
        System.out.println("Saldo: " + cuenta2.getSaldo());
        System.out.println();

        //mostrar el saldo de cuenta3
        System.out.println("Saldo de la cuenta 3");
        System.out.println("Saldo: " + cuenta3.getSaldo());
        System.out.println();
    }
}
