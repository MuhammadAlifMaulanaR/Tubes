package registrasiFrame;

import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import APP.DB;
import mainFrame.Main;

public class Bal {
    public boolean insertDataSignUp(Bean beanObj) {
        try {
            DB.con.setAutoCommit(false);
            
            if (beanObj.getUsername().isEmpty() || beanObj.getPassword().isEmpty() || beanObj.getNoHp().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Mohon lengkapi semua data yang diperlukan.");
                return false; 
            }
            
            if (!beanObj.getPassword().equals(beanObj.getReTypePassword())) {
                JOptionPane.showMessageDialog(null, "Password dan re-type password berbeda.");
                return false; 
            }
           
            String checkQuery = "SELECT COUNT(*) FROM user WHERE username = ?";
            PreparedStatement checkPs = DB.con.prepareStatement(checkQuery);
            checkPs.setString(1, beanObj.getUsername());
            ResultSet rs = checkPs.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "Username sudah ada, silakan gunakan username lain.");
                return false; 
            }
            
            // Insert new user
            String query = "INSERT INTO user VALUES (null,?,?,?)"; 
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1, beanObj.getUsername());
            ps.setString(2, beanObj.getPassword());
            ps.setString(3, beanObj.getNoHp());
     
            ps.executeUpdate();
            
            DB.con.commit();

            JOptionPane.showMessageDialog(null, "Berhasil melakukan registrasi");
            return true; 
        } catch(Exception e) {
            
            try {
                DB.con.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            JOptionPane.showMessageDialog(null,""+ e);
            return false; 
        } finally {
            try {
                DB.con.setAutoCommit(true);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^(\\+62|62|0)(\\d{3,4}-?){2}\\d{3,4}$";
        return phoneNumber.matches(regex);
    }
}
