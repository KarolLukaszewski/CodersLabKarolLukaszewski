package pl.coderslab.dtablice;

public class Main07 {

	public static void main(String[] args) {
	double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};
		double avg = 0;
		double ilosc = temps.length;
		double sumaF;
		for (int i = 0; i < temps.length; i++){
			System.out.println((temps[i] * 1.8) + 32);

			avg += temps[i];
			}
		sumaF = avg * 1.8 + 32 * ilosc;
		System.out.print("Średnia temperatur Fahrenhita = ");
		double sredniaTemperatur = sumaF / ilosc;
		System.out.printf("%.2f", sredniaTemperatur);
		}

	}


