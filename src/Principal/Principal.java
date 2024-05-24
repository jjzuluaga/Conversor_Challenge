package Principal;

import Modelos.Consulta_API;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        Consulta_API consulta_Api = new Consulta_API();
        int numeroMenu = 0;
        String monedaBase = "";
        String monedObjetivo = "";



        System.out.println("\n******************************************");
        System.out.println("Bienvenido al conversor de divisas de Juan José");
        System.out.println("A continuación podra convertir sus divisas en tiempo real" );
        System.out.println("¡Disfrute la experiencia!");
        System.out.println("\n******************************************");


        String menu1 = """
                
                *** Porfavor ingrese la divisa base que desea cambiar***
                1- Peso colombiano = COP
                2- Dolar = USD
                3- Euro = EUR
                4- Dolar australiano = AUD
                5- Canada = CAD
                6- Reino Unido = GBP
                7- Paraguay = PYG
                8- Venezuala = VES
                9- Salir
                """;
        String menu2 = """
                
                ***Perfecto, ¡Vamos Bien!, ahora ingresa la divisa objetivo***
                """;

        while (numeroMenu != 9 ){
            System.out.println(menu1);
            numeroMenu = lectura.nextInt();
            if (numeroMenu == 9){
                System.out.println("Saliendo del programa; Gracias por utilizar nuestros servicios");
                break;
            }
            switch (numeroMenu){
                case 1:
                    monedaBase = "COP";
                    break;
                case 2:
                    monedaBase = "USD";
                    break;
                case 3:
                    monedaBase = "EUR";
                    break;
                case 4:
                    monedaBase = "AUD";
                    break;
                case 5:
                    monedaBase = "CAD";
                    break;
                case 6:
                    monedaBase = "GBP";
                    break;
                case 7:
                    monedaBase = "PYG";
                    break;
                case 8:
                    monedaBase = "VES";
                    break;

            }
            System.out.println  (menu2);
            numeroMenu = lectura.nextInt();

            switch (numeroMenu){
                case 1:
                    monedObjetivo = "COP";
                    break;
                case 2:
                    monedObjetivo = "USD";
                    break;
                case 3:
                    monedObjetivo = "EUR";
                    break;
                case 4:
                    monedObjetivo = "AUD";
                    break;
                case 5:
                    monedObjetivo = "CAD";
                    break;
                case 6:
                    monedObjetivo = "GBP";
                    break;
                case 7:
                    monedObjetivo = "PYG";
                    break;
                case 8:
                    monedObjetivo = "VES";
                    break;

            }
                System.out.println("Genial, ahora porfavor ingresa la cantidad de dinero que deseas convertir:");
                var cantidad = lectura.nextDouble();
                System.out.println("\n****************************************");
                System.out.println("El valor "+cantidad+
                        consulta_Api.buscarApi(monedaBase,monedObjetivo,cantidad));



        }



    }
}
