import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class Listener implements ActionListener {

    Calculator calculator;
    String temp;
    String temp2;
    String leftString;
    String rightString;
    char action;


    Listener(Calculator c) {
	calculator = c;
	temp = "";
	leftString = "";
	rightString = "";
	action = '@';
    }


    public void actionPerformed(ActionEvent event) {

	String cmd = event.getActionCommand();

	if(cmd.equals("1")) {

	   temp = temp + "1";
	   calculator.textField.setText(temp);
	   calculator.label.setText(temp2);

	} else if(cmd.equals("2")) {

	   temp = temp + "2";
	   calculator.textField.setText(temp);
	   calculator.label.setText(temp);


	} else if(cmd.equals("3")) {

	   temp = temp + "3";
	   calculator.textField.setText(temp);
	   calculator.label.setText(temp);


	} else if(cmd.equals("4")) {

	   temp = temp + "4";
	   calculator.textField.setText(temp);
	   calculator.label.setText(temp);

	} else if(cmd.equals("5")) {

	   temp = temp + "5";
	   calculator.textField.setText(temp);
	   calculator.label.setText(temp);

	} else if(cmd.equals("6")) {

	   temp = temp + "6";
	   calculator.textField.setText(temp);
	   calculator.label.setText(temp);

	} else if(cmd.equals("7")) {

	   temp = temp + "7";
	   calculator.textField.setText(temp);
	   calculator.label.setText(temp);

	} else if(cmd.equals("8")) {

	   temp = temp + "8";
	   calculator.textField.setText(temp);
	   calculator.label.setText(temp);

	} else if(cmd.equals("9")) {

	   temp = temp + "9";
	   calculator.textField.setText(temp);
	   calculator.label.setText(temp);


	} else if(cmd.equals("0")) {

	   temp = temp + "0";
	   calculator.textField.setText(temp);
	   calculator.label.setText(temp);

	} else if(cmd.equals("+")) {

	   leftString = temp;
	   temp = "";
	   action = '+';

	   calculator.label.setText(leftString + " + ");


	} else if(cmd.equals("-")) {

	   leftString = temp;
	   temp = "";
	   action = '-';

	   calculator.label.setText(leftString + " - ");

	} else if(cmd.equals("*")) {


	   leftString = temp;
	   temp = "  ";
	   action = '*';
	   calculator.label.setText(leftString + " * ");


	} else if(cmd.equals("/")) {


	   leftString = temp;
	   temp = "";
	   action = '/';
	   calculator.label.setText(leftString + " / ");


	} else if(cmd.equals("1/x")) {

	   leftString = "1";

	   rightString = temp;
	   temp = "";

	   double numberLeft = Double.parseDouble(leftString);
	   double numberRight = Double.parseDouble(rightString);


	   double result = numberLeft / numberRight ;

	   String answer = "" + result;

	   calculator.textField.setText(answer);
	   calculator.label.setText(answer);

	   temp = "";

	} else if(cmd.equals("Sqrt")) {

	   leftString = temp;
	   temp = "";

	   double numberLeft = Double.parseDouble(leftString);

	   double result = Math.sqrt(numberLeft);

	   String answer = "" + result;

	   calculator.textField.setText(answer);

	} else if(cmd.equals("%")) {

//	   leftString = temp;

	   rightString = temp;

	   temp = "";

	   double numberLeft = Double.parseDouble(leftString);
	   double numberRight = Double.parseDouble(rightString);


	   double result = (numberLeft * numberRight) / 100 ;


	   String answer = "" + result;

	   calculator.textField.setText(answer);
	   calculator.label.setText(answer);

	   temp = "";



	} else if(cmd.equals("C")) {


	   temp = "";
	   leftString = "";
	   rightString = "";
	   action = '@';

	   String answer = "";

	   calculator.textField.setText(answer);
	   calculator.label.setText(answer);


	} else if(cmd.equals("=")) {

	   rightString = temp;



	   double numberLeft = Double.parseDouble(leftString);
	   double numberRight = Double.parseDouble(rightString);
	   double result = 0;

	   switch(action){

		case '+':

			result = numberLeft + numberRight;

		break;

		case '-':

			result = numberLeft - numberRight;

		break;

		case '*':

			result = numberLeft * numberRight;

		break;

		case '/':

			result = numberLeft / numberRight;

		break;

/*		case '1/x':

			result = 1 / numberLeft;

		break;
*/

	   }


	   String answer = "" + result;

	   calculator.textField.setText(answer);
	   calculator.label.setText(answer);

	   temp = "";



	}


//System.out.println("temp = " + temp + " leftString = " + leftString + " rightString = " + rightString);

System.out.println("leftString=" + leftString + " " + action + " " + "rightString=" + rightString);


    }
}