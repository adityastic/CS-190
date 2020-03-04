package decorator.counter;

import java.util.Scanner;
public class CounterTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Counter m = new UpperLimit(new LowerLimit(new Counter()));

        int choice = 1;

        while (choice != 5) {
            System.out.println();
            System.out.println("1.Increment");
            System.out.println("2.Decrement");
            System.out.println("3.Read Value");
            System.out.println("4.Exit");

            System.out.print("Please enter a value-->");
            choice = sc.nextInt();
            if (choice == 1) {
                m.increment();
                System.out.println("\n Value= " + m.readValue() + "\n");
            } else if (choice == 2) {
                m.decrement();
                System.out.println("\n Value= " + m.readValue() + "\n");
            } else if (choice == 3) {
                System.out.println("\n Value= " + m.readValue() + "\n");
            }
        }
        
        sc.close();
    }
}