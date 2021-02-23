import java.util.*;

public class MazeRunner {
    static Maze myMap = new Maze(); 

    public static void main(String[] args) {
        intro(); 
    }

    public static void intro() {
        System.out.println("\nWelcome to the Maze Runner game! Here is what your maze currently looks like: "); 
        myMap.printMap(); 
        dashedLines(); 
    }
    // welcome the user into the program and print the new map 

/*

    public static String userMover() {
        //take in desired direction of move, and check if that direciton is valid and possilbe

        if myMap.canIMoveRight("R"); = true{
            myMap.MoveRight(); 
        }

        if myMap.canIMoveLeft("L"); = true{
            myMap.MoveLeft(); 
        }

        if myMap.canIMoveUp("U"); = true{
            myMap.MoveUp(); 
        }

        if myMap.canIMoveDown("D"); = true{
            myMap.MoveDown(); 
        }

        return direction; 
    
    }


    public static void movesMessage(moves) {
        //print message after certain number of moves
        //count moves 
    }

    public static void navigatePit(direction) {

    }

    */ 

//This method is used to make it easier for the user to read what is in the console 
    public static void dashedLines() {

        System.out.println(); 

        for (int i = 1; i <=150; i++) {

            System.out.print("-");

        }

        System.out.println();

    }
 
    
}