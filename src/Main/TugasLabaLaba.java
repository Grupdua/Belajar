package Main;

//tugas buat jaring laba-laba
public class TugasLabaLaba {
    public static void main(String[] args) {
        int a = 11;
        for (int b = 0; b < a; b++) {  //baris
            for (int c = 0; c < a; c++) { //colom

                if (b == 1 && c == 1 && c <= 1|| b >= 2 && b <= 3 && c >= 2 && c <= 3 || b >= 4 && b <= 6 && c >= 4 &&
                        c <= 6 || b >= 7 && b <= 11 && c >= 7 && c <= 11){

                    System.out.print("x");
                } else System.out.print(" ");

            }
            System.out.println();
        }
    }
}
