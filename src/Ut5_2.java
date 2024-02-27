import java.util.*;

public class Ut5_2 {
    public static void main(String[] args) {
        Set<Integer> edades = new LinkedHashSet<>();
        Scanner s = new Scanner(System.in);
        int edad;
        int contador = 0;
        int edadAcumulada = 0;
        int mayorQue = 0;
        int menorQue =0;

        do{
            System.out.println("Introduce una edad (negativo para salir)");
            edad = s.nextInt();
            edades.add(edad);
            contador++;
            if(edad > 0){
                edadAcumulada = edadAcumulada + edad;
            }
        }while (edad > 0);

        double media = (double) edadAcumulada /(contador-1);

        Iterator<Integer> i = edades.iterator();
        while(i.hasNext()){
            if (i.next() < media) {
                menorQue++;
            }else {
                mayorQue++;
            }
        }
        edades.forEach(System.out::println);
        System.out.println("La edad media es: " + media);
        System.out.println("Hay " + menorQue + " personas por debajo de la media");
        System.out.println("Hay " + mayorQue + " personas por encima de la media");
    }
}
