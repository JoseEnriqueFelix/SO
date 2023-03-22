package tarea04;

// Class 2
// Helper class extending the Thread class

class Thread1 extends Thread {
    SharedDataPrinter p;
    // Thread
    public Thread1(SharedDataPrinter p) {
        // This keyword refers to current instance itself
        this.p = p;
    }
    
    // run() method for this thread invoked as
    // start() method is called in the main() method
    
    public void run() {
        // Print statement
        p.display("Hola Jose ");
    }
}
