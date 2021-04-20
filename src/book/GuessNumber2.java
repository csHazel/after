package book;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber2{
    public static void main (String args[]) {
        System.out.println("请在心中想一个数我来猜:");
        Random random = new Random();
        Scanner reader = new Scanner(System.in);
        int myGuess=0,lastGuess=0,result=0,lastGuessL=1,lastGuessR=100;
        myGuess = random.nextInt(100) + 1;

        System.out.print("你心里的数是"+myGuess+"吗");
        result =reader.nextInt();
        while (result != 2) {
            if (result ==1){
                lastGuessR=myGuess-1;
            }
            else if (result==0) {
                lastGuessL=myGuess+1;
            }
        myGuess=lastGuessL+random.nextInt(lastGuessR-lastGuessL+1);
            System.out.print("你心里的数字是"+myGuess+"吗");
            result=reader.nextInt();
        }
        System.out.print("猜对了！");

    }
}
