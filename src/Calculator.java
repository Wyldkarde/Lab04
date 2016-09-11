import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;



public class Calculator
{
    private JFrame calcFrame;
    private JTextField leftOperand;
    private JTextField rightOperand;
    private jlResults = new JLabel("Results = " + sum);
    public JFrame getcalcFrame()
    private int sum = 0;
    
    {
        return calcFrame;
    }

    public Calculator()
    {
        JFrame   calculatorFrame;
        calculatorFrame = new JFrame();
        calculatorFrame.setLocation(100,100);
        calculatorFrame.setSize(400,400);
        calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculatorFrame.setTitle("Basic Calculator");

        initializeComponents();  //Create and add all components
        calculatorFrame.setVisible(true);
    }
    public void initializeComponents()
    {
        Calculator.add(calcNorth(), BorderLayout.PAGE_START);
        Calculator.add(calcCenter(), BorderLayout.CENTER);
        Calculator.add(results(),BorderLayout.PAGE_END);
    }

    private JPanel calcNorth()
    {
        JTextField leftOperand = new JTextField(10);
        JTextField rightOperand = new JTextField(10);
        
        JPanel calcNorth = new JPanel();
        calcNorth.add(leftOperand);
        calcNorth.add(rightOperand);
    }
    private JPanel calcCenter()
    {
        JPanel calcCenter = new JPanel();
        calcCenter.add(jlResults);
    }
    private JPanel calcSouth()
    {
        JButton addButton = new JButton("ADD");
        JButton subButton = new JButton("SUB");
        JButton multButton = new JButton("MULT");
        JButton divButton = new JButton("DIV");
                
        JPanel calcCenter = new JPanel();
        calcCenter.add(addButton);
        calcCenter.add(subButton);
        calcCenter.add(multButton);
        calcCenter.add(divButton);
        
    }
    
    public void updateClicked()
    {
        //Get the user text from the text field
        String t = leftOperand.getText();

        //Check to see if it is blank
        if (!t.trim().equals(""))
        {
            //If it is not blank set the test on the label
            rightOperand.setText(t);
        }
        
    }

}
