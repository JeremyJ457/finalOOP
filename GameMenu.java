package view;

import lib.ConsoleIO;

public class GameMenu {
    ConsoleIO consoleIO = new ConsoleIO();

    public int mainMenu(){
        String[] menu = {"New Game","Load","Leaderboard","Exit" };
        return consoleIO.promptForMenuSelection(menu,true);
    }


    public int fightMenu(){
        String[] menu = {"Attack","Block","Use Items"};
       return consoleIO.promptForMenuSelection(menu,false);
    }

    public int intermissionMenu(){
        String[] menu = {"Shop","Use items", "Go to next floor","Save and exit"};
       return consoleIO.promptForMenuSelection(menu,false);
    }

    public int shopMenu(){
        String[] menu = {"Health Potion \n cost:10 \n desc: Restores 20 hp ",
                "Attack Boost \n cost:15 \n desc: attack +5 ",
                "Defence Boost \n cost: 10 \n desc: resistance +3 ",
                "Crit Boost \n cost: 20 \n desc: crit + 10% max 95%",
                "Bomb \n cost 25 \n desc: does 50% current enemy hp "};
        return consoleIO.promptForMenuSelection(menu,true);
    }

    public String playerName(){
        String prompt = "Enter name:";
        return consoleIO.promptForString(prompt,false);
    }

    public String saveName(){
        String prompt = "Save name: ";
        return consoleIO.promptForString(prompt,false);
    }
}
