
package oodassign7;
import java.util.Scanner;

/**
 *
 * @author william Fletcher This program allows the user to turn on/off 3 different types of devices
 * using a single interface that each device's class overrides for class specific implementation.
 * Released as open source, use it however you want to! :)
 */
public class OODAssign7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int deviceBit = 0;
        TV myTV = new TV(true);
        DVDPlayer mydvd = new DVDPlayer(true);
        Stereo mystereo = new Stereo(true);
       while(true){
        System.out.println("Which device do you wish to turn on?");
       Scanner s = new Scanner(System.in);
       System.out.println("1 - TV, 2- Stereo, 3- DVD Player;");
       deviceBit = s.nextInt();
       switch(deviceBit){
           case 1:
               System.out.println(myTV.cyclePower());
               break;
           case 2:
                 System.out.println(mystereo.cyclePower());
                 break;
           case 3: 
                System.out.println(mydvd.cyclePower());
                break;
       
       
       }
       
       }
      
    }
    
}
