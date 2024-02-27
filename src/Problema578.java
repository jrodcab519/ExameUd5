import java.util.ArrayList;
import java.util.Scanner;

public class Problema578 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        ArrayList inventario;
        String producto ;
        int numero;

        do{
            System.out.println("Introduce un número: ( 0 para salir)");
            numero = s.nextInt();
            if (numero > 150000){
                throw new Exception("Máximo 150000");
            }
            inventario = new ArrayList<>(numero);
            System.out.println("Introduce un producto:");
            producto = s.nextLine();
            if (producto.length() > 20){
                throw new Exception("Máximo 20 caracteres");
            }else{

            }
        }while(numero != 0);

        System.out.println(inventario);
    }
}
