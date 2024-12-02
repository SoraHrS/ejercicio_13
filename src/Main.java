import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valorCompra, valorPagar, porcentajeDescuento;
        String colorBolita;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Ingrese el valor de la compra: ");
        valorCompra = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese el color de la bolita: ");
        colorBolita = sc.nextLine();
        if (colorBolita.equals("blanco")) {
            porcentajeDescuento = 0;
        }else if (colorBolita.equals("verde")) {
            porcentajeDescuento = 10;
        }else if (colorBolita.equals("amarillo")) {
            porcentajeDescuento = 25;
        }else if (colorBolita.equals("azul")) {
            porcentajeDescuento = 50;
        }else {
            porcentajeDescuento = 100;
        }
        valorPagar = valorCompra - porcentajeDescuento*valorCompra/100;
        System.out.println("El cliente debe pagar: $ " + valorPagar);
    }
}