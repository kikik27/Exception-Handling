import java.util.Scanner;

public class aritmethic_exception {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the value for c");
        try {
            int c = console.nextInt();
            int res=c/5;
            System.out.println(" The result is "+res);
            console.close();
            }    
                catch (ArithmeticException f){
                System.out.println("adalah = "+f);
                }
       }
}
