import java.util.Scanner;

public class Wspolrzedne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj X:");
        int x = sc.nextInt();
        System.out.println("Podaj Y:");
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            String p = "I";
            System.out.println("Punkt (" + x + ", " + y + ") leży w " + p + " ćwiartce układu współrzednych");
        } else if (x < 0 && y > 0) {
            String p = "II";
            System.out.println("Punkt (" + x + ", " + y + ") leży w " + p + " ćwiartce układu współrzednych");
        } else if (x < 0 && y < 0) {
            String p = "III";
            System.out.println("Punkt (" + x + ", " + y + ") leży w " + p + " ćwiartce układu współrzednych");
        } else {
            String p = "IV";
            System.out.println("Punkt (" + x + ", " + y + ") leży w " + p + " ćwiartce układu współrzednych");
        }


    }
}
