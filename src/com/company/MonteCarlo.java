package com.company;

import java.util.Random;

public class MonteCarlo {
    public double h;
    public double k;
    public double r;

    public double hh;
    public double kk;

    public double x;
    public double y;

    public MonteCarlo (double a, double b, double c) {
        h = a;
        k = b;
        r = c;

        hh = 2*h;
        kk = 2*k;
    }

    private Random rndm = new Random ();

    public double nextRainDrop_x() {
        x = rndm.nextDouble()*(hh) + (h+r-(2*h));
        return x;
    }

    public double nextRainDrop_y() {
        y = rndm.nextDouble()*(kk) + (k+r)-(2*h);
        return y;
    }

    public boolean insideCircle(double xx, double yy) {
        if (((xx-h)*(xx-h) + (yy-k)*(yy-k)) <= (r*r)){
            return true;
        }
        else{
            return false;
        }
    }
}
