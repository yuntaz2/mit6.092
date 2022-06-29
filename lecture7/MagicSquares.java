import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MagicSquares {
    public static ArrayList<ArrayList<Integer>> square = new ArrayList<ArrayList<Integer>>();

    public static ArrayList<Integer> line2Array(String line) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int number = 0;
        for (int i = 0; i < line.length(); ++i) {
            if (Character.getNumericValue(line.charAt(i)) < 0) {
                array.add(number);
                number = 0;
            } else {
                number *= 10;
                number += Character.getNumericValue(line.charAt(i));
            }
        }
        array.add(number);
        return array;
    }

    public static int checkOneLine(int idx) {
        int sum = 0;
        for (int i = 0; i < square.size(); ++i) {
            sum += square.get(idx).get(i);
        }
        return sum;
    }

    public static boolean checkLines() {
        int constSum = checkOneLine(0);
        for (int i = 1; i < square.size(); ++i) {
            if (constSum != checkOneLine(i)) {
                return false;
            }
        }
        return true;
    }

    public static int checkOneCol(int idx) {
        int sum = 0;
        for (int i = 0; i < square.size(); ++i) {
            sum += square.get(i).get(idx);
        }
        return sum;
    }

    public static boolean checkCols() {
        int constSum = checkOneCol(0);
        for (int i = 1; i < square.size(); ++i) {
            if (constSum != checkOneCol(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkDiagonal() {
        int d1 = 0;
        int d2 = 0;
        for (int i = 0; i < square.size(); ++i) {
            d1 += square.get(i).get(i);
            d2 += square.get(i).get(square.size() - 1 - i);
        }
        return d1 == d2;
    }

    public static ArrayList<ArrayList<Integer>> readFile(String file) throws IOException {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        while ((line = br.readLine()) != null) {
            if (line.length() > 0) {
                System.out.println(line);
                square.add(line2Array(line));
            }
        }
        br.close();
        return square;
    }

    public static boolean check() {
        return (checkLines() && checkCols() && checkDiagonal());
    }

    public static void main(String[] args) throws IOException {
        readFile("./Mercury.txt");
        System.out.println("./Mercury.txt" + " is " + check());
        square = new ArrayList<ArrayList<Integer>>();
        readFile("./Luna.txt");
        System.out.println("./Luna.txt" + " is " + check());
    }
}