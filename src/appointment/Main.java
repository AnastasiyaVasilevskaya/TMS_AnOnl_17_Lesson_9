package appointment;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        director.printAppointment();
        worker.printAppointment();
        accountant.printAppointment();
    }
}
