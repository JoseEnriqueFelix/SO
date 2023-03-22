package tarea04;
// Importing input output classes
import java.io.*;

// Class 1
// Helper class

class SharedDataPrinter {
    // Monitor implementation is carried on by
    // Using synchronous method

    // Method (synchronized)
    synchronized public void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            // Try-catch block for exceptions as we are
            // using sleep() method
            try {
                // Making thread to sleep for very
                // nanoseconds as passed in the arguments
                Thread.sleep(100);
            }
            catch (Exception e) {

            }
        }
    }
}