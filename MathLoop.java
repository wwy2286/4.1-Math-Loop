import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
William Yu <br>
3/28/17 <br>
wwy2286@gmail.com <br>
purpose of the program: To use loop solve math problems
*/


public class MathLoop extends Application {
	public void start (Stage primaryStage){
		// create text input and alert out put
		TextInputDialog input = new TextInputDialog();
		Alert output = new Alert(AlertType.INFORMATION);
		int number;
		do {
		input.setTitle("Math Loop Program");
		input.setHeaderText("Please enter an Integer");
		input.showAndWait();
		number = Integer.parseInt(input.getResult()); // get input from user
		if (number<0){
			output.setTitle("Error");
			output.setContentText("Please enter a positive integer");
			output.showAndWait();
			}
		}while(number<0);
		int count = number; // have the count = the user input. this way we can use it for all three applications
		int factorial = number; //get the initial factorial to equal user input
		int odd=0; // set initial odd to 0. this is used later to find if the number is odd or not
		int oddCount; // variable to find the odd number count
		int fib1 = 0; // vallues to use for fibonacci number
		int fib2 = 1; 
		int fibonacci=0;
		
		if (count==0){
		factorial = 1;
		}else{
		while (count>1){
			factorial = factorial *(count-1);
			count--;
			}
		}
		//the code below is to find the highest odd number from what the user input
		if (number%2==0){
			oddCount = number-1;
		} else {
			oddCount = number;
		}
		
		//the code below uses a for statement to add all the oddnumber beginning from the highest odd number of what the user input is
		for (count=oddCount;count>0;count=count-2){
			odd=odd+count;
			}

		//code for fibonacci number
		for (count=number;count>0;count--){
			fibonacci = fib1+fib2;
			fib2= fib1;
			fib1=fibonacci;
		}
			
		output.setTitle("Factorial");
		output.setContentText("The Factorial of " + number + " is " + factorial);
		output.showAndWait();
		output.setTitle("Odd Numbers");
		output.setContentText("The sum of all odd numbers within " + number + " is " + odd);
		output.showAndWait();
		output.setTitle("Fibonacci Number");
		output.setContentText("The Fibonacci number of " + number + " is " + fibonacci);
		output.showAndWait();
	}

}

