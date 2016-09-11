package solution;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;




/**
 * @author Dillingham, Jace
 * @version 09/10/2016
 *
 */

public class Calculator
{
    private JFrame calcFrame;
    private JTextField leftOperand;
    private JTextField rightOperand;
    
    /**
     * Calculator constructor.
     */
    public Calculator()
    {
        JFrame   calculatorFrame;
        calculatorFrame = new JFrame();
        calculatorFrame.setLocation(100, 100);
        calculatorFrame.setSize(400, 400);
        calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculatorFrame.setTitle("Basic Calculator");

        setFrame(calculatorFrame);
        initializeComponents(); 

        calculatorFrame.setVisible(true);
        
    }

    /**
     * Main method.
     * @param args unused.
     */
    public static void main(String args[])
    {
        Calculator c = new Calculator();
    }
 
    /**
     *  Accessor for calcFrame.
     * @return calcFrame.
     */
    public JFrame getFrame()
    {
        return calcFrame;
    }    
    
    /**
     * Mutator for calcFrame.
     * @param calcFrame
     */
    public void setFrame(JFrame calcFrame)
    {
        this.calcFrame = calcFrame;
    }
    
    /**
     * Constructor for components.
     */
    public void initializeComponents()
    {   
        JFrame frm = this.getFrame();
        frm.add(calcNorth(), BorderLayout.PAGE_START);
        frm.add(results(), BorderLayout.CENTER);
        frm.add(calcCenter(), BorderLayout.PAGE_END);
    }
    
    /**
     * Constructor for north calc panel.
     * @return north panel of calculator.
     */
    private JPanel calcNorth()
    {
        JTextField leftOperand = new JTextField(10);
        JTextField rightOperand = new JTextField(10);
        
        JPanel calcNorth = new JPanel();
        calcNorth.add(leftOperand);
        calcNorth.add(rightOperand);
        //added return
        return calcNorth;
    }
    
    /**
     * Constructor for center calc panel.
     * @return center calc panel.
     */
    private JPanel calcCenter()
    {
        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton multButton = new JButton("*");
        JButton divButton = new JButton("/");
        JButton calcTotal = new JButton("=");
        
        JPanel calcCenter = new JPanel();
        calcCenter.add(addButton);
        calcCenter.add(subButton);
        calcCenter.add(multButton);
        calcCenter.add(divButton);
        calcCenter.add(calcTotal);

        return calcCenter;
    }
    
    /**
     * Constructor for result panel.
     * @return results panel.
     */
    private JPanel results()
    {
        JPanel resPanel = new JPanel();
        JLabel resLabel = new JLabel();
        
        return resPanel;
    }
    
    /**
     * Updater for button click.
     */
    public void updateClicked()
    {
        //Get the user text from the text field
        String results = leftOperand.getText();

        //Check to see if it is blank
        if (!results.trim().equals(""))
        {
            //If it is not blank set the test on the label
            rightOperand.setText(results);
        }
        
    }
}
