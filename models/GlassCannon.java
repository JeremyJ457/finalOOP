package models;

public class GlassCannon extends Enemy{
    private int critChance = 10;

    public int getCritChance() {
        return critChance;
    }

    public void setCritChance(int critChance) {
        if (critChance >= 100){
            this.critChance = 100;
        }
        this.critChance = critChance;
    }

    public GlassCannon( ){
        setHp(25.0);
        setArmor(3.0);
        setAttack(30.0);
        setResistance(2.0);
    }

    public GlassCannon(int level){
        switch (level){
            case 1:
                setLeveledUpStats(0,false);
                setLevelCount(1);
                break;
            case 2:
                setLeveledUpStats(.5,true);
                setLevelCount(2);
                break;
            case 3:
                setLeveledUpStats(.80,true);
                setLevelCount(3);
                break;
            case 4:
                setLeveledUpStats(1.2,true);
                setLevelCount(4);
                break;
            case 5:
                setLeveledUpStats(1.5,true);
                setLevelCount(5);
                break;
            case 6:
                setLeveledUpStats(1.75,true);
                setLevelCount(6);
            case 7:
                setLeveledUpStats(1.9,true);
                setLevelCount(7);
                break;
            case 8:
                setLeveledUpStats(2.2,true);
                setLevelCount(8);
                break;
            case 9:
                setLeveledUpStats(2.5,true);
                setLevelCount(9);
                break;
            case 10:
                setLeveledUpStats(2.75,true);
                setLevelCount(10);
                break;
            case 0:
                System.out.println("No enemy was created!");
            default:
                throw new IllegalArgumentException("The GlassCannon Switch hit a case that doesn't exists! case=" + level);
        }
    }

    public void setLeveledUpStats(double increaseBy, boolean critUpgrade) {
        setHp(25.0 + (25.0 * increaseBy));
        setArmor(3.0 + (3.0 * increaseBy));
        setAttack(30.0 + (30.0 * increaseBy));
        setResistance(2.0 + (2.0 + increaseBy));
        if (critUpgrade){
            setCritChance(getCritChance()+5);
        }
    }

    @Override
    public String displayStats(){
        return super.displayStats() + " Crit Chance: " + getCritChance() + "%";
    }
}
