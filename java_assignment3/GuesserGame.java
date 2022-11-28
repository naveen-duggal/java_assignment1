// add more feature in guesser game
//first thing we do that in place of take the number from the guesser...
//To take random number by math.random() function acc. to range

import java.util.*;
import java.lang.Math;
class Guesser
{
    int getRandomNumber(int min, int max)
    {
        int n = (int)(Math.random() * (max - min)) + min;
        return n;
    }
}
class Player
{
    int guessNum;
    int guessNum()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player kindly guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }

}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    String player1name = "Player-one";
    String player2name = "Player-two";
    String player3name = "Player-three"; 
    
    void collectNumFromGuesser()
    {
        Guesser g = new Guesser();
        numFromGuesser = g.getRandomNumber(0,100);
        System.out.println("Guesser number is " + numFromGuesser);
    }

    void collectNumFromPlayers()
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.guessNum();
        numFromPlayer2 = p1.guessNum();
        numFromPlayer3 = p1.guessNum();
    }
     
    /**
     * 
     */
    void compare()
    {
        if(numFromGuesser == numFromPlayer1)
        {
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
            {
                System.out.println("All players won the game");
            }
            else if(numFromGuesser==numFromPlayer2)
            {
                System.out.println("Player1 & Player2 won");
            }
            else if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("Player1 & Player3 won");
            }
            else
            {
                System.out.println("Player 1 won the game");
            }
        }

        else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
        }
        else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
    }

    //also one feature I want add in guesser game..
    //How much the playerValue is less than or greater than the guessvalue

        void PlayerlessMoreThanGuessnum(int numGuesser,int numPlayer,String player)
        {
            int guessNumPlusPlayerNum  = numPlayer-numGuesser;

            if(numGuesser!=numPlayer)
            {
                if(guessNumPlusPlayerNum<0)
                {
                    System.out.println(player + " num is less than the guesser value is " + guessNumPlusPlayerNum*-1);
                }
                else
                {
                    System.out.println(player + " num is more than the guesser value is " + guessNumPlusPlayerNum);
                }
            }
        }
}

//add one ludo dice game 
class Ludo
{
    final int min=1;
    final int max=6;
    int n;
    int guessNum;
    void randomDice()
    {
        n = (int)(Math.random() * (max - min)) + min;
        System.out.println(n);
    }

    void player()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player kindly guess the dice number");
        guessNum = scan.nextInt(); 
    }

    void checkValue()
    {
        if(n==guessNum)
        {
            System.out.println("WIN the game...");
        }
        else
        {
            System.out.println("LOSS the game...");
        }
    }
 
}

public class GuesserGame {
    public static void main(String[] args)
    {
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
        u.PlayerlessMoreThanGuessnum(u.numFromGuesser, u.numFromPlayer1, u.player1name);
        u.PlayerlessMoreThanGuessnum(u.numFromGuesser, u.numFromPlayer2, u.player2name);
        u.PlayerlessMoreThanGuessnum(u.numFromGuesser, u.numFromPlayer3, u.player3name);

        System.out.println("====================================");
        Ludo l = new Ludo();
        l.randomDice();
        l.player();
        l.checkValue();
    }
}