package hauntedhousehill;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class TextBoxScreen3 {
    JFrame textBoxScreen;
    JPanel textBoxPanel;
    JPanel continueButtonPanel;
    JTextField textBox;
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
        
        textBoxPanel = new JPanel();
        textBoxPanel.setBounds(300,200,800,500);
        textBoxPanel.setBackground(Color.white);
        textBox = new JTextField();
        textBox.setBounds(300,200,800,500);
        textBox.setText("");
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
            BattleScreenGUI();
        });

        
        textBoxScreen.setVisible(true);
    }
    
}
