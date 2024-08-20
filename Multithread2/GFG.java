
package learncoding;


// Java program to suspend a thread temporarily

// Importing all classes from
// java.util package
class MyThread extends Thread {

	// Remember : Method can be executed multiple times
        @Override
	public void run()
	{

		// Try block to check if any exception occurs
		try {

			// Print and display the running thread
			// using currentThread() method
			System.out.println(
				"Thread " + Thread.currentThread().getId()
				+ " is running");
		}

		// Catch block to handle the exceptions
		catch (Exception e) {

			// Message to be printed if
			// the exception is encountered
			System.out.println("Exception is caught");
		}
	}
}

// Class-Main
public class GFG {

	// Main Driver Method
	public static void main(String[] args) throws Exception
	{

		// Creating a thread
		MyThread thread = new MyThread();

		// Naming thread as "GFG"
		thread.setName("GFG");

		// Start the functioning of a thread
		thread.start();

		// Sleeping thread for specific amount of time
		Thread.sleep(500);

		// Thread GFG suspended temporarily
		thread.suspend();

		// Display message
		System.out.println(
			"Thread going to sleep for 5 seconds");

		// Sleeping thread for specific amount of time
		Thread.sleep(5000);

		// Display message
		System.out.println("Thread Resumed");

		// Thread GFG resumed
		thread.resume();
	}
}

