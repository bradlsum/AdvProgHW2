// By Sumner Bradley
// 9/13/18
// World population approx. 7.6b and growth is approx. 1.1-1.2% I used 1.2 for this calculation.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double startingPop = 760000000;
        double gRate = 1.2;
        int year = 0;

        Scanner sc = new Scanner(System.in);
        Population p = new Population(startingPop, gRate);
        Population p2 = new Population();

        System.out.format("%1s %27s %30s",
                "Year", "Population", "Difference");
        System.out.println();
        for (int i = 1; i < 76; ++i){
            p.advance();
            System.out.format("%1s %30s %30s",
                    i, p.getPopulation(), p.getDiff());
            System.out.println();

            if ((p.getDiff() > startingPop) && (year == 0)) {
                p2 = p;
                year = i;
            }
        }

        if (year != 0)
            System.out.println("\nThe population of the world will double by year " + year);
    }
}
