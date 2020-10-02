package pl.coderslab.ckontrolaprzeplywu;

public class Main05 {

	public static void main(String[] args) {
		int resultFor = 0;
		int resultWhile = 0;
		int suma;
		for(int x = 0; x <= 10; x++){
			resultFor+=x;
		}
		System.out.println(resultFor);
		int y = 0;
		while(y <=10){
			resultWhile+=y;
			y++;
		}
		System.out.println(resultWhile);
	}

}
