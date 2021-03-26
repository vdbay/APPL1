import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class RatePanel extends JPanel
{
    private double[] rate; // exchange rates
    private String[] currencyName;
    private JTextArea result;
    private JLabel empty= new JLabel("");
    private JLabel texts;
    private JTextField input;
    private JComboBox<String> currency;
    private DecimalFormat decimalFormat = new DecimalFormat("##.##");
    // ------------------------------------------------------------
// Sets up a panel to convert cost from one of 6 currencies
// into U.S. Dollars. The panel contains a heading, a text
// field for the cost of the item, a combo box for selecting
// the currency, and a label to display the result.
// ------------------------------------------------------------
    public RatePanel ()
    {
        this.setBackground(new Color(41,121,255));
        this.setLayout(new GridLayout(4,2,2,2));
        this.setBorder(new EmptyBorder(10,10,10,10));
        JLabel title = new JLabel ("How much is that in dollars?");
        title.setAlignmentX (Component.CENTER_ALIGNMENT);
        title.setFont (new Font ("Helvetica", Font.BOLD, 20));
// Set up the arrays for the currency conversions
        currencyName = new String[] {"Select the currency..",
                "European Euro", "Canadian Dollar",
                "Japanese Yen", "Australian Dollar",
                "Indian Rupee", "Mexican Peso"};
        rate = new double [] {0.0, 1.2103, 0.7351,
                0.0091, 0.6969,
                0.0222, 0.0880};
        result = new JTextArea(" ");
        currency=new JComboBox<>(currencyName);
        input=new JTextField(8);
        currency.addActionListener(new ComboListener());
        add(title);
        add(empty);
        texts=new JLabel("Input Money :");
        add(texts);
        add(input);
        texts=new JLabel("Select Currencies :");
        add(texts);
        add(currency);
        texts=new JLabel("Result:");
        add(texts);
        result=new JTextArea("");
        result.setEditable(false);
        add(result);
    }
    // ******************************************************
// Represents an action listener for the combo box.
// ******************************************************
    private class ComboListener implements ActionListener
    {
        // --------------------------------------------------
// Determines which currency has been selected and
// the value in that currency then computes and
// displays the value in U.S. Dollars.
// --------------------------------------------------
        public void actionPerformed (ActionEvent event)
        {
            try{
                int index = currency.getSelectedIndex();
                result.setText (input.getText() +" "+ currencyName[index] +
                        " = " + decimalFormat.format(rate[index]*Float.parseFloat(input.getText())) + " U.S. Dollars");
            }catch (Exception e){
            }


        }
    }
}