import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.*;

class Calculator{

    JTextField textField;
    JLabel label;



    Calculator(){
	System.out.println("Start Calculator!");


	Listener controller = new Listener(this);


	textField = new JTextField();
	textField.setBounds(20, 20, 550, 45);

	label = new JLabel("Java");
	label.setBounds(20, 400, 550, 45);


	JButton buttonMc = new JButton("Mc");
	JButton buttonMr = new JButton("Mr");
	JButton buttonMs = new JButton("Ms");
	JButton buttonMp = new JButton("M+");
	JButton buttonMm = new JButton("M-");
	JButton buttonBack = new JButton("<--");
	JButton buttonCe = new JButton("Ce");

	JButton buttonC = new JButton("C");
	buttonC.addActionListener(controller);


	JButton buttonPM = new JButton("+/-");
	JButton buttonSqrt = new JButton("Sqrt");
	buttonSqrt.addActionListener(controller);

	JButton button7 = new JButton("7");
	button7.addActionListener(controller);

	JButton button8 = new JButton("8");
	button8.addActionListener(controller);

	JButton button9 = new JButton("9");
	button9.addActionListener(controller);

	JButton buttonDiv = new JButton("/");
	buttonDiv.addActionListener(controller);

	JButton buttonProsent = new JButton("%");
	buttonProsent.addActionListener(controller);

	JButton button4 = new JButton("4");
	button4.addActionListener(controller);

	JButton button5 = new JButton("5");
	button5.addActionListener(controller);

	JButton button6 = new JButton("6");
	button6.addActionListener(controller);

	JButton buttonMult = new JButton("*");
	buttonMult.addActionListener(controller);

	JButton buttonBirX = new JButton("1/x");
	buttonBirX.addActionListener(controller);

	JButton button1 = new JButton("1");
	button1.addActionListener(controller);
	

	JButton button2 = new JButton("2");
	button2.addActionListener(controller);

	JButton button3 = new JButton("3");
	button3.addActionListener(controller);

	JButton buttonMinus = new JButton("-");
	buttonMinus.addActionListener(controller);

	JButton buttonEqual = new JButton("=");
	buttonEqual.addActionListener(controller);

	JButton button0 = new JButton("0");
	button0.addActionListener(controller);

	JButton buttonZap = new JButton(",");
	buttonZap.addActionListener(controller);

	JButton buttonPluse = new JButton("+");
	buttonPluse.addActionListener(controller);



	//.buttonZero.setBounds(x, y, width, heigth);
	buttonMc.setBounds(30, 100, 100, 40);
	buttonMr.setBounds(140, 100, 100, 40);
	buttonMs.setBounds(250, 100, 100, 40);
	buttonMp.setBounds(360, 100, 100, 40);
	buttonMm.setBounds(470, 100, 100, 40);

	buttonBack.setBounds(30, 150, 100, 40);
	buttonCe.setBounds(140, 150, 100, 40);
	buttonC.setBounds(250, 150, 100, 40);
	buttonPM.setBounds(360, 150, 100, 40);
	buttonSqrt.setBounds(470, 150, 100, 40);

	button7.setBounds(30, 200, 100, 40);
	button8.setBounds(140, 200, 100, 40);
	button9.setBounds(250, 200, 100, 40);
	buttonDiv.setBounds(360, 200, 100, 40);
	buttonProsent.setBounds(470, 200, 100, 40);

	button4.setBounds(30, 250, 100, 40);
	button5.setBounds(140, 250, 100, 40);
	button6.setBounds(250, 250, 100, 40);
	buttonMult.setBounds(360, 250, 100, 40);
	buttonBirX.setBounds(470, 250, 100, 40);
	
	button1.setBounds(30, 300, 100, 40);
	button2.setBounds(140, 300, 100, 40);
	button3.setBounds(250, 300, 100, 40);
	buttonMinus.setBounds(360, 300, 100, 40);
	buttonEqual.setBounds(470, 300, 100, 90);

	button0.setBounds(30, 350, 210, 40);
	buttonZap.setBounds(250, 350, 100, 40);
	buttonPluse.setBounds(360, 350, 100, 40);


	JFrame window = new JFrame();
	window.setSize(650, 550);
        window.setLocation(100, 100);
	window.setTitle("Calculator by Mairambek");

	window.setLayout(null);
	window.add(textField);
	window.add(label);
	window.add(buttonMc);
	window.add(buttonMr);
	window.add(buttonMs);
	window.add(buttonMp);
	window.add(buttonMm);
	window.add(buttonBack);
	window.add(buttonCe);
	window.add(buttonC);
	window.add(buttonPM);
	window.add(buttonSqrt);

	window.add(button7);
	window.add(button8);
	window.add(button9);
	window.add(buttonDiv);
	window.add(buttonProsent);

	window.add(button4);
	window.add(button5);
	window.add(button6);
	window.add(buttonMult);
	window.add(buttonBirX);

	window.add(button1);
	window.add(button2);
	window.add(button3);
	window.add(buttonMinus);
	window.add(buttonEqual);

	window.add(button0);
	window.add(buttonZap);
	window.add(buttonPluse);


	window.setVisible(true);

    }
}