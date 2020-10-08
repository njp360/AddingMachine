/**
 * Nicholas Proctor
 * CSE360
 * Assignment 02
 */
package cse360assignment02;

/**
 * A class which adds and subtracts by
 * the user's input. Can also tell the total and clear itself.
 * @author njproc
 */
public class AddingMachine {
    private int total;
    
    /**
     * The main method of AddingMachine. Creates an AddingMachine object
     * named myCalculator to present
     * the functions of AddingMachine.
     * @param args
     */
    public static void main(String[] args) {
    	AddingMachine myCalculator = new AddingMachine();
    	
    	myCalculator.add(4);
    	myCalculator.subtract(2);
    	myCalculator.add(5);
    	
    	myCalculator.getTotal();
    	myCalculator.clear();
    }
    
    /**
     * Clarifies the starting total and the starting history.
     */
    public AddingMachine () {
        total = 0; //included for clarity
        System.out.print(total);
    }
    
    /**
     * Returns the current total of the previous transactions.
     * @return 
     */
    public int getTotal () {
        System.out.println(" = " + total);
        System.out.print(total);
    	return total;
    }
    
    /**
     * Adds the given parameter value to the current total.
     * Updates the history next.
     * @param value 
     */
    public void add (int value) {
        total = total + value;
        System.out.print(" + " + value);
    }
    
    /**
     * Subtracts the given parameter from the current total.
     * Updates the history next.
     * @param value 
     */
    public void subtract (int value) {
        total = total - value;
        System.out.print(" - " + value);
    }
    
    /**
     * Presents a history of the transactions.
     * @return 
     */
    public String toString () {
        return "";
    }
    
    /**
     * Clears the AddingMachine's history and resets
     * the total to 0.
     */
    public void clear() {
        total = 0;
        System.out.println("");
        System.out.print(total);
    }
}
