/*
 * Simulation: The Tortoise and the Hare. Check who wins the race by showing 
 *             their each postion in every second.
*/
package troitiseandthehare;
import java.util.Random;
import java.time.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author Sanjay
 */
public class troitiseandthehare {
    
    private String Hare,Troitise;
    private int TroPos,count,sum,posHare,
            haresquare=1,Trosquare=1, winner=0; //accumulation to 1=start at 1
    
   Random rand=new Random(); //Random number generator
    
   //Empty Constructor
    public troitiseandthehare(){
           
    }
    
    // method that start the race and show us the result
    public void startRace(){
       
       while(winner==0)   //run until there is no winner
       {
         haresquare +=  HarePos();   //accumulate the position of Hare
          Trosquare += TroPos();     //accumulate the position of Tortise
  
           if( haresquare<=1)
           {
            haresquare=1;
           }
           else if (Trosquare<=1)
           {
           Trosquare=1;
           }
  
          displayHareTroPosline(haresquare,Trosquare ); //Display the position 
          winner = winnerIs(haresquare,Trosquare);//Check the race winner

        }        
    }
     
    //return 1 if there is result which will make while loop stop
    
    int winnerIs(int haresquare, int Trosquare){
                if( haresquare>=70 && Trosquare>=70 ) 
                {
                   System.out.printf("It's a tie. (The troitise is a underdog!)\n");
                   return 1;
                }
                else if( haresquare>=70 )
                {
                   System.out.printf("Hare Wins! Yuch.\n");
                   return 1;
                }
                else if( Trosquare>=70 ) 
                {
                   System.out.printf("TORTOISE WINS!!! YAY!!!\n");
                   return 1;
                }   
                else
                   return 0;
    }


   //if else statement to return the position of troitise
   public int TroPos(){
       int Tro;
        Tro=rand.nextInt(10)+1;
       
        if(Tro>=1 && Tro<=5){
            return +3;
        }
        else if(Tro>=6 && Tro<=7){
            return -6;
        }
        else 
        {
            return +1;
        }
    }
    
   
    //swich statement to return position of Hare
    public int HarePos()
    {  
        int Hare;
        
        Hare=rand.nextInt(10)+1;
         
         switch(Hare){
            case 1: return +0;
                         
            case 2: return +0;
            
            case 3: return +9;
                    
            case 4: return +9;
                          
            case 5: return -12;
                      
            case 6: return +1;
                    
            case 7: return +1;
                 
            case 8: return +1;
                      
            case 9: return -2;  
            
            case 10:return -2;
            default: return +0;
                                     
        }       
         
    }
    
    /*Display the position of Hare and Tortise 
    * For loop to print 70 underscores lines 
    * if statement to distinguish the postion and determine the race
    */
    

    public void displayHareTroPosline(int pos,int pos1){
        
        for(int i=0; i<=70; i++){
            if(pos==i){
                System.out.print("H");
            }
            else 
            {
            System.out.print(" _ ");
            }
           
        }
         System.out.println();
            
       
        
        for(int i=0; i<=70; i++){
            if (pos1==i){
                System.out.print("T");
            }
          
            else
            {
            System.out.print(" _ ");
            }
            
            
        }
        
        System.out.println("\n");
        try {
                Thread.sleep(1000);         //run every 1 second   
            } catch (InterruptedException ex) {
                ex.printStackTrace();
        }
        
     
      if(pos1==pos) {
            System.out.printf("OUCH!!!\n");   //if both positions are same
        }    
       
    }
}

    

