import java.util.Random;
import java.util.Scanner;

class game{
    private int guess;
    private final int rand;
    private int noofguess;
    private final Scanner sc;

    public game(){
        Random random = new Random();
        rand=random.nextInt(100);
        noofguess=0;
        sc = new Scanner(System.in);
    }
    public void userInput(){
        
        guess = sc.nextInt();
        
    }
    public int iscorrectno(){
        while(rand!=guess){
            System.out.println("Enter Your Choice No :");
            userInput();
            noofguess++;
            if(rand<guess){
                System.out.println("Choose a Smaller No ::");
            }
            else if(rand>guess){
                System.out.println("Choose a Bigger No ::");
            }
        }
        return noofguess;
    }
    
}

public class guessTheNoGame {
    public static void main(String[] args) {
        game g = new game();
        int guesses=g.iscorrectno();
        System.out.println("--Welcome to No Guess Game ! & The No of Gueses are ..--"+guesses);
        
    }
}
