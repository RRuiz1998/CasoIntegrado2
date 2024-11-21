
package javaapplication8;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Metodos {
    
    
    
    Integer[][] matriz = new Integer[7][3];
    List<Integer> cantidadTotal = new ArrayList<>();
    
    public String product () {
        String product = null;
        for (int index = 0; index < 3; index++) {
            switch (index) {
                case 0 -> product = "Arroz";
                case 1 -> product = "Azucar";
                case 2 -> product = "Leche";
            }
            day(product);
        }
        return product;
    }
    
    
    public String day (String product) {
        String day = null;
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0 -> day = "Domingo";
                case 1 -> day = "Lunes";
                case 2 -> day = "Martes";
                case 3 -> day = "Miercoles";
                case 4 -> day = "Jueves";
                case 5 -> day = "Viernes";
                case 6 -> day = "Sabado";
            }
            cantidad(day, product);
        }
        return day;
    }
    
    public void view (int cantidad) {
        System.out.println(cantidad+" ");
    }
    
    
    public void cantidad (String day, String product) {
        
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(day + "\ningrese la cantidad de " + product + " que se vendio: "));
        cantidadTotal.add(cantidad);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = cantidad;
                
            }
        }
    }
    
    public 
    
    
//    public void sums () {
//    List<Integer> arrozTotal = new ArrayList<>();
//    List<Integer> azucarTotal = new ArrayList<>();
//    List<Integer> lecheTotal = new ArrayList<>();
//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (j == 0) {
//                    arrozTotal.add(j)
//                }
//            }
//            
//        }
//        
//    }
    
    
    
}