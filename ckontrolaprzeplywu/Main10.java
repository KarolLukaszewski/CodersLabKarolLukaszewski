package pl.coderslab.ckontrolaprzeplywu;

public class Main10 {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            String row = "";

            for (int j = 1; j <= n; j++) {
                row = "* ";
                if (j <= i) {
                    System.out.print(row);
                }
                else {
                    System.out.print(j + " ");
                }
            }
            System.out.println(" ");
        }
        int q = 5;
        for(int x = 5; x >= 0; x--) {
            String pusty = "";
            for(int y = 1; y <= q; y++) {
                String gwiazdka = "* ";
                if (y <= x){
                    System.out.print(gwiazdka);
                }
                else {
                    System.out.print(y + " ");
                }
            }
            System.out.println(" ");
        }
    }

}
