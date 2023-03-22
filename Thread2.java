package tarea04;

// Class 2 (similar to class 1)
// Helper class extending the Thread class

class Thread2 extends Thread {

    SharedDataPrinter p;

    public Thread2(SharedDataPrinter p) {
        this.p = p;
    }

    public void run() {
        // Print statement
        p.display("Enrique Felix");
    }
}