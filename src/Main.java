import java.util.Scanner;
public class Main {

    public static int addition(int number1, int number2, int number3){
        System.out.println("Addition progress...");

        return (number1 + number2 + number3);

    }
    public static int addition(int number1, int number2){
        System.out.println("Addition progress...");

        return (number1 + number2);

    }

    public static int subtraction(int number1, int number2){
        System.out.println("Subtraction progress...");

        return (number1 - number2);
    }
    public static double division (int number1, int number2){
        System.out.println("Division progress...");

        return ((double) number1 / number2);
    }
    public static double Multiplication (int number1, int number2){
        System.out.println("Multiplication progress...");

        return ( number1 * number2);
    }
    public static double Multiplication (int number1, int number2, int number3){
        System.out.println("Multiplication progress...");

        return ( number1 * number2 * number3);
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String transactions = "first transaction is addition \n" +
                "second transaction is subtraction \n" + "third transaction is divison \n" +
                "fourth transaction is multiplication \n" + "Push the q for exit";

        System.out.println("***********************************");
        System.out.println(transactions);
        System.out.println("***********************************");


        while (true) {
            System.out.print("Please choose the transaction : ");
            String transaction = scanner.next();

            if (transaction.equals("q")){
                System.out.print("Exiting the program");
                break;
            }
            else if (transaction.equals("1")){
                System.out.print("How many values do you want to collect ? (2 or 3) ");
                int how_many_numbers = scanner.nextInt();

                if (how_many_numbers == 2){
                    System.out.print("Number 1 : ");
                    int number1 = scanner.nextInt();
                    System.out.print("Number 2 : ");
                    int number2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Total of entered numbers : " + addition(number1,number2));

                }
                else if (how_many_numbers == 3){
                    System.out.print("Number 1 : ");
                    int number1 = scanner.nextInt();
                    System.out.print("Number 2 : ");
                    int number2 = scanner.nextInt();
                    System.out.print("Number 3 : ");
                    int number3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Total of entered numbers : " + addition(number1,number2,number3));

                }
                else {
                    System.out.print("Error...");
                }


            }
            else if (transaction.equals("2")){
                System.out.print("Number 1 : ");
                int number1 = scanner.nextInt();
                System.out.print("Number 2 : ");
                int number2 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Difference of two numbers : " + subtraction(number1,number2));

            }
            else if (transaction.equals("3")){
                System.out.print("Number 1 : ");
                int number1 = scanner.nextInt();
                System.out.print("Number 2 : ");
                int number2 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Quotient of two numbers : " + division(number1,number2));

            } else if (transaction.equals("4")) {
                System.out.println("How many values do you want to multiply ? (2 or 3) ");
                int how_many_numbers = scanner.nextInt();

                if (how_many_numbers == 2){
                    System.out.print("Number 1 : ");
                    int number1 = scanner.nextInt();
                    System.out.print("Number 2 : ");
                    int number2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Multiplication of entered numbers : " + Multiplication(number1,number2));

                } else if (how_many_numbers == 3) {
                    System.out.print("Number 1 : ");
                    int number1 = scanner.nextInt();
                    System.out.print("Number 2 : ");
                    int number2 = scanner.nextInt();
                    System.out.print("Number 3 : ");
                    int number3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Multiplication of entered numbers : " + Multiplication(number1,number2,number3));
                }
                else {
                    System.out.print("Error...");
                }



            }
        }

    }
}