package pl.coderslab.eparametrystartowe;

public class Main04 {

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        if (a + b > c){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}