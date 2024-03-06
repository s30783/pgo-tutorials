import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a>0){
            System.out.print("The number is positive");
        }else if(a<0){
            System.out.print("The number is negative");
        }else{
            System.out.print("Th value equals 0")
        }

    }
}