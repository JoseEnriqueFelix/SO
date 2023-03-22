package tarea04;

// Class 3
// Main class

class GFG {
    // Main driver method

    public static void main(String[] args) {
        // Instance of a shared resource used to print
        // strings (single character at a time)
        SharedDataPrinter printer = new SharedDataPrinter();
        // Thread objects sharing data printer
        Thread1 t1 = new Thread1(printer);
        Thread2 t2 = new Thread2(printer);
        // Calling start methods for both threads
        // using the start() method
        t1.start();
        t2.start();
    }
}