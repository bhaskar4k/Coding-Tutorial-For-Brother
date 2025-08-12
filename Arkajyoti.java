import java.util.*;

class Arkajyoti {
    public static void main(String[] args) {
        // 1. Ravi has 15 candies, gave away 4
        int raviCandies = 15;
        int gaveAway = 4;
        int candiesLeft = raviCandies - gaveAway;
        System.out.println("Ravi has " + candiesLeft + " candies left.");

        // 2. Bus passengers
        int busPassengers = 25;
        int newPassengers = 8;
        int totalPassengers = busPassengers + newPassengers;
        System.out.println("Now the bus has " + totalPassengers + " passengers.");

        // 3. Pencils in box
        int pencilsInBox = 20;
        int pencilsTaken = 7;
        int pencilsLeft = pencilsInBox - pencilsTaken;
        System.out.println("Pencils left in the box: " + pencilsLeft);

        // 4. Pages read
        int pagesYesterday = 12;
        int pagesToday = 9;
        int totalPagesRead = pagesYesterday + pagesToday;
        System.out.println("Meena read a total of " + totalPagesRead + " pages.");

        // 5. Cost of chocolate and biscuit
        int chocolatePrice = 10;
        int biscuitPrice = 5;
        int totalCost = chocolatePrice + biscuitPrice;
        System.out.println("Total cost: " + totalCost);
    }
}