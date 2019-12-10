import java.util.Scanner;


public class Conversion {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		char response;
		char retry;
		float temperature;
		float fahrenheit;
		float celcius;
		
		System.out.println("CONVERTISSEUR DEGRES CELCIUS ET DEGRES FAHRENHEIT \n ----------------------------------------------------- ");

		do {
		System.out.println("Quelle conversion veux-tu faire ? (A/B) \n - A : Celcius -> Fahrenheit \n - B : Fahrenheit -> Celcius ");
		response = sc.nextLine().charAt(0);
			
			while (response != 'A' && response != 'B') {
				System.out.println("La réponse doit etre A ou B \n Quelle conversion veux-tu faire ? (A/B) \n - A : Celcius -> Fahrenheit \n - B : Fahrenheit -> Celcius ");
				response = sc.nextLine().charAt(0);
			}
			
			if (response == 'A') {
				System.out.println("Conversion en Fahrenheit... \n Ecris la température en Celcius que tu veux convertir :");
				temperature = sc.nextFloat();
				fahrenheit = ((9 * temperature)/5) + 32;
				System.out.println("Résultat de la conversion : \n " +temperature+ " °C correspond à " +fahrenheit+ " °F");
			} else if (response == 'B') {
				System.out.println("Conversion en Celcius... \n Ecris la température en Fahrenheit que tu veux convertir :");
				temperature = sc.nextFloat();
				celcius = ((temperature - 32)*5) / 9;
				System.out.println("Ton résultat : \n " +temperature+ " °F correspond à " +celcius+ " °C");
			}
					
			
			//retry = ' ';
			System.out.println("Une autre conversion ? (Y/N)");
			retry = sc.nextLine().charAt(0);
			while (retry != 'Y' && retry != 'N') {
				System.out.println("La réponse doit être Y ou N \n - Y : Yes please ! \n - N : No thanks ! ");
				retry = sc.nextLine().charAt(0);
			}
			
		} while (retry == 'O');
			System.out.println("Merci, à la prochaine ! ");
	}		
}


