package com.OOPS;



import java.util.Random;
import java.util.Scanner;

class game{
    public int comp_no;

    game(){
        Random r=new Random();
        comp_no=r.nextInt(0,101);
//        System.out.println(comp_no);
    }
}
public class guess_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        game obj=new game();
        int random=obj.comp_no;
        //user chance
        System.out.println("enter a number between 0 and 100");
        int user_chance;
        int guess_no=0;
        do {
            user_chance= sc.nextInt();
            if (user_chance>random){
                System.out.println("Guessed number is greater than chosen one");
            }
            else if (user_chance<random){
                System.out.println("Guessed number is lesser than chosen one");
            }
            else {
                System.out.println("You have guessed correct number");
            }
            guess_no+=1;
        }while(user_chance!=random);
        System.out.println("Your Guessing count is: " + guess_no);
    }

}

