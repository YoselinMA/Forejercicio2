import java.util.Scanner;
public class Forejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, i, cal;
        System.out.println("Ingresa tu semestre");
        valor = sc.nextInt();

        for(i =1; i <= valor; i++){
            cal = (int)((valor*2)/2);
            System.out.println("Este codigo se imprimira las veces de acurdo a tu semestre y vas en: "+ cal+ " semestre");

        }
    }
    
}
