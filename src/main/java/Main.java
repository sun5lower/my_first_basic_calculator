import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(" What would you like to calculate, please type ");
        Scanner scanner = new Scanner(System.in);
        double n1 = scanner.nextDouble();
        char op = scanner.next().charAt(0);
        double n2 = scanner.nextDouble();


        if(op == '+')
            System.out.println("and the answer is");


        else if( op == '-')
            System.out.println((int)(n1 - n2));
        else if( op == '/')
            System.out.println(n1 / n2);

        else if( op == '*')
            System.out.println((int)(n1 * n2));
        else System.out.println("Invalid operator");


    }
}
