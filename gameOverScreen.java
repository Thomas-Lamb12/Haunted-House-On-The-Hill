package hauntedhousehill;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class gameOverScreen 
{
    JFrame gameOverScreen;
    JPanel gameOverNamePanel;
    JPanel keepGoingButtonPanel;
    JPanel quitButtonPanel;
    JLabel gameOverNameLabel;
    Font gameOverFont = new Font("Arial", Font.BOLD,60);
    Font buttonFont = new Font("Arial", Font.PLAIN, 60);
    JButton keepGoingButton;
    JButton quitButton;
    
        public gameOverScreen()
        {        
        gameOverScreen = new JFrame();
        gameOverScreen.setSize(1400,900);
        gameOverScreen.setTitle("Haunted House On The Hill");
        gameOverScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameOverScreen.getContentPane().setBackground(Color.black);
        gameOverScreen.setLayout(null);
        
        
        gameOverNamePanel = new JPanel();
        gameOverNamePanel.setBounds(300,200,800,300);
        gameOverNamePanel.setBackground(Color.black);
        gameOverNameLabel = new JLabel("GAME OVER");
        gameOverNameLabel.setForeground(Color.white);
        gameOverNamePanel.add(gameOverNameLabel);
        gameOverNameLabel.setFont(gameOverFont);
        gameOverScreen.add(gameOverNamePanel);
        
        keepGoingButtonPanel = new JPanel();
        keepGoingButtonPanel.setBounds(500,500,400,150);
        keepGoingButtonPanel.setBackground(Color.black);
        //startScreen.add(startButtonPanel);
        keepGoingButton = new JButton("Keep Going");
        keepGoingButton.setBackground(Color.black);
        keepGoingButton.setForeground(Color.white);
        keepGoingButton.setFont(buttonFont);
        keepGoingButtonPanel.add(keepGoingButton);
        gameOverScreen.add(keepGoingButtonPanel);
        
        quitButtonPanel = new JPanel();
        quitButtonPanel.setBounds(500,700,400,150);
        quitButtonPanel.setBackground(Color.black);
        quitButton = new JButton("Quit");
        quitButton.setBackground(Color.black);
        quitButton.setForeground(Color.white);
        quitButton.setFont(buttonFont);
        quitButtonPanel.add(quitButton);
        gameOverScreen.add(quitButtonPanel);
        quitButton.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        gameOverScreen.setVisible(true);
        
 
        }
    public static void main(String[] args) 
    {
        new gameOverScreen();
    }
}
