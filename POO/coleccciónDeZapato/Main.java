package POO.coleccciónDeZapato;


import java.util.ArrayList;
import java.util.Scanner;

import POO.coleccciónDeZapato.Personal.Empleado;
import POO.coleccciónDeZapato.tienda.TiendaZapatos;
import POO.coleccciónDeZapato.zapatos.Zapatos;

public class Main{
    private static final String TIENDA_ZAPATOS_JEAN = "Calzados J";
    private static final String TIENDA_ZAPATOS_CARLOS = "Calzados C";

    private static void bienvenidaTiendaZapatos(String nombreTienda){
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Welcome to the store the shoe" + nombreTienda + "--");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Please, write the reference of the shoe you want to search: ");


    }

    public void tiendaZpatos(){
        try (Scanner scanner = new Scanner(System.in)) {
            TiendaZapatos tiendaZapatosJean = new TiendaZapatos();  
            tiendaZapatosJean.setEmpleados(vectorEmpleadosTiendaZapatos());
            tiendaZapatosJean.setZapatos(zapatoMuestraJean());
            bienvenidaTiendaZapatos(TIENDA_ZAPATOS_JEAN);
            String refenceSearhc = scanner.nextLine();
            buscarPorReferenciav1(tiendaZapatosJean, refenceSearhc);
        } 
    }

  
    private static Empleado[] vectorEmpleadosTiendaZapatos(){
        Empleado empleado1 = new Empleado("c1734863", "Oscar Maldonado", 25);
        Empleado empleado2 = new Empleado("c1034867", "Ronaldo Nazario", 35);
        Empleado empleado3 = new Empleado("c1834865", "Lionel Scaloni", 40);

        Empleado [] empleadosTemporales = new Empleado[3];
        empleadosTemporales[0] = empleado1;
        empleadosTemporales[1] = empleado2;
        empleadosTemporales[2] = empleado3;

        return empleadosTemporales;
    }
    public static ArrayList<Zapatos> zapatoMuestraJean(){
        Zapatos z1 = new Zapatos("0001", 42, "Blue", "nike");
        Zapatos z2 = new Zapatos("0002", 40, "White", "adidas");
        Zapatos z3 = new Zapatos("0003", 38, "red", "Reebook");

        ArrayList <Zapatos> zapatoMuestra = new ArrayList<>();
        zapatoMuestra.add(z1);
        zapatoMuestra.add(z2);
        zapatoMuestra.add(z3);

        return zapatoMuestra;

    }
    private static void buscarPorReferenciav1(TiendaZapatos tiendaZapatos, String referenceZapatos){
        boolean zapatoEncontrado = false;
        for(int i = 0; i<tiendaZapatos.getZapatos().size(); i++){
            if(tiendaZapatos.getZapatos().get(i).getreference().equals(referenceZapatos)){
                System.out.println("The shoe you are looking for if it isin the store, is the following: ");
                System.out.println("Brand" + tiendaZapatos.getZapatos().get(i).getbrand());
                System.out.println("Size" +  tiendaZapatos.getZapatos().get(i).getsize());
                System.out.println("Color" +  tiendaZapatos.getZapatos().get(i).getcolor());
                zapatoEncontrado = true;
                break;
            }
        }
        if(!zapatoEncontrado){
            System.out.println("the shoe you are looking for is not inthe store");
        }
    }


    public static void main(String[] args) {
        
    }
}