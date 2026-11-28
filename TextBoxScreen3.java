package hauntedhousehill;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class TextBoxScreen3 {
    JFrame textBoxScreen;
    JPanel textBoxPanel;
    JPanel continueButtonPanel;
    JTextArea textBox;
    Font buttonFont = new Font("Arial", Font.PLAIN, 30);
    JButton continueButton;
    public TextBoxScreen3()
    {
        textBoxScreen = new JFrame();
        textBoxScreen.setSize(1400,900);
        textBoxScreen.setTitle("Haunted House On The Hill");
        textBoxScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textBoxScreen.getContentPane().setBackground(Color.black);
        textBoxScreen.setLayout(null);
        
        textBoxPanel = new JPanel(new BorderLayout());
        textBoxPanel.setBounds(300,200,800,500);
        textBoxPanel.setBackground(Color.black);
        textBox = new JTextArea("There wasn’t a phone in the room. "
                + "Sorry you had to go through a bunch more of those freaky looking fellows."
                + " It looked like some of them had limbs that’s strange hopefully after tonight this will all be a bad dream. "
                + "And look at the good news theres another set of stair right here. "
                + "Lets go ahead up."
                + "Well look at this its just a straight shooting hallway. "
                + "There’s a set of stairs at the end too. "
                + "I guess we should make our way for those. "
                + "But are those legs coming at you and behind those it looks like someones had their top half cut off. "
                + "Do you think these could be related to the ooze things you fought earlier. "
                + "Well let's fight now and ask questions later.");
        textBox.setLineWrap(true);
        textBox.setWrapStyleWord(true);
        textBox.setEditable(false);
        textBox.setFont(new Font("SansSerif", Font.PLAIN, 16));
        textBox.setMargin(new Insets(15,15,15,15));
        JScrollPane textScroll = new JScrollPane(textBox);
        textBoxPanel.add(textScroll, BorderLayout.CENTER);
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
           new BattleScreenGUI();
           textBoxScreen.setVisible(false);
        });

        
        textBoxScreen.setVisible(true);
    }
    
}
