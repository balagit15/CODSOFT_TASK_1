import java.util.*;
public class Main {
    public static void guessingGame( int attempts,int count)
    {
         Scanner si = new Scanner(System.in);
         Random rn = new Random();
        int score;
        int orginalNumber= rn.nextInt(100);
        System.out.println("Level "+count);
        System.out.println("Guess no between 1-100 ");
        System.out.println("No of Attempts left: "+attempts);
        int userNumber;
        int att = attempts;
        for(int i=attempts;i>0;i--)
        {
            System.out.println("enter no: ");
            userNumber = si.nextInt();
            if(userNumber == orginalNumber)
            {
                System.out.println("you guessed correctly");
                score = attempts*10;
                System.out.println("Level "+count+"  Score : "+score+"/ "+(att*10));
                System.out.println("play again? (1/0) : ");
                int y = si.nextInt();
                if(y == 1)
                {
                    count= count+1;
                    System.out.println("-------------------------------------------------------");
                    guessingGame(att-1,count);
                }
                else{
                    break;
                }
            }
            else if(userNumber>orginalNumber)
            {
                System.out.println("Incorrect...too high....try again");
                attempts = attempts -1;
                System.out.println("No of attempts left : "+attempts);
            }
            else
            {
                System.out.println("Incorrect...too low....try again");
                attempts = attempts -1;
                System.out.println("No of attempts left : "+attempts);
            }
        }
        System.out.println("orginal no is: "+orginalNumber);
        System.out.println("score: "+0);
        System.out.println("play again? (1/0) : ");
        int x = si.nextInt();
        if(x == 1)
        {
            System.out.println("------------------------------------------------------------");
            guessingGame(att,count++);
        }
        else{
            System.out.println("thank you...come again!!");
        }

    }
    public static void main(String[] args) {

        guessingGame(5,1);
    }
    }
