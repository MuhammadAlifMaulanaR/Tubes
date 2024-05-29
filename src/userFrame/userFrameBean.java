
package userFrame;

import java.sql.Date;
import java.sql.Time;

public class userFrameBean {
   private int bookingId;
   private int lapanganId;
   private Date tanggalBooking;
   private Time startTime;
   private Time endTime;
   private double totalHarga;
   private String namaTeam;

    public userFrameBean(int bookingId, int lapanganId, Date tanggalBooking, Time startTime, Time endTime, double totalHarga, String namaTeam) {
        this.bookingId = bookingId;
        this.lapanganId = lapanganId;
        this.tanggalBooking = tanggalBooking;
        this.startTime = startTime;
        this.endTime = endTime;
        this.totalHarga = totalHarga;
        this.namaTeam = namaTeam;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getLapanganId() {
        return lapanganId;
    }

    public void setLapanganId(int lapanganId) {
        this.lapanganId = lapanganId;
    }

    public Date getTanggalBooking() {
        return tanggalBooking;
    }

    public void setTanggalBooking(Date tanggalBooking) {
        this.tanggalBooking = tanggalBooking;
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

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public String getNamaTeam() {
        return namaTeam;
    }

    public void setNamaTeam(String namaTeam) {
        this.namaTeam = namaTeam;
    }
    
}
