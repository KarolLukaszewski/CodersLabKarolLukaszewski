package pl.coderslab.ckontrolaprzeplywu;

public class Main08 {

    public static void main(String[] args){
        int n = 5;
        for (int i = 1; i <= n; i++) {
                String row = "";

            for (int j = 1; j <= n; j++) {
                    row = "* ";
                if (j<=i) {
                    System.out.print(row);
                }
                else {
                    System.out.print(j + " ");
                }
            }
            System.out.println(" ");
        }

    }
}
