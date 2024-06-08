import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner moneda = new Scanner(System.in);
        Scanner salto = new Scanner(System.in);
        Consulta consulta = new Consulta();
        Historial h = new Historial();

        float monto;


        // Codigo de las monedas a convertir
        String usa = "usd";
        String mxn = "mxn";
        String ars = "ars";
        String cop = "cop";
        String eur = "eur";

        System.out.println("Hello world!");

        while (true){
            System.out.println("""
                    ******************************************************

                    Digíte un numero del 1 al 8, la moneda que queras convertir.
                    1) Dólar a Peso Mexicano
                    2) Peso Mexicano a Dólar
                    3) Dólar a Peso Colombiano
                    4) Peso Colombiano a Dólar
                    5) Peso Mexicano a Peso Colombiano
                    6) Peso Mexicano a Peso Argentino
                    7) Peso Colombiano a Peso Argentino
                    8) Dólar a Euro
                    9) Salir

                    ******************************************************
                    """);

            String input = moneda.nextLine();
            int busqueda;

            try {
                busqueda = Integer.parseInt(input);
            } catch (NumberFormatException e) { // Si el usuario ingresa un character incorrecto, saldría un error volverá al inicio
                System.out.println("Entrada no válida. Por favor, introduce un número del 1 al 9.");
                salto.nextLine();
                continue;
            }


            Monedas monedas;
            Control c;
            String montoString;
            String mensj = "Monto a la que quiere Convertir:";

            switch (busqueda) {
                case 1:
//                    1) Dólar a Peso Mexicano
                    System.out.println(mensj);
                    montoString = moneda.nextLine();

                    try{
                        monto = Float.parseFloat(montoString);
                        monedas = consulta.mon_P(usa,mxn,monto);
                        c = new Control(monedas);
                        c.resultado();
                        h.agregarResultado(monedas);

                    }catch (NumberFormatException e){ //Si el usuario Ingresa un comentario
                        System.out.println("No se valido el resultado por: "+ e);
                    }

                    System.out.println("\nPresiona Enter para continuar...");
                    salto.nextLine();
                    break;
                case 2:
//              ====================== 2) Peso Mexicano a Dólar ======================
                    System.out.println(mensj);
                    montoString = moneda.nextLine();

                    try {
                        monto = Float.parseFloat(montoString);
                        monedas = consulta.mon_P(mxn,usa,monto);
                        c = new Control(monedas);
                        c.resultado();
                        h.agregarResultado(monedas);

                    }catch (NumberFormatException e){
                        System.out.println("No se valido el resultado por: "+ e);
                    }

                    System.out.println("\nPresiona Enter para continuar...");
                    salto.nextLine();
                    break;
                case 3:
//                   ===================== 3) Dólar a Peso Colombiano ====================
                    System.out.println(mensj);
                    montoString = moneda.nextLine();

                    try{
                        monto = Float.parseFloat(montoString);
                        monedas = consulta.mon_P(usa,cop,monto);
//                        System.out.println(monedas);
                        c = new Control(monedas);
                        c.resultado();
                        h.agregarResultado(monedas);

                    }catch (NumberFormatException e){ //Si el usuario Ingresa un comentario
                        System.out.println("No se valido el resultado por: "+ e);
                    }

                    System.out.println("\nPresiona Enter para continuar...");
                    salto.nextLine();
                    break;
                case 4:
//                   ==================== 4) Peso Colombiano a Dólar =====================
                    System.out.println(mensj);
                    montoString = moneda.nextLine();

                    try {
                        monto = Float.parseFloat(montoString);
                        monedas = consulta.mon_P(cop,usa,monto);
//                        System.out.println(monedas);
                        c = new Control(monedas);
                        c.resultado();
                        h.agregarResultado(monedas);
                    }catch (NumberFormatException  e){ //Si el usuario Ingresa un comentario
                        System.out.println("No se valido el resultado por: "+ e);
                    }

                    System.out.println("\nPresiona Enter para continuar...");
                    salto.nextLine();
                    break;
                case 5:
//                  =================== 5) Peso Mexicano a Peso Colombiano ================
                    System.out.println(mensj);
                    montoString = moneda.nextLine();

                    try {
                        monto = Float.parseFloat(montoString);
                        monedas = consulta.mon_P(mxn,cop,monto);
//                        System.out.println(monedas);
                        c = new Control(monedas);
                        c.resultado();
                        h.agregarResultado(monedas);
                    }catch (NumberFormatException  e){ //Si el usuario Ingresa un comentario
                        System.out.println("No se valido el resultado por: "+ e);
                    }

                    System.out.println("\nPresiona Enter para continuar...");
                    salto.nextLine();
                    break;
                case 6:
//                   =================== 6) Peso Mexicano a Peso Argentino ===================
                    System.out.println(mensj);
                    montoString = moneda.nextLine();

                    try {
                        monto = Float.parseFloat(montoString);
                        monedas = consulta.mon_P(mxn,ars,monto);
//                        System.out.println(monedas);
                        c = new Control(monedas);
                        c.resultado();
                        h.agregarResultado(monedas);
                    }catch (NumberFormatException e){ //Si el usuario Ingresa un comentario
                        System.out.println("No se valido el resultado por: "+ e);
                    }

                    System.out.println("\nPre1siona Enter para continuar...");
                    salto.nextLine();
                    break;
                case 7:
//                  ===================== 7) Peso Colombiano a Peso Argentino ===================
                    System.out.println(mensj);
                    montoString = moneda.nextLine();

                    try {
                        monto = Float.parseFloat(montoString);
                        monedas = consulta.mon_P(cop,ars,monto);
//                        System.out.println(monedas);
                        c = new Control(monedas);
                        c.resultado();
                        h.agregarResultado(monedas);
                    }catch (NumberFormatException e){ //Si el usuario Ingresa un comentario
                        System.out.println("No se valido el resultado por: "+ e);
                    }

                    System.out.println("\nPresiona Enter para continuar...");
                    salto.nextLine();
                    break;
                case 8:
//                   =================== 8) Dólar a Euro ===================
                    System.out.println(mensj);
                    montoString = moneda.nextLine();

                    try {
                        monto = Float.parseFloat(montoString);
                        monedas = consulta.mon_P(usa,eur,monto);
//                        System.out.println(monedas);
                        c = new Control(monedas);
                        c.resultado();
                        h.agregarResultado(monedas);
                    }catch (NumberFormatException e){ //Si el usuario Ingresa un comentario
                        System.out.println("No se valido el resultado por: "+ e);
                    }

                    System.out.println("\nPresiona Enter para continuar...");
                    salto.nextLine();
                    break;
                case 9:
                    System.out.println("Gracias por su Visita");
                    break;
                default:
                    System.out.println("Del 1 al 8 baboso");
                    System.out.println("\nPresiona Enter para continuar...");
                    salto.nextLine();
            }
            if (busqueda == 9){

                break;
            }


        }
        try {
            h.guardarHistorial();
        } catch (IOException e) {
            System.out.println("Error al guardar el historial: " + e);
        }
    }
}