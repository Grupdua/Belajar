package PrintSuhu;
//Print suhu
//      suhu = 0 -> print beku
//      suhu >0 dan < 30 -> print dingin
//      suhu >=30 dan <40 -> print hangat
//      suhu >=40 dan <70 -> print panas
//      suhu >=70 dan <100 -> print hampir mendidih
//      suhu >= 100 dan <120->  print mendidih
//      suhu >= 120  ->  print gosong

public class Suhu {
    public static void main(String args[]) {

        int Suhu = 76;
        System.out.println("Suhunya adalah: " + Suhu);

        if (Suhu == 0) {
            System.out.println("Beku");
        } else if (Suhu > 0 && Suhu < 30) {
            System.out.println("Dingin");
        } else if (Suhu >= 30 && Suhu < 40) {
            System.out.println("Hangat");
        } else if (Suhu >= 40 && Suhu < 70) {
            System.out.println("Panas");
        } else if (Suhu >= 70 && Suhu < 100) {
            System.out.println("Hampir Mendidih");
        } else if (Suhu >= 100 && Suhu < 120) {
            System.out.println("Mendidih");
        } else if (Suhu >= 120) {
            System.out.println("Gosong");
        }
    }
}
//nilai 100
