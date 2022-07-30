package src.main;
import java.time.LocalDate;


public class Appointment {



        private String uniqueID;
        private LocalDate aptDate;
        private String aptDetails;



    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public LocalDate getAptDate() {
        return aptDate;
    }

    public void setAptDate(LocalDate aptDate) {
        this.aptDate = aptDate;
    }

    public String getAptDetails() {
        return aptDetails;
    }

    public void setAptDetails(String aptDetails) {
        this.aptDetails = aptDetails;
    }


    public Appointment (String uniqueID, LocalDate aptDate, String aptDetails) {
            this.uniqueID = uniqueID;
            this.aptDate = aptDate;
            this.aptDetails = aptDetails;

            if (uniqueID.length ()>10 || uniqueID.equals (null)) {
                throw new IllegalArgumentException ("uniqueID is invalid");
            }
            if (aptDate.equals (LocalDate.now ()) || aptDate.equals(null)) {
                throw new IllegalArgumentException ("appointment date is invalid");
            }
            if (aptDetails.length ()>50 || aptDate.equals (null)) {
                throw new IllegalArgumentException ("appointment description illegal");
            }

        }
    }

