package mainFrame;

import APP.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BalMain {
    
    public List<MainBean> loadData(){
        List<MainBean> list = new ArrayList<MainBean>();
        try {
            
            String Sql = "SELECT StartTime, EndTime, tanggal_booking, lapangan_id FROM booking WHERE tanggal_booking = CURRENT_DATE() AND StartTime >= DATE_SUB(CURTIME(), INTERVAL 1 HOUR) ORDER BY StartTime";
            PreparedStatement ps = DB.con.prepareStatement(Sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Time startTime = rs.getTime("StartTime");
                Time endTime = rs.getTime("EndTime");
                Date tanggalBooking = rs.getDate("tanggal_booking");
                int lapangan = rs.getInt("lapangan_id");
                
                MainBean bean = new MainBean(startTime, endTime, tanggalBooking, lapangan);
                list.add(bean);
            }
            
            
        } catch (Exception e) {
           
        }
        return list;
    }
    
    public boolean checkLogin(String username, String password) {
    try {
        String query = "SELECT COUNT(*) FROM user WHERE BINARY username = ? AND BINARY password = ?";
        PreparedStatement ps = DB.con.prepareStatement(query);
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int count = rs.getInt(1);
            if (count > 0) {
                JOptionPane.showMessageDialog(null, "Berhasil Login");
                return true;
            } else {
                // Cek apakah username ada dalam database
                String checkUsernameQuery = "SELECT COUNT(*) FROM user WHERE BINARY username = ?";
                PreparedStatement checkUsernamePs = DB.con.prepareStatement(checkUsernameQuery);
                checkUsernamePs.setString(1, username);
                ResultSet checkUsernameRs = checkUsernamePs.executeQuery();

                if (checkUsernameRs.next()) {
                    int usernameCount = checkUsernameRs.getInt(1);
                    if (usernameCount > 0) {
                        JOptionPane.showMessageDialog(null, "Password salah");
                    } else {
                        JOptionPane.showMessageDialog(null, "Username tidak ditemukan");
                    }
                }
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    return false;
}
    
    public int getUserIdLogin(String username, String password) {
        int userId = 0;
        // note nanti buat agar usernamenya case sensitive dan passwordnya
        try {
            String query = "SELECT id FROM user WHERE username = ? AND password = ?";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);

           
            ResultSet rs = ps.executeQuery();
            

            if (rs.next()) {
                userId = rs.getInt("id");
                return userId;
            } else {
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            return 0;
        }
        return userId;
    }
}
