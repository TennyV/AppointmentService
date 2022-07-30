package src;

import src.main.Appointment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class AppointmentService {

    private static List<Appointment> appointmentList = new ArrayList<> ();

    public AppointmentService addAppointment(String uniqueID, LocalDate aptDate, String aptDetails) {

        Appointment appointment = new Appointment(uniqueID,aptDate,aptDetails);
        appointmentList.add(appointment);

        return this;
    }
    public AppointmentService deleteAppointment(String uniqueId) {
        for(int i = 0; i < appointmentList.size(); i++) {
            if(appointmentList.get(i).getUniqueID().equals(uniqueId))
                appointmentList.remove(appointmentList.get(i));
        }
        return this;
    }

    public static void main (String[] args) {
        AppointmentService appointmentService = new AppointmentService ().addAppointment ("777777777",
                LocalDate.of (2023,1,1),"Just the details");
        appointmentService.addAppointment("34343", LocalDate.of(2023,8,9),"Did I get added?");
        System.out.println("Appointment ID: " + appointmentList.get (0).getUniqueID ());
        System.out.println ("Appointment Date: " + appointmentList.get(0).getAptDate ());
        System.out.println("Appointment Details: " + appointmentList.get(1).getAptDetails ());
        appointmentService.deleteAppointment("777777777");

        System.out.println("Appointment ID: " + appointmentList.get (0).getUniqueID ());


    }
}
