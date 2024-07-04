package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserInput input = getInput(sc);
        Actions coffeeActions = new Actions();

        while (input != UserInput.EXIT) {
            switch (input) {
                case BUY:
                    coffeeActions.buyCoffee(sc);
                    break;
                case FILL:
                    coffeeActions.fillCoffee(sc);
                    break;
                case TAKE:
                    coffeeActions.takeMoney();
                    break;
                case REMAINING:
                    coffeeActions.coffeeMachineStatus();
                    break;
            }
            input = getInput(sc);
        }
    }

    public static UserInput getInput(Scanner sc) {
        System.out.println("Write action (buy, fill, take, remaining, exit)");
        String action = sc.next().toUpperCase();
        return UserInput.valueOf(action);
    }
}
