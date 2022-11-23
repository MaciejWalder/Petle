import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int inputNumber=scanner.nextInt();
        switch (inputNumber){
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
        }
    }
}
