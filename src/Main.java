import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Įveskite savo varda ir pavarde: ");
        String textas = scanner.next();
        System.out.println("Labas "+ textas);
        //2
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Iveskite skaiciu: ");
        int a = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Iveskite dar viena: ");
        int b = scanner1.nextInt();
        int suma = a + b;
        int skirtumas = a - b;

        System.out.println("Suma: " + suma + " Skirtumas: " + skirtumas);
        //3
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Ivesk zodi kuri nori atspausdint atvirkstine tvarka: ");
        String zodis = scanner3.next();
        String z = "";
        int x = zodis.length() - 1;
        while (x >= 0){
            z += String.valueOf(zodis.charAt(x));
            x = x - 1;
        }
        System.out.println(z);


    }
}