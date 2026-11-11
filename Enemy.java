package hauntedhousehill;

// currently empty, but any additional attributes go here

public class Enemy extends Entity {
    
    public Enemy(
            String name,
            int id,
            int maxHp,
            int attack,
            int speed,
            int defence){
        
    super(name,id,maxHp,attack,speed,defence);
        
    }
    // hp = 20 increasing, attack low increases
    // 12 encounters, 3 fights for lvl up
    // drop initialized here as an arraylist
}
