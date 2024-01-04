import java.util.*;



public class Course {
	public static void main(String[] args) {
		
		// On déclare notre scanner :
		Scanner scanner = new Scanner(System.in);
		
		// Déclaration de nos variables :
		String response;
		
	
		
		System.out.println("Quelle tiercé Voulez vous jouer :[1-Tiercé],[2-Quarté],[3-Quinté]");
		// On assigne la saisie de l'utilisateur à notre variable et On récupère la saisie de l'utilisateur :
		response = scanner.nextLine();
				
				
				if(response.toLowerCase().equals("1")) 
				{
					System.out.println("Voici votre Tiércer : " );
					Random objGenerator = new Random();
		            for (int iCount = 1; iCount< 4; iCount++){
		              int randomNumber = objGenerator.nextInt(20);
		              System.out.println("cheval : " + randomNumber); 
		             }
					
				}
				else if(response.toLowerCase().equals("2"))
		        {
					System.out.println("Voici votre Quarté : " );
					Random objGenerator = new Random();
		            for (int iCount = 1; iCount< 5; iCount++){
		              int randomNumber = objGenerator.nextInt(20);
		              System.out.println("cheval : " + randomNumber); 
		             }
		        }
				else if(response.toLowerCase().equals("3"))
		        {
					System.out.println("Voici votre Quinté : " );
					Random objGenerator = new Random();
		            for (int iCount = 1; iCount< 6; iCount++){
		              int randomNumber = objGenerator.nextInt(20);
		              System.out.println("cheval : " + randomNumber); 
		             }
		        }
				
				else { // SINON :
					scanner.close();
					System.out.println("A bientôt !");
					
					// On stop le programme :
					System.exit(0);
				}
	}
	
}
