package hauntedhousehill;
import java.awt.Color;
import static java.awt.Color.white;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextBoxScreen
{   
    JFrame textBoxScreen;
    JPanel textBoxPanel;
    JPanel continueButtonPanel;
    JTextArea textBox;
    Font buttonFont = new Font("Arial", Font.PLAIN, 30);
    JButton continueButton;
    
    public TextBoxScreen()
    {
        textBoxScreen = new JFrame();
        textBoxScreen.setSize(1400,900);
        textBoxScreen.setTitle("Haunted House On The Hill");
        textBoxScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textBoxScreen.getContentPane().setBackground(Color.black);
        textBoxScreen.setLayout(null);
        
        textBoxPanel = new JPanel();
        textBoxPanel.setBounds(300,200,800,500);
        textBoxPanel.setBackground(Color.white);
        textBox = new JTextArea();
        textBox.setBounds(300,200,800,500);
        textBox.setText("you find yourself stranded, your lost, you don’t remember how you got here and you have nowhere to go. "
                + "You don’t know where you are and you don’t know what to do. "
                + "It looks to be road for miles ahead and you know there’s nothing but road behind you as well. "
                + "But lucky for you there seems to be a clearing right up the small hill next to your car. "
                + "After a bit of walking you spot a massive mansion (has to be at least 4 floors maybe more if the designers are able to finish that endless mode before the project end date). "
                + "Oh and it started pouring rain (end of that lucky streak I guess), without another option you decide to go knock on the door and see if anyone's home. "
                + "the door has one of those fancy doorknockers so you give at knock only for the door to swing open. And you being the polite person you are decide to let yourself into this poor person’s home. "
                + "At least you decide to let out a “I’m going to go ahead and let myself in!” as to not frighten anyone who may not have seen you enter the house. "
                + "If only you knew what you had gained the attention of within the home.");
        textBox.setEditable(false);
        textBoxPanel.add(textBox);
        textBoxScreen.add(textBoxPanel);
        
        continueButtonPanel = new JPanel();
        continueButtonPanel.setBounds(500,700,400,150);
        continueButtonPanel.setBackground(Color.black);
        continueButton = new JButton("Continue...");
        continueButton.setBackground(Color.black);
        continueButton.setForeground(Color.white);
        continueButton.setFont(buttonFont);
        continueButtonPanel.add(continueButton);
        textBoxScreen.add(continueButtonPanel);
        continueButton.addActionListener((ActionEvent e) -> {
            
        });

        
        textBoxScreen.setVisible(true);
    }
    public static void main(String[] args) 
    {
        new TextBoxScreen();
    }
    
}
