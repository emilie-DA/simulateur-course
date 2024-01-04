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

		// Déclaration de nos variables :
		String response;

		boolean command = false;

		while (command == false) {
			System.out.println("Quelle tiercé Voulez vous jouer :[1-Tiercé],[2-Quarté],[3-Quinté];[4-Exit]");
			response = scanner.nextLine();

			if (response.toLowerCase().equals("1")) 
			{
				System.out.println("Voici votre Tiércer : " );
				Random objGenerator = new Random();
				for (int iCount = 1; iCount< 4; iCount++){
					int randomNumber = objGenerator.nextInt(20);
					System.out.println("cheval : " + randomNumber); 
				}

			}
			else if (response.toLowerCase().equals("2"))
			{
				System.out.println("Voici votre Quarté : " );
				Random objGenerator = new Random();
				for (int iCount = 1; iCount< 5; iCount++){
					int randomNumber = objGenerator.nextInt(20);
					System.out.println("cheval : " + randomNumber); 
				}
			}
			else if (response.toLowerCase().equals("3"))
			{
				System.out.println("Voici votre Quinté : " );
				Random objGenerator = new Random();
				for (int iCount = 1; iCount< 6; iCount++){
					int randomNumber = objGenerator.nextInt(20);
					System.out.println("cheval : " + randomNumber); 
				}

			}
			else if (response.toLowerCase().equals("4"))
			{
				command = true;
				System.out.println("A bientot " );
			}
		}

	}

}
