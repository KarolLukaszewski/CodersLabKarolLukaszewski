package pl.coderslab.ckontrolaprzeplywu;

public class Main06 {

	public static void main(String[] args) {
		for (int n = 0; n <= 6; n++) {
			if (n % 2 == 0) {
				System.out.println(n + " - parzysta");
			} else if (n % 2 != 0) {
				System.out.println(n + " - nieparzysta");
			}
		}
		int n = 0;
		while(n <= 6){
			if (n % 2 ==0){
				System.out.println(n + " - parzysta");
			}
			else{
				System.out.println(n + " - nieparzysta");
			}
			n++;
		}
	}
}