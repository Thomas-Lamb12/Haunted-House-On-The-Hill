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
public class TextBoxScreen2 
{   
 JFrame textBoxScreen;
    JPanel textBoxPanel;
    JPanel continueButtonPanel;
    JTextArea textBox;
    Font buttonFont = new Font("Arial", Font.PLAIN, 30);
    JButton continueButton;
    
    public TextBoxScreen2()
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
        textBox = new JTextArea("It seems you had to fight a couple of those things sorry about that. "
                + "But on the table in front of you sits a newspaper clipping. "
                + "It reads that 5 years ago there was an accident on a icy road in a place you faintly recall. "
                + "It says there were no survivors in the crash but that they couldn't locate the body of “player name here”. "
                + "(Thats weird isn’t that your name). "
                + "Well lets move on anyways you don’t see any phones down here maybe theres one further upstairs lets go ahead up to the second floor."
                + "Well here it is the second floor, not much different from the first."
                + " You decide to head towards the office room you see. "
                + "If there was a phone on this floor it would be there.");
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
