package myClasses;

import java.util.Random;

public class Dice {
    public static int roll(int min, int max){
        Random randy = new Random();
        return min + randy.nextInt(max - min + 1);
    }
}
