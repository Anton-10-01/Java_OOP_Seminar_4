package Java_OOP_Seminar_4.Ex004;

import java.util.ArrayList;
import java.util.List;

/**
 * Calculator
 */
public class Calculator {

    public Double sum(List<? extends Number> arr) {
        Double result = (double) 0;
        for (Number number : arr) {
            result += number.doubleValue();
        }
        return result;
    }

    public Double dif(List<? extends Number> arr) {
        Double result = arr.get(0).doubleValue();
        for (int i = 1; i < arr.size(); i++) {
            result = result - arr.get(i).doubleValue();
        }
        return result;
    }

    public Double mult(List<? extends Number> arr) {
        Double result = arr.get(0).doubleValue();
        for (int i = 1; i < arr.size(); i++) {
            result = result * arr.get(i).doubleValue();
        }
        return result;
    }

    public Double div(List<? extends Number> arr) {
        Double result = arr.get(0).doubleValue();
        for (int i = 1; i < arr.size(); i++) {
            result = result / arr.get(i).doubleValue();
        }
        return result;
    }

    public <T> String binaryTranslation(List<T> arr) {
        List<String> binaryS = new ArrayList<>();
        for (T element : arr) {
            if(element instanceof Integer) {
                Integer number = (Integer) element;
                StringBuilder binary = new StringBuilder();
                if (number % 2 == 0) {
                    for(int i = 0; i < (Integer) element / 2; i++) {
                        binary.append(number % 2);
                        number = number / 2;
                    }
                } else {
                    for(int i = 0; i < (Integer) element / 2 + 1; i++) {
                        binary.append(number % 2);
                        number = number / 2;
                    }
                }
                binary.append(number);
                binary.reverse();
                binaryS.add(binary.toString());
            } else if (element instanceof Double) {
                double numberD = (double) element;
                int number = (int) numberD;
                StringBuilder binary = new StringBuilder();
                if (number % 2 == 0) {
                    for(int i = 0; i < (int) numberD / 2; i++) {
                        binary.append(number % 2);
                        number = number / 2;
                    }
                } else {
                    for(int i = 0; i < (int) numberD / 2 + 1; i++) {
                        binary.append(number % 2);
                        number = number / 2;
                    }
                }
                binary.append(number);
                binary.reverse();
                binaryS.add(binary.toString());
            } else if (element instanceof String) {
                String numberS = (String) element;
                int number = Integer.parseInt(numberS);
                StringBuilder binary = new StringBuilder();
                if (number % 2 == 0) {
                    for(int i = 0; i < Integer.parseInt(numberS) / 2; i++) {
                        binary.append(number % 2);
                        number = number / 2;
                    }
                } else {
                    for(int i = 0; i < Integer.parseInt(numberS) / 2 + 1; i++) {
                        binary.append(number % 2);
                        number = number / 2;
                    }
                }
                binary.append(number);
                binary.reverse();
                binaryS.add(binary.toString());
            }
        }
        return binaryS.toString();
    }
}