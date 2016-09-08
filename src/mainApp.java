	import java.util.Scanner;

/**

 * This a demo application for deciding what to wear.
 */

/**
 * @author TheCreativeSuiteMAC
 *
 */
	public class mainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputFancyFriday, inputSunny, inputRaining;
		
		boolean fancyFriday = false;
		boolean sunny = false;
		boolean raining = false;
		
		//Get input from the user
		Scanner userInput = new Scanner(System.in);
		
		System.out.println( " Is it fancy friday? ");
		
		inputFancyFriday = userInput.nextLine();
		
		System.out.println( " Is it sunny? ");
		
		inputSunny = userInput.nextLine();
		
		System.out.println( " Is it raining? ");
		
		inputRaining = userInput.nextLine();
		
		//Test if the variables are working properly
		
		System.out.println(fancyFriday);
		System.out.println(sunny);
		System.out.println(raining);
	
		
		
		//Set condition variables based on user input
		if (inputFancyFriday.equalsIgnoreCase("Yes")){
			fancyFriday = true;
			
		}
		if (inputSunny.equalsIgnoreCase("Yes")){
			sunny = true;
		
		}
		if (inputRaining.equalsIgnoreCase("Yes")){
			raining = true;	
		}	
		//set the If statements to decide what to wear
		if(fancyFriday){
			if(sunny){
				System.out.println( "teagown");
			}else if(raining){
			System.out.println("Powersuit");
			} else {
			System.out.println("Long Gown");
			}
	
		}else {
			System.out.println("Tshirt and Jeans");
		}
		
		
		

	}

}
