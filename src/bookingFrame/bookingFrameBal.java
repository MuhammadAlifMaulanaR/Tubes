package bookingFrame;

import APP.DB;
import java.awt.Color;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

public class bookingFrameBal {
  
    public List isAvailable(Date tanggalBooking, int lapanganId) {
    List list = new ArrayList<>();
    try {
        String sql = "SELECT StartTime, EndTime FROM booking WHERE tanggal_booking = ? AND lapangan_id = ?";
        PreparedStatement ps = DB.con.prepareStatement(sql);
        ps.setDate(1, tanggalBooking);
        ps.setInt(2, lapanganId);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Time startTime = rs.getTime("StartTime");
            Time endTime = rs.getTime("EndTime");

            BookingBean bean = new BookingBean(lapanganId, tanggalBooking);
            bean.setStartTime(startTime);
            bean.setEndTime(endTime);
            list.add(bean);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error" + e);
        
        System.out.println("Error: " + e);
    }
    return list;
}
    
    public void InsertBooking(BookingBean bookingBean){
        try{
           String query = "insert into booking (user_id,lapangan_id,tanggal_booking,StartTime,EndTime,total_harga,namaTeam) values (?,?,?,?,?,?,?)";
           PreparedStatement ps = DB.con.prepareStatement(query); 
           
           ps.setInt(1, bookingBean.getUserId());
           ps.setInt(2, bookingBean.getLapanganId());
           ps.setDate(3, bookingBean.getTanggalBooking());
           ps.setTime(4, bookingBean.getStartTime());
           ps.setTime(5, bookingBean.getEndTime());
           ps.setDouble(6, bookingBean.getTotalHarga());
           ps.setString(7, bookingBean.getNamaTeam());
           
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Berhasil melakukan booking");
                   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error : " + e);
        }
    }
}
