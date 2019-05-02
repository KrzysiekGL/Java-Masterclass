package pl.krzysiekgl;

import pl.krzysiekgl.series.Series;

public class Main {

    public static void main(String[] args) {
        for(int i = 0; i<15; ++i) {
            System.out.print(Series.nSum(i) + "\t");
        }
        System.out.println();
        
        for(int i = 0; i<11; ++i) {
            System.out.print(Series.factorial(i) + "\t");
        }
        System.out.println();
        
        for(int i = 0; i<15; ++i) {
            System.out.print(Series.fibonacci(i) + "\t");
        }
        System.out.println();
    }
}
