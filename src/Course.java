import java.util.*;

//course hippique de 12 à 20 chevaux 
//Un tiercé s’intéresse au classement des 3 premiers
//un quarté des 4 premiers
//un quinté des 5 premiers
//Le programme demande en boucle à l’utilisateur le nombre de chevaux de la course et son type jusqu’à ce qu’il indique  que le programme se termine
//affiche alors une arrivée tirée aléatoirement de la course.




public class Course {
	public static void main(String[] args) {

		// On déclare notre scanner :
		Scanner scanner = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);

		// Déclaration de nos variables :
		String response;

		int hors;

		boolean command = false;
		
		mauvaichois(1);
		System.out.println(getMonMessage());
		
		
		while (command == false) {
			System.out.println("Combien de chevaux voulez vous ?");
			hors = sc.nextInt();
			

			System.out.println("Quelle tiercé Voulez vous jouer :[1-Tiercé],[2-Quarté],[3-Quinté];[4-Exit]");
			response = scanner.nextLine();

			if (response.toLowerCase().equals("1")) 
			{

				 creatrandom("voici votre Tiérce" , 4 ,hors);
				


			}
			else if (response.toLowerCase().equals("2"))
			{

				
					creatrandom("voici votre Quarté" , 5, hors);
				
			}
			else if (response.toLowerCase().equals("3"))
			{
				
					creatrandom("voici votre Quinté" , 6,hors);
				


			}
			else if (response.toLowerCase().equals("4"))
			{
				racesOver = true;
				System.out.println("A bientot " );
			}
			else {
				System.out.println("Mauvai chois");
			}
		}

	}
private static void mauvaichois(int tata) {
	System.out.println(tata);
}

private static  String getMonMessage () {
	String message = "coucou toi ";
	return message;
}

private static void creatrandom(String text, int count ,int hors) {
	System.out.println(text );
	Random objGenerator = new Random();
	for (int iCount = 1; iCount< count; iCount++){
		int randomNumber = objGenerator.nextInt(hors);
		System.out.println("cheval : " + randomNumber +" sur "+ hors); 
		}
	}	
}
