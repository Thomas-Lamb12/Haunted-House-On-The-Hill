package battle.screen.gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BattleScreenGUI 
{
    JFrame battleScreen;
    JPanel enemyPanel;
    JPanel HPPanel;
    JLabel HPAmount;
    JPanel HPAmountPanel;
    JPanel APPanel;
    JLabel APAmount;
    JPanel APAmountPanel;
    Font amountFont = new Font("Arial", Font.PLAIN,30);
    Font buttonFont = new Font("Arial", Font.PLAIN,60);
    JPanel attackPanel;
    JButton attackButton;
    JPanel skillPanel;
    JButton skillButton;
    JPanel statPanel;
    JButton statButton;
    
    /*JPanel defendPanel;
    JButton defendButton;
    */
    
    public BattleScreenGUI()
    {
        battleScreen = new JFrame();
        battleScreen.setSize(1400,900);
        battleScreen.setTitle("Haunted House On The Hill");
        battleScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        battleScreen.getContentPane().setBackground(Color.black);
        battleScreen.setLayout(null);
        //battleScreen.setVisible(true);
        
        enemyPanel = new JPanel();
        enemyPanel.setBounds(90,25,1200,500);
        enemyPanel.setBackground(Color.pink);
        battleScreen.add(enemyPanel);
        
        HPAmountPanel = new JPanel();
        HPAmountPanel.setBounds(90,550,100,50);
        HPAmountPanel.setBackground(Color.white);
        HPAmount = new JLabel("HP:");
        HPAmount.setForeground(Color.black);
        HPAmountPanel.add(HPAmount);
        HPAmount.setFont(amountFont);
        battleScreen.add(HPAmountPanel);
        
        HPPanel = new JPanel();
        HPPanel.setBounds(180,550,250,50);
        HPPanel.setBackground(Color.green);
        battleScreen.add(HPPanel);
        
        APAmountPanel = new JPanel();
        APAmountPanel.setBounds(950,550,100,50);
        APAmountPanel.setBackground(Color.white);
        APAmount = new JLabel("AP:");
        APAmount.setForeground(Color.black);
        APAmountPanel.add(APAmount);
        APAmount.setFont(amountFont);
        battleScreen.add(APAmountPanel);
        
        APPanel = new JPanel();
        APPanel.setBounds(1040,550,250,50);
        APPanel.setBackground(Color.blue);
        battleScreen.add(APPanel);
        
        attackPanel = new JPanel();
        attackPanel.setBounds(90,650,200,100);
        attackPanel.setBackground(Color.black);
        attackButton = new JButton("Attack");
        attackButton.setBackground(Color.black);
        attackButton.setForeground(Color.white);
        attackButton.setFont(buttonFont);
        attackPanel.add(attackButton);
        battleScreen.add(attackPanel);
        
        skillPanel = new JPanel();
        skillPanel.setBounds(90,650,800,100);
        skillPanel.setBackground(Color.black);
        skillButton = new JButton("Skills");
        skillButton.setBackground(Color.black);
        skillButton.setForeground(Color.white);
        skillButton.setFont(buttonFont);
        skillPanel.add(skillButton);
        battleScreen.add(skillPanel);
        
        statPanel = new JPanel();
        statPanel.setBounds(90,650,1400,200);
        statPanel.setBackground(Color.black);
        statButton = new JButton("Stats");
        statButton.setBackground(Color.black);
        statButton.setForeground(Color.white);
        statButton.setFont(buttonFont);
        statPanel.add(statButton);
        battleScreen.add(statPanel);
        
        
        /*defendPanel = new JPanel();
        defendPanel.setBounds(90,650,1400,200);
        defendPanel.setBackground(Color.black);
        defendButton = new JButton("Defend");
        defendButton.setBackground(Color.black);
        defendButton.setForeground(Color.white);
        defendButton.setFont(buttonFont);
        defendPanel.add(statButton);
        battleScreen.add(defendPanel);
        */
        battleScreen.setVisible(true);
        
        
    }
    
    public static void main(String[] args) 
    {
        new BattleScreenGUI();
    }
    
}
