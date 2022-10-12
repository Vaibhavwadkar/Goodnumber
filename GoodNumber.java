import java.util.*;
class GoodNumber{
    public static boolean isGoodNumber(int N){
        if (N % 7 == 0){
            while(N > 0)
            {
                if(N % 10 == 7){
                    return false;
                }
                N=N/10;
            }
            return true ; 
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input= scanner.nextInt(); 
        System.out.println(isGoodNumber(input));
    }
}