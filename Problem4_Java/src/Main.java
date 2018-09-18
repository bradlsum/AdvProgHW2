// By Sumner Bradley
// 9/13/18
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Converter converter = new Converter();

        System.out.print("Enter a binary string (only containing 1s or 0s):");
        converter.setString(sc.nextLine());

        if (converter.isBinary() == true)
            System.out.println("Binary:" + converter.getString() + "\n" + "Decimal:" + converter.toDecimal() + "\n");
        else
            System.out.println("Input is not in binary form");
    }
}