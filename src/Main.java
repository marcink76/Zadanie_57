import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner inputNumber = new Scanner(System.in);
        int numberToCheck = 0;

        do {
            System.out.println("Podaj liczbę!");
            numberToCheck = inputNumber.nextInt();

            if (numberToCheck < 100){
                System.out.println("Liczba za mała!");

            }else if (numberToCheck > 200){
                System.out.println("Liczba z duża!");
            }
            if (numberToCheck > 100 && numberToCheck < 200){
                System.out.println("Liczba jest z poprawnego zakresu!");

                if (numberToCheck%3 == 0){
                    System.out.println("Liczba jest podzielna przez 3! Jej dzielnik to: " + numberToCheck / 3);

                }else {System.out.println("Nie jest podzielna przez 3!");
                }
            }
        }while (numberToCheck < 100 || numberToCheck > 200 || numberToCheck%3 != 0 );
    }
}
