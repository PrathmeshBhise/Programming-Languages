import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Random random = new Random();
        try(Scanner sc = new Scanner(System.in)){
            int win = 0;
            int lose = 0;
            int i=0;
            while(i<5){
                System.out.println("\n ****   Welcome to Rock Paper Scissor Game !!   ****");
                System.out.println(" 0 -> Rock  &  1 -> Paper  &   2 -> Scissor" );
                System.out.print("Enter Your Choice :");
                int choice = sc.nextInt();
                int computerChoice = random.nextInt(3);
                if(choice>2 || choice<0){
                    System.out.println("Invalid Choice");
                    continue;
                }
                else if(choice==computerChoice){
                    System.out.println("Its a Draw");
                }
                else if(choice==0 && computerChoice==2 ){
                    System.out.println("Your Choice : Rock     X     Computer Choice : Scissor");
                    System.out.println("You Win");
                    win++;
                    
                }
                else if(choice==1 && computerChoice==0 ){
                    System.out.println("Your Choice : Paper     X     Computer Choice : Rock");
                    System.out.println("You Win");
                    win++;
                    
                }
                else if(choice==2 && computerChoice==1 ){
                    System.out.println("Your Choice : Scissors     X     Computer Choice : Paper");
                    System.out.println("You Win");
                    win++;
                   
                }
                else if(choice==0 && computerChoice==1 ){
                    System.out.println("Your Choice : Rock     X     Computer Choice : Paper");
                    System.out.println("You Lose");
                    lose++;
                    
                }
                else if(choice==1 && computerChoice==2 ){
                    System.out.println("Your Choice : Paper     X     Computer Choice : Scissors");
                    System.out.println("You Lose");
                    lose++;
                    
                }
                else if(choice==2 && computerChoice==0 ){
                    System.out.println("Your Choice : Scissors     X     Computer Choice : Rock");
                    System.out.println("You Lose");
                    lose++;
                    
                }
                i++;
            }

            //Final Results
            if( win>lose){
                System.out.println("You Win By Total Wins of :"+ win);
            }
            else if(win==lose){
                System.out.println("Its a Draw");
            }
            else{
                System.out.println("You lose By Total lose of :"+ lose);
            }
            
            
            
        }
        
    }
}
