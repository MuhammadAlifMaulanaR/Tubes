
package userFrame;

import APP.DB;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class UserFrameBal {
    public List<userFrameBean> loadTableUserFrame(int userId){
        List<userFrameBean> list = new ArrayList<userFrameBean>();
        try {
            
            String Sql = "SELECT booking_id,namateam,StartTime, EndTime, tanggal_booking, lapangan_id,total_harga FROM booking WHERE tanggal_booking >= CURRENT_DATE() AND (tanggal_booking > CURRENT_DATE() OR StartTime >= DATE_SUB(CURTIME(), INTERVAL 1 HOUR)) AND user_id = ? ORDER BY tanggal_booking, StartTime";
            PreparedStatement ps = DB.con.prepareStatement(Sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int bookingId = rs.getInt("booking_id");
                String namaTeam =rs.getString("namaTeam");
                Date tanggalBooking = rs.getDate("tanggal_booking");
                Time startTime = rs.getTime("StartTime");
                Time endTime = rs.getTime("EndTime");
                int lapangan = rs.getInt("lapangan_id");
                double totalHarga = rs.getDouble("total_harga");
                
                userFrameBean bean = new userFrameBean(bookingId, lapangan, tanggalBooking, startTime, endTime, totalHarga, namaTeam);
                list.add(bean);
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+ e);
        }
        return list;
    }
    
    public boolean deleteBooking(int bookingId, int userId){
        try{
            String query = "delete from booking where booking_id = ? and user_id = ? and tanggal_booking >= CURRENT_DATE() AND (tanggal_booking > CURRENT_DATE() OR StartTime >= DATE_SUB(CURTIME(), INTERVAL 1 HOUR));";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setInt(1, bookingId);
            ps.setInt(2, userId);
           
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
     
                JOptionPane.showMessageDialog(null, "Berhasil menghapus booking dengan id " + bookingId);
                return true;
            }else {
                JOptionPane.showMessageDialog(null, "Booking dengan id " + bookingId + " tidak ditemukan.");
                return false;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+ e);
            return false;
        }
    }
    public boolean updateBooking(int bookingId, Time startTime,Time endTime,String namaTeam){
        try{
            String query = "UPDATE booking set startTime = ? ,endTime = ? ,namaTeam = ? where booking_id = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setTime(1, startTime);
            ps.setTime(2, endTime);
            ps.setString(3, namaTeam);
            ps.setInt(4, bookingId);

            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
     
                JOptionPane.showMessageDialog(null, "Berhasil mengupdate booking dengan id " + bookingId);
                return true;
            }else {
                JOptionPane.showMessageDialog(null, "Booking dengan id " + bookingId + " tidak ditemukan.");
                return false;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,""+ e);
            return false;
        }
    }
}
