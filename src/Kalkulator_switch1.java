import java.util.Scanner;

public class Kalkulator_switch1 {
    public static void main(String[] args) {
        System.out.println("Witaj w kalkulatorze \nWybierz pierwszą liczbe");
        Scanner scanner=new Scanner(System.in);
        int number1=scanner.nextInt();
        System.out.println("Wybierz drugą liczbę");
        int number2=scanner.nextInt();
        System.out.println("Wybierz rodzaj równania: \n1. Dodawanie \n2. Odejmowanie \n3. Mnożenie \n4. Dzielenie");
        int inputNumber = scanner.nextInt();
        switch (inputNumber){
            case 1:
                System.out.println("Wynik dodawania " + (number1+number2));
            break;
            case 2:
                System.out.println("Wynik odejmowania " + (number1-number2));
            break;
            case 3:
                System.out.println("Wynik mnozenia " + (number1*number2));
                break;
            case 4:
                System.out.println("Wynik dzielenia " + (number1/number2));
                break;
        }
    }
}
