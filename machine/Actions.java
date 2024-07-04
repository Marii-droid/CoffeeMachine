package machine;

import java.util.Scanner;

public class Actions {

    static int mlWater = 400;
    static int mlMilk = 540;
    static int grCoffee = 120;
    static int disCup = 9;
    static int sumMun = 550;

    public void coffeeMachineStatus() {
        System.out.println("The coffee machine has:");
        System.out.println(
                mlWater + " ml of water\n" +
                        mlMilk + " ml of milk\n" +
                        grCoffee + " gr of coffee beans\n" +
                        disCup + " disposable cups\n" + "$" + sumMun + " of money");
    }

    public void takeMoney() {
        System.out.println("I gave you $" + sumMun);
        sumMun = 0;
    }

    public void fillCoffee(Scanner sc) {
        System.out.println("Write how many ml of water you want to add:");
        int addWater = sc.nextInt();

        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = sc.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add:");
        int addCoffeeBeans = sc.nextInt();

        System.out.println("Write how many disposable cups you want to add:");
        int addCups = sc.nextInt();

        mlWater += addWater;
        mlMilk += addMilk;
        grCoffee += addCoffeeBeans;
        disCup += addCups;

    }

    public void buyCoffee(Scanner sc) {
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String selection = sc.next();

        switch (selection) {
            case "1": //espresso
                if (mlWater >= 250 && grCoffee >= 16 && disCup >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    mlWater = mlWater - 250;
                    grCoffee = grCoffee - 16;
                    disCup--;
                    sumMun = sumMun + 4;
                } else if (mlWater < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if (grCoffee < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else {
                    System.out.println("Sorry, not enough cups!");
                }
                break;
            case "2": //latte
                if (mlWater >= 350 && mlMilk >= 75 && disCup >= 1 && grCoffee >= 20) {
                    System.out.println("I have enough resources, making you a coffee!");
                    mlWater = mlWater - 350;
                    mlMilk = mlMilk - 75;
                    grCoffee = grCoffee - 20;
                    disCup--;
                    sumMun = sumMun + 7;
                } else if (mlWater < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if (mlMilk < 75) {
                    System.out.println("Sorry, not enough milk!");
                } else if (grCoffee < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else {
                    System.out.println("Sorry, not enough cups!");
                }
                break;
            case "3": //cappuccino
                if (mlWater >= 200 && mlMilk >= 100 && disCup >= 1 && grCoffee >= 12) {
                    System.out.println("I have enough resources, making you a coffee!");
                    mlWater = mlWater - 200;
                    mlMilk = mlMilk - 100;
                    grCoffee = grCoffee - 12;
                    disCup--;
                    sumMun = sumMun + 6;
                } else if (mlWater < 200) {
                    System.out.println("Sorry, not enough water!");
                } else if (mlMilk < 100) {
                    System.out.println("Sorry, not enough milk!");
                } else if (grCoffee < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else {
                    System.out.println("Sorry, not enough cups!");
                }
                break;
            case "back":
                break;
        }
    }
}
