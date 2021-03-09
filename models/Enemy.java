package models;

public class Enemy {
    private double hp;
    private double armor;
    private double resistance;
    private double attack;
    private int levelCount = 1;

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
        if (this.hp <= 0.0){
            this.hp = 0.0;
        }
    }

    public void decreaseHp(double damage){
        double damageTaken = getHp() - damage;
        setHp(damageTaken);
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public int getLevelCount() {
        return levelCount;
    }

    public void setLevelCount(int levelCount) {
        this.levelCount = levelCount;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " has appeared to fight!";
    }

    public String displayStats(){
        return getClass().getSimpleName() + "\n\tHP: " + getHp() + "\n\tArmor: " +
                getArmor() + "\n\tResistance: " + getResistance() + "\n\tAttack: " + getAttack();
    }
}
