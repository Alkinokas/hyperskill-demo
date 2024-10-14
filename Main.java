package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double priceBubblegum = 2;
        double priceToffee = 0.2;
        double priceIceCream = 5;
        double priceMilkChocolate = 4;
        double priceDoughnut = 2.5;
        double pricePancake = 3.2;
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Prices: ");
//        System.out.println("Bubblegum: $" + priceBubblegum);
//        System.out.println("Toffee: $" + priceToffee);
//        System.out.println("Ice cream: $" + priceIceCream);
//        System.out.println("Milk chocolate: $" + priceMilkChocolate);
//        System.out.println("Doughnut: $" + priceDoughnut);
//        System.out.println("Pancake: $" + pricePancake);

        int bubblegumIncome = 202;
        int toffeeIncome = 118;
        int iceCreamIncome = 2250;
        int milkChocolateIncome = 1680;
        int doughnutIncome = 1075;
        int pancakeIncome = 80;

        int totalIncome = bubblegumIncome + toffeeIncome + iceCreamIncome + milkChocolateIncome
                        + doughnutIncome + pancakeIncome;

        System.out.printf("Earned amount: \nBubblegum: $%d \nToffee: $%d \nIce cream: $%d\n" +
                            "Milk chocolate: $%d \nDoughnut: $%d \nPancake: $%d \n\nIncome: $%d\n",
                            bubblegumIncome, toffeeIncome, iceCreamIncome, milkChocolateIncome,
                            doughnutIncome, pancakeIncome, totalIncome);

        System.out.println("Staff expenses:");
        int staffExpenses = scanner.nextInt();

        System.out.println("Other expenses:");
        int otherExpenses = scanner.nextInt();

        int netIncome = totalIncome - staffExpenses - otherExpenses;

        System.out.printf("Net income: $%d", netIncome);
    }
}