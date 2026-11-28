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
public class BossTextScreen {
    JFrame textBoxScreen;
    JPanel textBoxPanel;
    JPanel continueButtonPanel;
    JTextArea textBox;
    Font buttonFont = new Font("Arial", Font.PLAIN, 30);
    JButton continueButton;
    public BossTextScreen()
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
        textBox = new JTextArea("Theres 2 giant tubes in the center of the room. One of them is broken and its leaking from the massive whole in the glass. "
                + "You look at the other tube and to your surprise there’s a person inside and they look just like you. "
                + "But there’s no time to think about what that could mean right now you need to get out of here. "
                + "Gladly it looks like there’s just one more room ahead of you."
                + "as you enter the room you feel something hit you hard. "
                + "It knocks you out cold. "
                + "But as you wake up and enter the room again you spot a person with a coat on covered in blood in the floor and standing above him is you. "
                + "Or is it, could it be the other you from the tube. "
                + "Which of you is the original you wonder. But the other you begins to speak “You finally woke up. "
                + "Now that your in here you understand that there can only be one of us right? I think you know what is going to happen next”. "
                + "You better get ready it looks like this will be the last and greatest fight of your night.");
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
