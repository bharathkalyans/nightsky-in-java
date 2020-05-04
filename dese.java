import java.util.ArrayList;
import java.util.Random;

import java.util.Scanner;
class nightsky {
    double density;
    int width;
    int height;
public  int noofstars=0;
    Random r = new Random();
    //Usually go with this constructor!!
    //Its far more convenient ;-)
    nightsky(double intensity, int wid, int he) {
        this.density = intensity;
        this.width = wid;
        this.height = he;
    }

    nightsky(double density) {
        this.density = density;
        width = 20;
        height = 10;
    }

    nightsky(int width, int height) {
        density = 0.1;
        this.width = width;
        this.height = height;
    }

    void prinline() {
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < this.width; i++) {
                if (r.nextDouble() <= density)
                {
                    System.out.print("*");
                    noofstars++;
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
    public long totalstars(){
        return noofstars;
    }
}


public class dese {
    public static void main(String[] args) {
    nightsky stars=new nightsky(0.1,150,50);

    stars.prinline();
        System.out.println("Number of Stars in Sky:: "+ stars.totalstars());
        
    }
}
