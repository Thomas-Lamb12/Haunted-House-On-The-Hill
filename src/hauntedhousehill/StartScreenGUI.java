package startscreengui;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class StartScreenGUI 
{
    JFrame startScreen;
    JPanel titleNamePanel;
    JPanel startButtonPanel;
    JPanel quitButtonPanel;
    JLabel titleNameLabel;
    Font titleFont = new Font("Arial", Font.BOLD,60);
    Font buttonFont = new Font("Arial", Font.PLAIN, 60);
    JButton startButton;
    JButton quitButton;
    
        public StartScreenGUI()
        {        
        startScreen = new JFrame();
        startScreen.setSize(1400,900);
        startScreen.setTitle("Haunted House On The Hill");
        startScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startScreen.getContentPane().setBackground(Color.black);
        startScreen.setLayout(null);
        //startScreen.setVisible(true);
        
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(300,200,800,300);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("Haunted House On The Hill");
        titleNameLabel.setForeground(Color.white);
        titleNamePanel.add(titleNameLabel);
        titleNameLabel.setFont(titleFont);
        startScreen.add(titleNamePanel);
        
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(500,500,400,150);
        startButtonPanel.setBackground(Color.black);
        //startScreen.add(startButtonPanel);
        startButton = new JButton("Start");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(buttonFont);
        startButtonPanel.add(startButton);
        startScreen.add(startButtonPanel);
        
        quitButtonPanel = new JPanel();
        quitButtonPanel.setBounds(500,700,400,150);
        quitButtonPanel.setBackground(Color.black);
        //startScreen.add(quitButtonPanel);
        quitButton = new JButton("Quit");
        quitButton.setBackground(Color.black);
        quitButton.setForeground(Color.white);
        quitButton.setFont(buttonFont);
        quitButtonPanel.add(quitButton);
        startScreen.add(quitButtonPanel);
        startScreen.setVisible(true);
        quitButton.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
 
        
        }
    public static void main(String[] args) 
    {
        new StartScreenGUI();
    }
    
}
