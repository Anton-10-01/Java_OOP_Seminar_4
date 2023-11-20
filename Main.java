package Java_OOP_Seminar_4.Ex004;

import java.util.Arrays;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        System.out.println(calc.sum(Arrays.asList(1, 2, 3)));
        System.out.println(calc.sum(Arrays.asList(3, 5, 7)));

        System.out.println(calc.dif(Arrays.asList(7, 5, 1)));
        System.out.println(calc.mult(Arrays.asList(1, 2, 3)));
        System.out.println(calc.div(Arrays.asList(10, 2, 2)));

        System.out.println(calc.binaryTranslation(Arrays.asList(1, 2, 4.0, 5, 10.0, "20", "120")));
    }
}