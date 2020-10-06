package pl.coderslab.eparametrystartowe;

public class Main03 {
    public static void main(String[] args) {


        double param0 = Double.parseDouble(args[0]);
        double param1 = Double.parseDouble(args[1]);
        double param2 = Double.parseDouble(args[2]);
        double liczba = (param0 + param1 + param2) / 3;

        System.out.println(liczba);
    }
}
