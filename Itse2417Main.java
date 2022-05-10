/** Menu program for ITSE2417 Programming Final Project
 *  Used with Github practice the GitHub process.
 *  @author Steve Smiley, Tarrant County College
 *  @version 1.0
 */

// ***************************************************************
// DO NOT MODIFY THIS SECTION
// Any imports needed for your program should be included in 
// your local object
// ***************************************************************
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
// ***************************************************************
// END OF IMPORT SECTION
// ***************************************************************

public class Itse2417Main
{
    // ***********************************************************
    // static variables that can be referenced using Itse2417Main. references
    // DO NOT CHANGE!
    // ***********************************************************
    static String semester = "Spring 2022";
    static Scanner myScan = new Scanner(System.in);

    /**
     *  For the menu array, replace FinalProj with the name of your class
     *  Please make sure that you
     *      (1) DO NOT DELETE keyword new (Your class has to be instantiated)
     *      (2) Put your code on the correct line
     *  See Entry 22 for an example.
     *
     *  Notes:
     *      Your class will be named Lastname.java
     *      Use FinalProj.java as your starting code template. @see FinalProj.java
     *      Can contain menus.
     *      If you need a Scanner from keyboard, use Itse2417Main.myScan,
     *          a static Scanner provided by the main menu program.  Using
     *          your own, local Scanner will cause problems for everyone.
     *      Will be implementing the begin() method of the FinalProject interface. @see FinalProject.java
     *      Do whatever you want inside begin().  Main requirement: your program must end cleanly 
     *          and return to Itse2417Main to display the menu.
    */

    static ArrayList<Object> menu = new ArrayList<Object>  (
        Arrays.asList(   
            new FinalProj(),          // Bacon 
            new FinalProj(),          // Conzelman  
            new FinalProj(),          // Garcia Tadeo
            new FinalProj(),          // Gilhespy
            new FinalProj(),          // Hankins
            new FinalProj(),          // Hernandez
            new FinalProj(),          // Kline
            new FinalProj(),          // Koranda
            new FinalProj(),          // Pokluda
            new RasconMenu(),          // Rascon
            new FinalProj(),          // Rodriguez
            new FinalProj(),          // Subba
            new FinalProj(),          // Terrell
            new FinalProj(),          // Willis Hall
            new SmileyMenu()          // Smiley
                                                    ));
    // ***************************************************************
    // END OF MENU OBJECTS LIST
    // ***************************************************************
    // Constants for the menu choices
    final static int MAXCHOICE = menu.size();
    final static int EXIT = 0;
    
    /**
     * Starting point for the program.
     *     Displays the menu list as selected by the user
     *     Executes the entry in the 
     *  
     * @param args - command line arguments (not required for this program)
     * @return void
    */
    public static void main(String[] args)
    {
        // Verified user entry
        int selection = -1;

        do
        {
            // Display the menu and get the user's choice.
            selection = showMenu();

            if(selection > 0)
            {
                FinalProject e = (FinalProject) menu.get(selection - 1);
                e.begin();    
            }
        } while (selection != 0);

        myScan.close();
    }

    /**
     * Displays the user menu, a list of students in the class numbered.
     * User selects a number, which is converted to int and returned to main.
     * 
     * @return input    User selection from the menu as an int    
     * @throws NumberFormatException    Selection out of range or nonnumeric
     */
    static int showMenu() throws NumberFormatException
    {
        int input = -1;

        System.out.println("*******************************************************************");
        System.out.println("*      Welcome to the " + semester + " Program!");
        System.out.println("*      Make a selection from the list below to see student output");
        System.out.println("*");
        System.out.println("*      Enter 0 and press Enter to Quit.");
        System.out.println("*******************************************************************");

        System.out.println("1.  Bacon");
        System.out.println("2.  Conzelman");
        System.out.println("3.  Garcia Tadeo");
        System.out.println("4.  Gilhespy");
        System.out.println("5.  Hankins");
        System.out.println("6.  Hernandez");
        System.out.println("7.  Kline");
        System.out.println("8.  Koranda");
        System.out.println("9.  Pokluda");
        System.out.println("10. Rascon");
        System.out.println("11. Rodriguez");
        System.out.println("12. Subba");
        System.out.println("13. Terrell");
        System.out.println("14. Willis Hall");
        System.out.println("15. Smiley");
        System.out.println("0.  Exit");
        System.out.println();
        System.out.print("Your selection? ");
        
        try
        {
            input = myScan.nextInt();
            
            if( input < EXIT || input > MAXCHOICE)
            {
                throw new NumberFormatException();
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println();
            System.out.println("*****************     ERROR     *****************");
            System.out.println("Please enter a number from the menu or 0 to exit.");
            System.out.println("*****************     ERROR     *****************"); 
            input = -1;
            System.out.println();   
        }

        return input;
    }
}
