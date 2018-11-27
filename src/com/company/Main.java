package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int cirCount = 0;
        int sqrCount = 0;
        int guess;

        MonteCarlo mcObj = new MonteCarlo(5,3,2);

        for (int x = 0; x < 100; x++) {
            sqrCount ++;
            if (mcObj.insideCircle(mcObj.nextRainDrop_x(),mcObj.nextRainDrop_y()) == true) {
                cirCount++;
            }
        }

        guess = cirCount * (16)/(sqrCount*16);


        System.out.println(guess + ", " + cirCount + ", " + sqrCount);

    }
}
