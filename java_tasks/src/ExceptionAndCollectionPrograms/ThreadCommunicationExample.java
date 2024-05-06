package ExceptionAndCollectionPrograms;

class Taxi{
    int totalTaxis=0;

    public Taxi(int totalTaxis) {
        super();
        this.totalTaxis = totalTaxis;
    }

    public int getTotalTaxis() {
        return totalTaxis;
    }

    public void setTotalTaxis(int totalTaxis) {
        this.totalTaxis = totalTaxis;
    }
}

class Passenger implements Runnable{
    Taxi taxi;

    public Passenger(Taxi taxi) {
        this.taxi = taxi; // Initialize the taxi object
    }

    @Override
    public void run() {
        System.out.println("Passenger is booking for taxi.");
        try {
            synchronized(taxi) { // Synchronize on the shared taxi object
                if(taxi.getTotalTaxis() > 0) {
                    System.out.println("Booking confirmed...");
                } else {
                    taxi.wait(); // Wait for notification from the Agency
                    run();
                }
            }
        } catch(InterruptedException e) {
            e.printStackTrace(); // Print the stack trace if interrupted
        }
    }
}

class Agency implements Runnable{
    Taxi taxi;

    public Agency(Taxi taxi) {
        this.taxi = taxi; // Initialize the taxi object
    }
    
    @Override
    public void run() {
        System.out.println("Adding new Taxis..");
        try {
            Thread.sleep(2000);
            synchronized(taxi) { 
                taxi.setTotalTaxis(2);
                taxi.notify();
//                taxi.notifyAll(); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace(); 
        }
    }
}

public class ThreadCommunicationExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi(0); 

        Passenger passenger = new Passenger(taxi); 
        Thread t1 = new Thread(passenger);
//        Thread t2 = new Thread(passenger);
        
        Agency agency = new Agency(taxi); 
        Thread t3 = new Thread(agency);

        t1.start();
//        t2.start();
        t3.start(); 
    }
}
