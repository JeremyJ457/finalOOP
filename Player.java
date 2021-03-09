package myClasses;

import lib.ConsoleIO;

public class Player {
    private String name = "Def";
    private int maxHP = -1;
    private int currentHP = -1;
    private int armour = -1;
    private int resistance = -1;
    private int[] itemStorage = new int[8];
    private int critChance = 5;
    private int attack = -1;
    private int completedFloors = -1;
    private int usedBomb = -1;

    public int takeDamage(int damageDealt){
        damageDealt -= getResistance();
        setCurrentHP(getCurrentHP() - damageDealt);
        return damageDealt;
    }

    public int hitEnemy(int enemyArmour){
        int damageDealt = -1;
        if(getUsedBomb() == 0) {
            if (enemyArmour < Dice.roll(1, 20) + getAttack()) {
                damageDealt = Dice.roll(getAttack() - 1, getAttack() + 5);
                if (Dice.roll(1, 100) <= getCritChance()) {
                    damageDealt = damageDealt * 2;
                }
            }
        }else{
            damageDealt = getAttack() * 2;
            setUsedBomb(0);
        }
        return damageDealt;
    }

    public boolean useItem(int itemToUse){
        boolean itemUsed = false;

        //Will need to replace system outs with the viewer class
        //assumption that no modifications made to user choice prior to method

        switch (itemToUse){
            case 1:
                checkSword();
                break;
            case 2:
                checkArmor();
                break;
            case 3:
                if(itemStorage[2] > 0) {
                    useHlthPot();
                    itemUsed = true;
                }else{
                    System.out.println(emptyItemSlot("Health Potion"));
                }
                break;
            case 4:
                if(itemStorage[3] > 0) {
                    useAtkPot();
                    itemUsed = true;
                    break;
                }else{
                    System.out.println(emptyItemSlot("Attack Potion"));
                }
            case 5:
                if(itemStorage[4] > 0) {
                    useDefPot();
                    itemUsed = true;
                    break;
                }else{
                    System.out.println(emptyItemSlot("Defense Potion"));
                }
            case 6:
                if(itemStorage[5] > 0) {
                    useCrtPot();
                    itemUsed = true;
                    break;
                }else{
                    System.out.println(emptyItemSlot("Critical Potion"));
                }
            case 7:
                if(itemStorage[6] > 0) {
                    useBomb();
                    itemUsed = true;
                    break;
                }else{
                    System.out.println(emptyItemSlot("Bomb"));
                }
            case 8:
                checkGold();
                break;
            default:
                System.out.println("You aren't supposed to be able to input that.");

        }
        if(itemUsed){
            itemStorage[itemToUse - 1] -= 1;
        }

        return itemUsed;
    }

    public void addItem(int itemSlot){
        itemStorage[itemSlot] += 1;
    }

    public String emptyItemSlot(String item){
        return "You don't have a " + item  + ".";
    }

    public int checkSword(){
        return itemStorage[0];
    }

    public int checkArmor(){
        return itemStorage[1];
    }

    public void useHlthPot(){
        setCurrentHP(getCurrentHP() + (int)Math.floor(0.3 * getMaxHP()));
        if(getCurrentHP() > getMaxHP()){
            setCurrentHP(getMaxHP());
        }
    }

    public void useAtkPot(){
        setAttack(getAttack() + 2);
    }

    public void useDefPot(){
        setArmour(getArmour() + 1);
        setResistance(getResistance() + 1);
    }

    public void useCrtPot(){
        setCritChance(getCritChance() + 2);
    }

    public void useBomb(){
        setUsedBomb(1);
    }

    public String checkGold(){
        return "Yep. That's still gold alright.";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public int[] getItemStorage() {
        return itemStorage;
    }

    public void setItemStorage(int[] itemStorage) {
        this.itemStorage = itemStorage;
    }

    public int getCritChance() {
        return critChance;
    }

    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getCompletedFloors() {
        return completedFloors;
    }

    public void setCompletedFloors(int completedFloors) {
        this.completedFloors = completedFloors;
    }

    public int getUsedBomb() {
        return usedBomb;
    }

    public void setUsedBomb(int usedBomb) {
        this.usedBomb = usedBomb;
    }
}
