# Some Practice Problems

1. Ravi has 15 candies, and he gave 4 candies to his friend. How many candies does Ravi have now?

2. A bus currently has 25 passengers. At the next stop, 8 more people get on. How many passengers are now in the bus?

3. A box has 20 pencils. 7 pencils are taken out. How many pencils are left in the box?

4. Meena read 12 pages yesterday and 9 pages today. How many pages did she read in total?

5. A shopkeeper sells a chocolate for ₹10 and a biscuit for ₹5. If you buy one chocolate and one biscuit, how much will you pay in total?

# Solution

```Java
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
```

# Explanation

**First story — Candies**

int raviCandies = 15;
int gaveAway = 4;
int candiesLeft = raviCandies - gaveAway;
System.out.println("Ravi has " + candiesLeft + " candies left.");
Ravi starts with 15 candies.

He gives 4 candies to his friend.

We use - (minus) to find out how many candies are left.

Then we tell the computer to print the answer so we can see it.


**Second story — Bus**

int busPassengers = 25;
int newPassengers = 8;
int totalPassengers = busPassengers + newPassengers;
System.out.println("Now the bus has " + totalPassengers + " passengers.");
There are already 25 people on the bus.

8 more people get in.

We use + (plus) to add them together and find the total.


**Third story — Pencils**

int pencilsInBox = 20;
int pencilsTaken = 7;
int pencilsLeft = pencilsInBox - pencilsTaken;
System.out.println("Pencils left in the box: " + pencilsLeft);
The box starts with 20 pencils.

Somebody takes away 7 pencils.

We subtract to see what’s left.


**Fourth story — Pages Read**

int pagesYesterday = 12;
int pagesToday = 9;
int totalPagesRead = pagesYesterday + pagesToday;
System.out.println("Meena read a total of " + totalPagesRead + " pages.");
Meena read 12 pages yesterday.

She read 9 pages today.

We add them to know the total.


**Fifth story — Shopping**

int chocolatePrice = 10;
int biscuitPrice = 5;
int totalCost = chocolatePrice + biscuitPrice;
System.out.println("Total cost: ₹" + totalCost);
Chocolate costs ₹10.

Biscuit costs ₹5.

Add them to know how much money you need.