package myClasses;

public class ItemDrops {
    public int giveGold(int lvl){
        int goldGenerated = -1;

        goldGenerated = lvl * Dice.roll(1, 10);

        return goldGenerated;
    }
}
