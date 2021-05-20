import java.util.Scanner;
public class Variable{
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int a= 10, b=5;
        int sum=0,mul,div=0;
        System.out.println("Enter value of c");
        int c = input.nextInt();
        sum=a+c;
        mul=a*b;
        div=a/b;
        System.out.println("Multiplication ="+mul);
        System.out.println("Division:"+div);
        input.close();



    }
}

