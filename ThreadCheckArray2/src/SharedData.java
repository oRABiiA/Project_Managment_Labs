import java.util.ArrayList;

/** A class which holds data for the threads
 * 
 * @author Rabea Lahham
 * @author Majd Salameh
 *
 */
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/** Constructor
	 * 
	 * @param array     a list of integers
	 * @param b         an integer value
	 * 
	 */
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/** getter for winArray
	 * 
	 * @return        returns winArray in the object
	 * 
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/** setter for winArray
	 * 
	 * @param winArray        an array of boolean values
	 * 
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/** getter for array variable 
	 * 
	 * @return                 returns array in the object
	 * 
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/** getter for B variable
	 * 
	 * @return               returns B variable in the object
	 * 
	 */
	public int getB() 
	{
		return b;
	}

	/** getter for flag variable 
	 * 
	 * @return                    returns the flag in the object
	 * 
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/** setter for flag 
	 * 
	 * @param flag               holds a boolean value
	 * 
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
