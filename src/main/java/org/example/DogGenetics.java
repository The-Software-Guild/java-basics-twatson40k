package org.example;
import java.util.Random;
import java.util.Scanner;
// Dog Genetics code
public class DogGenetics {
    public static void main(String[] args) {
		Random random = new Random();
		Scanner in = new Scanner(System.in);
		int i;
		String dogName = "";
		String [] dogBreed = {"St. Bernard","Chihuahua","Dramatic RedNosed Asian Pug","Common Cur", "King Doberman"};
		int remaining_percent = 100;
		// If blank, repeats the question
		while (dogName.isBlank()) {
			System.out.println("What is your dog's name? ");
			dogName = in.nextLine();

		}
		
		System.out.println("Well then, I have this highly reliable report on " + dogName+
				"'s prestigious background right here.");
			// goes through the breeds and gives them a random percentage
			for (i = 0; i < dogBreed.length; i++) {
				if (i < dogBreed.length - 1) {
					int percent = random.nextInt(remaining_percent);
					remaining_percent -= percent;
					System.out.println(percent + "% " + dogBreed[i] + ", ");
				} else {
					System.out.println(remaining_percent + "% " + dogBreed[i]);
				}
			//}
		}

	}

}

//System.out.print("What is your dog's name?" + dogName);
//System.out.print("Well then, I have this highly reliable report on" + dogName + "'s prestigious background right here.");
//System.out.print(dogName + " is:");
//System.out.print(61 +  "% St. Bernard");
//System.out.print(2 + "% Chihuahua");
//System.out.print(29 + "% Dramatic RedNosed Asian Pug");
//System.out.print(1 + "% Common Cur");
//System.out.print(7 + "% King Doberman");