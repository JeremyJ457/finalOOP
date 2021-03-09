package myClasses;

public class Shop {
    public int itemCost(int itemToBuy){
        int goldCost = -1;
        //assumption that no modifications made to user choice prior to method
        switch (itemToBuy){
            case 3:
                goldCost = 10;
                break;
            case 4:
                goldCost = 20;
                break;
            case 5:
                goldCost = 25;
                break;
            case 6:
                goldCost = 40;
                break;
            case 7:
                goldCost = 15;
                break;
            default:
                System.out.println("Shouldn't have been an option");
        }
        return goldCost;
    }
}
