import java.util.*;
class Amstrong3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int x=n;
        int temp=0;
        while(n>0){
            int a=n%10;
            temp=temp+a*a*a;
            n=n/10;
        }
        if(x==temp){
            System.out.print("It is a amstrong number");
        }
        else{
            System.out.print("It is not an amstrong number");
        }
    }
}