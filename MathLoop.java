import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Alert;
import javafx.stage.Stage;



public class MathLoop extends Application {
	public void start (Stage primaryStage){
		TextInputDialog input = new TextInputDialog();
		Alert output = new Alert(AlertType.INFORMATION);
		input.setTitle("Math Loop Program");
		input.setHeaderText("Please enter an Integer");
		input.showAndWait();
		int number = Integer.parseInt(input.getResult());
		int count = number;
		int factorial = number;
		int odd=0;
		int oddCount;
		int fib1 = 0;
		int fib2 = 1;
		int fibonacci=0;
		

		while (count>1){
			factorial = factorial *(count-1);
			count--;
			}

		if (number%2==0){
			oddCount = number-1;
		} else {
			oddCount = number;
		}
		
		
		for (count=oddCount;count>0;count=count-2){
			odd=odd+count;
			}
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

