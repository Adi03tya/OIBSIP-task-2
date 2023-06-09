import java.util.Scanner;
import java.util.Random;

public class guess_the_number {

public static void guess(int num, int attempts,int score, Scanner data,Random number){
   
    //System.out.println(num);
    int atmpt = attempts;

    for (int i=0; i<=atmpt; i++){
        if (attempts==0){
            System.out.printf("You Loose! The number was %d\n\n",num);

            break;
        }

        System.out.printf("Attempts left : %d \n",attempts--);
        System.out.println();
        System.out.print("Guess the number between 0 to 100 : ");
        int n = data.nextInt();
        
        if (num == n){
            System.out.println("You guessed it write! ");
            score +=1;

            System.out.printf("your score is : %d\n",score);
            System.out.println();
            System.out.println("press 1 to continue");
            System.out.println("press 2 to Quit");
            int choice = data.nextInt();
            if (choice ==1){
                attempts=10;
                num = number.nextInt(100);
                guess(num, attempts, score, data, number);
            }
            else if (choice==2){
                break;
            }
            break;                  
        }
        else if(num > n){
            System.out.println("too low...");
        }
        else { System.out.println("too high...");
        }
           
    }
}
 public static void main(String[] args){
    
    Scanner data = new Scanner(System.in);
    Random number = new Random();

    

    System.out.println("WELCOME TO THE GAME\n");
    System.out.println("Choose an action :");
    System.out.println("press 1 to Start");
    System.out.println("press 2 to Quit");

    int choice = data.nextInt();

    switch(choice){
        case 1: 
        int attempts =0;
        int score =0;
        int num = number.nextInt(100);
        
        System.out.println("Choose difficulty level:");
        System.out.println("1 - Easy(10 attempts)");
        System.out.println("2 - Medium(7 attempts)");
        System.out.println("3 - Hard(5 attempts)");
        int choose_difficulty = data.nextInt();  

        switch(choose_difficulty){
        
        case 1:  
                 attempts =10;
                    break;
        case 2:
                attempts=7;
                break;
        case 3: 
                attempts=5;
                break;
                
        default : System.out.println("Enter valid input!");
        }

        guess(num, attempts, score, data, number);
        


  break;

        case 2:  System.out.println("You quited the game!");
                break;
    }
    data.close();
    
 }   
}
