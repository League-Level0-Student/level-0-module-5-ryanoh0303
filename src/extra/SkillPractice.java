package extra;
import java.util.Random;

import javax.swing.JOptionPane;
public class SkillPractice {
	public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		          	skills.skill1();
		          	skills.skill2();
		          	skills.skill3();
		          	skills.skill4();
		          	skills.skill5();
		}

		void skill1() {
			String y= JOptionPane.showInputDialog("How many dimes do you have?");
		// Use pop-ups for the following.
		// Ask the user how many dimes they have


             int x= Integer.parseInt(y);
             System.out.println("You have "+x*10+" cents");

		// Tell them how many cents they have (hint multiply by 10)




		// Ask the user how tall they are (inches)
          String height= JOptionPane.showInputDialog("What is your height in inches?");
          
          int height2= Integer.parseInt(height);
          if(height2<36) {
        	      JOptionPane.showMessageDialog(null, "Eat your Wheaties");
          }



		// If they are shorter than 36 inches, tell them to eat their Wheaties




		}

		void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
          for(int i=1; i<31; i++) {
        	   if(i%3==0) {
        		   System.out.println(i);
        	   }
        	  
          }






		}

		void skill3() { // Get a random number that is less than 20 and print it to the console  
			Random rand= new Random();
			int random=rand.nextInt(20);
            System.out.println(random);


		// Get another random number that is less than 10 and print it to the console 
            int random2= rand.nextInt(10);
            System.out.println(random2);


		// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
            JOptionPane.showMessageDialog(null,"The difference between the 2 numbers are "+ (random-random2));


		}

		void skill4() { // In a pop-up, ask the user for the city they live in 
              String city= JOptionPane.showInputDialog("What city do you live in?");


		// If they answered "San Diego", tell them they live in America's Finest City 
         if(city.equalsIgnoreCase(city)) {
        	   JOptionPane.showMessageDialog(null, "You live in America's Finest City");
         }
         else {
        	 JOptionPane.showMessageDialog(null,"Move to San Diego");
         }


		// Otherwise, tell them to move to San Diego 



		// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 

           String car= JOptionPane.showInputDialog("How many cars does your family have?");
           int car2= Integer.parseInt(car);
           
           if(car2==0) {
              JOptionPane.showMessageDialog(null, "I bet you use public transportation");
           }
           else if(car2==1) {
        	   JOptionPane.showMessageDialog(null, "Model x");
           }
           else if(car2>1) {
        	    JOptionPane.showMessageDialog(null,"You have "+ 4*car2+" wheels in total.");
           }

		// If there is 1 car, use a pop-up to display the make/model of the car 



		// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



		}

		void skill5() { // In a pop-up, ask the user for the name of their school 

           String school= JOptionPane.showInputDialog("What school do you go to?");
           JOptionPane.showMessageDialog(null,"You go to a fantastic school: "+ school);

		// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 



		}
		

}

