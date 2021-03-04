package models;

public class Tank extends Enemy {

    public Tank() {
        setHp(75.0);
        setArmor(5.0);
        setAttack(5.0);
        setResistance(20.0);
    }

    public Tank(int level) {
        setLeveledUpStats(level);
//        switch (level) {
//            case 1:
//                setLeveledUpStats(0);
//                setLevelCount(1);
//                break;
//            case 2:
//                setLeveledUpStats(.5);
//                setLevelCount(2);
//                break;
//            case 3:
//                setLeveledUpStats(.80);
//                setLevelCount(3);
//                break;
//            case 4:
//                setLeveledUpStats(1.2);
//                setLevelCount(4);
//                break;
//            case 5:
//                setLeveledUpStats(1.5);
//                setLevelCount(5);
//                break;
//            case 6:
//                setLeveledUpStats(1.75);
//                setLevelCount(6);
//            case 7:
//                setLeveledUpStats(1.9);
//                setLevelCount(7);
//                break;
//            case 8:
//                setLeveledUpStats(2.2);
//                setLevelCount(8);
//                break;
//            case 9:
//                setLeveledUpStats(2.5);
//                setLevelCount(9);
//                break;
//            case 10:
//                setLeveledUpStats(2.75);
//                setLevelCount(10);
//                break;
//            case 0:
//                System.out.println("No enemy was created!");
//            default:
//                throw new IllegalArgumentException("The Tank Switch hit a case that doesn't exists! case=" + level);
//        }
    }

    public void setLeveledUpStats(int increaseBy){
        Tank temp = new Tank();
        setHp(temp.getHp() + (3.25 * increaseBy));
        setArmor(temp.getArmor() + (3.25 * increaseBy));
        setAttack(temp.getAttack() + (3.25 * increaseBy));
        setResistance(temp.getResistance() + (3.25 * increaseBy));
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " called Hank has appeared to fight!";
    }
}
