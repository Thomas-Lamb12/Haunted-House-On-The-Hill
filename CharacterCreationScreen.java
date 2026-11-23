package hauntedhousehill;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CharacterCreationScreen 
{
    JFrame charCreateScreen;
    JPanel selectClassPanel;
    JLabel nameLabel;
    JPanel boxerPanel;
    JPanel doctorPanel;
    JPanel joblessPanel;
    JPanel detectivePanel;
    JButton boxerButton;
    JButton doctorButton;
    JButton joblessButton;
    JButton detectiveButton;
    Font classFont = new Font("Arial", Font.BOLD,60);
    Font titleFont = new Font("Arial", Font.BOLD,90);
    
    public CharacterCreationScreen()
    {
        charCreateScreen = new JFrame();
        charCreateScreen.setSize(1400,900);
        charCreateScreen.setTitle("Haunted House On The Hill");
        charCreateScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        charCreateScreen.getContentPane().setBackground(Color.black);
        charCreateScreen.setLayout(null);
        
        selectClassPanel = new JPanel();
        selectClassPanel.setBounds(300,200,800,300);
        selectClassPanel.setBackground(Color.black);
        nameLabel = new JLabel("Select Your Class");
        nameLabel.setForeground(Color.white);
        selectClassPanel.add(nameLabel);
        nameLabel.setFont(titleFont);
        charCreateScreen.add(selectClassPanel);
        
        boxerPanel = new JPanel();
        boxerPanel.setBounds(90,650,200,200);
        boxerPanel.setBackground(Color.black);
        boxerButton = new JButton("Boxer");
        boxerButton.setBackground(Color.black);
        boxerButton.setForeground(Color.white);
        boxerButton.setFont(classFont);
        boxerPanel.add(boxerButton);
        charCreateScreen.add(boxerPanel);
        
        doctorPanel = new JPanel();
        doctorPanel.setBounds(75,650,800,200);
        doctorPanel.setBackground(Color.black);
        doctorButton = new JButton("Doctor");
        doctorButton.setBackground(Color.black);
        doctorButton.setForeground(Color.white);
        doctorButton.setFont(classFont);
        doctorPanel.add(doctorButton);
        charCreateScreen.add(doctorPanel);
        
        joblessPanel = new JPanel();
        joblessPanel.setBounds(90,650,1400,200);
        joblessPanel.setBackground(Color.black);
        joblessButton = new JButton("Jobless");
        joblessButton.setBackground(Color.black);
        joblessButton.setForeground(Color.white);
        joblessButton.setFont(classFont);
        joblessPanel.add(joblessButton);
        charCreateScreen.add(joblessPanel);
        
        detectivePanel = new JPanel();
        detectivePanel.setBounds(90,650,2100,200);
        detectivePanel.setBackground(Color.black);
        detectiveButton = new JButton("Detective");
        detectiveButton.setBackground(Color.black);
        detectiveButton.setForeground(Color.white);
        detectiveButton.setFont(classFont);
        detectivePanel.add(detectiveButton);
        charCreateScreen.add(detectivePanel);
      
      
        
         charCreateScreen.setVisible(true);
    }
    public static void main(String[] args) 
    {
        new CharacterCreationScreen();
    }
    
}
