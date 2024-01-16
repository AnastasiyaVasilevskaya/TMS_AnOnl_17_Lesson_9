package appointment;

public class Main {
    public static void main(String[] args) {
        Appointment director = new Director();
        Appointment worker = new Worker();
        Appointment accountant = new Accountant();

        director.printAppointment();
        worker.printAppointment();
        accountant.printAppointment();
    }
}
