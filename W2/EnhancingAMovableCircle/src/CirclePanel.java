import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CirclePanel extends JPanel
{
    private final int CIRCLE_SIZE = 50;
    private int x,y,widthframe,heightframe;
    private Color c;
    // Create buttons to move the circle
    private JButton left = new JButton("Left");
    private JButton right = new JButton("Right");
    private JButton up = new JButton("Up");
    private JButton down = new JButton("Down");
    public CirclePanel(int width, int height)// Set up circle and buttons to move it.
    {
        widthframe=width; // Set coordinates so circle starts in middle
        heightframe=height;
        x = (width/2)-(CIRCLE_SIZE/2);
        y = (height/2)-(CIRCLE_SIZE/2);
        c = Color.green;
        this.setLayout(new BorderLayout());// Need a border layout to get the buttons on the bottom
        left.addActionListener(new MoveListener(-20,0)); // Add listeners to the buttons
        left.setMnemonic(KeyEvent.VK_L);
        left.setToolTipText("Left Move");
        right.addActionListener(new MoveListener(20,0));
        right.setMnemonic(KeyEvent.VK_R);
        right.setToolTipText("Right Move");
        up.addActionListener(new MoveListener(0,-20));
        up.setMnemonic(KeyEvent.VK_U);
        up.setToolTipText("Up Move");
        down.addActionListener(new MoveListener(0,20));
        down.setMnemonic(KeyEvent.VK_D);
        down.setToolTipText("Down Move");
        JPanel buttonPanel = new JPanel(); // Need a panel to put the buttons on or they'll be on top of each other.
        buttonPanel.add(left);
        buttonPanel.add(right);
        buttonPanel.add(up);
        buttonPanel.add(down);
        this.add(buttonPanel, "South"); // Add the button panel to the bottom of the main panel
    }
    public void paintComponent(Graphics page) // Draw circle on CirclePanel
    {
        super.paintComponent(page);
        page.setColor(c);
        page.fillOval(x,y,CIRCLE_SIZE,CIRCLE_SIZE);
    }
    private class MoveListener implements ActionListener // Class to listen for button clicks that move circle.
    {
        private int dx;
        private int dy;
        public MoveListener(int dx, int dy) // Parameters tell how to move circle at click.
        {
            this.dx = dx;
            this.dy = dy;
        }
        public void actionPerformed(ActionEvent e) // Change x and y coordinates and repaint.
        {
            x += dx;
            y += dy;
            if(x<0){
                x=0;
                left.setEnabled(false);
            }else{
                left.setEnabled(true);
            }
            if(x>widthframe){
                x=widthframe;
                right.setEnabled(false);
            }else{
                right.setEnabled(true);
            }
            if(y<0){
                y=0;
                up.setEnabled(false);
            }else{
                up.setEnabled(true);
            }
            if(y>heightframe){
                y=heightframe;
                down.setEnabled(false);
            }else{
                down.setEnabled(true);
            }
            repaint();
        }
    }
}