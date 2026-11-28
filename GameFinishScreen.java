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
public class GameFinishScreen {
    JFrame textBoxScreen;
    JPanel textBoxPanel;
    JPanel continueButtonPanel;
    JTextArea textBox;
    Font buttonFont = new Font("Arial", Font.PLAIN, 30);
    JButton continueButton;
    public GameFinishScreen()
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
        textBox = new JTextArea(" You did it you beat the other you and in an effort to get out of this house as quickly as possible you decide to take your chances outside and walk the road until you find some help. "
                + "Good for you, you come across another car but who’s that inside and doesn’t he look a lot like you. "
                + "(THE END).");
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
        continueButton = new JButton("Quit");
        continueButton.setBackground(Color.black);
        continueButton.setForeground(Color.white);
        continueButton.setFont(buttonFont);
        continueButtonPanel.add(continueButton);
        textBoxScreen.add(continueButtonPanel);
        continueButton.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        
        textBoxScreen.setVisible(true);
    }
    
}
