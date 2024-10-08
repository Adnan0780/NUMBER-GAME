import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        Scanner game=new Scanner(System.in);

        int chances=   8;
        int  finals=0;
        boolean playnexttime=true;
        System.out.println("   HELLO GAMER   ");
        System.out.println("   Hello Gamer You Know About  " +   chances   +"  To Win The Game  " );
        while (playnexttime) {
            int rand=getrandN(1,100);
            boolean guess = false;
            for(int i =0; i<=chances; i++){
                System.out.print("  Chance  "+ (i+1)+"  Enter Your Guess  ");
                int user=game.nextInt();
                if (user==rand) {
                    guess=true;
                    finals+=1;
                    System.out.println("VECTORY");
                    break;
                }
                else if (user>rand) {
                    System.out.println("Too High");
                }
                else{
                    System.out.println("Too High");
                }

            }
            if (guess==false) {
                System.out.println("Sorry You Defeat This Chance.: NUMBER IS "+rand);
            }
            System.out.println("Are You Play Again(Yes/No)");
            String pA = game.nextLine();
            playnexttime=pA.equalsIgnoreCase("Yes");
        }
        System.out.println("that it hope you enjoy it");
        System.out.println("this is your score"+finals);
    }
    public static int getrandN(int min,int max){
        return(int )(Math.random()*(max-min+1)+min);
    }
    
    
}
