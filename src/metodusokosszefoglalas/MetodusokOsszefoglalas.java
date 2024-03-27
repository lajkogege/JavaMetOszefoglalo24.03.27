/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodusokosszefoglalas;

public class MetodusokOsszefoglalas {

    public static void main(String[] args) {
        muveletek();
    }

    private static void muveletek() {
        nehanySzamOszeadasKonzolon();
        egyKivonasKonzolon();
    }

    private static void nehanySzamOszeadasKonzolon() {
        osszeadasKetSzammal();
        osszeadas3Szammal();
        osszeadasTombbel();
    }

    private static void osszeadasKetSzammal() {
        int a = 4;
        int b = 4;
        //System.out.println("3+4=?");
        //System.out.println(a+"+"+b+"="+(a+b));
        int osszeg = osszeadas(a, b);
        String kimenet = a + "+" + b + "=" + osszeg;
        kiir(kimenet);
    }

    private static void egyKivonasKonzolon() {
        kivonasKetSzammal();
    }

    private static void kivonasKetSzammal() {
        int a = 4;
        int b = 4;
        //System.out.println("3-4=?");
        //System.out.println(a+"-"+b+"="+(a-b));
        int osszeg = kivonas(a, b);
        kiir(a + "-" + b + "=" + (a - b));
    }

    static int kivonas(int a, int b) {
        return a - b;
    }

    static void kiir(String uezenet) {
        System.out.println(uezenet);
    }

    private static int osszeadas(int a, int b) {
        //int osszeg=a+b;
        //return osszeg;
        return a + b;

    }

    private static void osszeadas3Szammal() {
        int a = 4;
        int b = 4;
        int c = 7;
        //System.out.println("3+4=?");
        //System.out.println(a+"+"+b+"="+(a+b));
        int osszeg = osszead3(a, b, c);
        kiir(a + "+" + b + "+" + c + "+" + "=" + osszeg);

    }

    private static int osszead3(int a, int b, int c) {
        return a + b + c;
    }

    static int osszeadas(int[] tomb) {
        int osszeg = 0;
        for (int i = 0; i < tomb.length; i++) {
            osszeg += tomb[i];
        }
    }

    static void osszeadasTombbel() {
        int osszeg = oesszeadas(new int[]{1, 2, 3, 4, 5);
        kiir("a tömbelemeinek összege: " + osszeg);
    }

    private static String egyenletKeszito(int[] tomb){
        String gy = tomb[0]+"";
        for (int i = 0; i < tomb; i++) {
            gy 
        }
    }
    
   
}
