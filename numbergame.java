import java.util.*;
class numbergame{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
       System.out.println("You have to guess a number between 1 to 100 ");
       System.out.println("There will be a total of 5 attempts and you will be marked out of 5");
        int attempt=5;
        int c=0;
        int score=0;
        int max=100;
        int min=1;
        while(c!=attempt){
 int n=min+random.nextInt(max);
        System.out.println("Guess a number ");
        
        int n1=sc.nextInt();
        System.out.println("The random number generated is "+n);
        c=c+1;
        if(n1==n){
            System.out.println("Congrats!you are the winner in this round ");
            score++;
            System.out.println("Your current score is "+score);
        }
        else{
            System.out.println("Better luck next time ");
            System.out.println("Your current score is "+score);
        }

    }
    System.out.println("Your total score is  "+score);
}
}