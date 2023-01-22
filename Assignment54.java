package assignment54;
import java.util.Scanner;

public class Assignment54 {
    public static int determine(int x, int switcher,int finalTerm){
        if(switcher%2!=0&&switcher<finalTerm){
            x=(2*x)+3;
            switcher++;
            return determine(x,switcher,finalTerm);
        }
        else if(switcher%2==0&&switcher<finalTerm){
            x=x-2;
            switcher++;
            return determine(x,switcher,finalTerm);
        }
        else return(x);
    }

    public static void main(String[] args) {
        Scanner noahSeer=new Scanner(System.in);
        System.out.println("Enter the first term");
            int x=noahSeer.nextInt(),switcher=1,total=0;
        System.out.println("Enter the final term");
            int finalTerm=noahSeer.nextInt();
            x=determine(x,switcher,finalTerm);
        System.out.println("The value in the sequence is "+x);
    }
    
}
