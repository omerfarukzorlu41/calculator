import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int process,number1,number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a two number");
        System.out.print("number 1 = ");
        number1 = scanner.nextInt();
        System.out.print("number 2 = ");
        number2 = scanner.nextInt();
        System.out.println("1-addition\t2-subtraction\t3-multiplication\t4-division");
        System.out.print("please select the action you want to do: ");
        process = scanner.nextInt();

        switch(process){
            case 1:
                System.out.print(number1+"+" +number2 +"="+(number1+number2));
                break;
            case 2:
                System.out.print(number1+"-" +number2 +"="+(number1-number2));
                break;
            case 3:
                System.out.print(number1+"x" +number2 +"="+(number1*number2));
                break;
            case 4:
                if(number2 != 0){
                    System.out.print(number1+"/" +number2 +"="+(number1/number2));
                }else{
                    System.out.print("A number cannot be divided by 0");
                }
                break;
            default:
                System.out.print("incorrent entry");
        }
    }
}