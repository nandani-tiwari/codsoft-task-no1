package com.company;
// import java.util.random.*;
import java.util.Random;
import java.util.Scanner;
class Game{
    int computer;
    public Game(){
        Random rand = new Random();
        computer = rand.nextInt(100);
        System.out.println("Guess the number from 1 to 100");
    }
    public int computerNo() {
        return computer;
    }
}
public class GTN {
    static int takeUserInput(){
        System.out.println("Enter:");
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        return user;
    }
    static void isCorrectNumber(int i, int j){
        if(i == j){
            System.out.println("Correct Number Guess");
        }
        else if(i > j){
            System.out.println("Your number is Big than computer number");  
        }
        else{
            System.out.println("Your number is Small than computer number");
        }
    }
    public static void main(String[] args) {
        int user = 0, computer = 0, attempt = 0;
        Game g = new Game();
        do{
            user = takeUserInput();
            computer = g.computerNo();
            // System.out.println(user);
            // System.out.println(computer);
            isCorrectNumber(user, computer);
            attempt++;
        } while(user != computer);
        System.out.println("You guess number in "+attempt+" attempts");
    }
}