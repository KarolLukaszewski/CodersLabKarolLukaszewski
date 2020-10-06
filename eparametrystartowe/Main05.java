package pl.coderslab.eparametrystartowe;

public class Main05 {

    public static void main(String[] args) {
        double F = Double.parseDouble(args[0]);
        double E = Double.parseDouble(args[1]);
        double C = Double.parseDouble(args[2]);
        double A = Double.parseDouble(args[3]);


        double points = 59;
        if (points < 0 || points > 100) {
            System.out.println("BADVALUE");
        }
        if(points >= 0 && points <= 50){
            System.out.println("F");
        }
        else if(points >= 51 && points <= 70){
            System.out.println("E");
        }
        else if(points >= 71 && points <= 90) {
            System.out.println("C");
        }
        else {
            System.out.println("A");
        }


    }

}
