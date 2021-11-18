//In this Single Player Dice Game if your Dice value is greater than the computer dice value then you won the game and if less then you lost the game
 //the game if both are equal then the game is draw!!
import java.util.Random;

public class Dice
{
    public static void six(){
        System.out.print("----------\n|  *    *|\n|  *    * |\n| *   * |\n--------");

    }
     public static void five(){
        System.out.print("----------\n|  *    * |\n|  *   |\n|  *   * |\n--------");
     }

     public static void four(){
        System.out.print("----------\n|  *    * |\n|  *   |\n|  *   * |\n---------");
     }
     public  static  void three(){
         System.out.print("----------\n|  *    |\n|  *   |\n|     * |\n---------");
     }
    public  static  void two(){
        System.out.print("----------\n|  *    |\n|     |\n| *   |\n---------");
    }

    public  static  void one(){
        System.out.print("----------\n|  |\n|  *    |\n|     |\n---------");
    }
    public static int random(){
        Random r = new Random();
        int a=r.nextInt(6)+1;
        return a;
    }
    public static void main(String[] args)
    {
                int you = random();
        int computer = random();
        System.out.println("Welcome to the Dice Game!!");
        switch(you){
            case 1: one();
            break;
            case  2: two();
            break;
            case 3: three();
            break;
            case 4: four();
                break;
            case 5: five();
                break;
            case 6: six();
                break;
        } //if your dice value is greater than computer dice value then you won
        if(you>computer){
            System.out.println("\nLucky! you won. \n");

        }
        //if your dice value is less than computer dice value then you lost
        if(computer>you){
            System.out.println("\nYou lost :( \ntap run button till you win:)");
        }//if your dice value is equal to computer dice value then you won
        if(you == computer){
            System.out.println("\nDraw! click run button again");
        }
    }
}
