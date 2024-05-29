
package mainFrame;
import java.sql.Time;
import java.util.Date;

public class MainBean {
    private Time startTime;
    private Time endTime;
    private Date tanggalBooking;
    private int idLapangan;

    public MainBean(Time startTime, Time endTime, Date tanggalBooking, int idLapangan) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.tanggalBooking = tanggalBooking;
        this.idLapangan = idLapangan;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public Date getTanggalBooking() {
        return tanggalBooking;
    }

    public void setTanggalBooking(Date tanggalBooking) {
        this.tanggalBooking = tanggalBooking;
    }

    public int getIdLapangan() {
        return idLapangan;
    }

    public void setIdLapangan(int idLapangan) {
        this.idLapangan = idLapangan;
    }
     
}
