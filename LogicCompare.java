import java.util.Scanner;


public class LogicCompare {

    static String compare(int a, int b){
        if( a>b ){
            return( a + " > " + b);
        }
        else if(b > a){
            return(b + " > " + a);
        }
        else{
            return(a + " = " + b);
        }

    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a , b;
       System.out.println("Enter A");
       a = sc.nextInt();
       System.out.println("Enter B");
       b = sc.nextInt();
       System.out.println(compare(a, b));
       sc.close();

    }
}
