/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookingFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import java.sql.Time;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import userFrame.ListBooking;

/**
 *
 * @author ASUS
 */

public class BookingRequest extends javax.swing.JFrame {
    private static int userId;
    private Time startTime;
    private Time endTime;
    private String namaTeam;
    private Date tanggal; 
    private int lapanganId;
    
    private List<BookingBean> bookings;
    /**
     * Creates new form pageBooking
     */
    public BookingRequest(List<BookingBean> bookings,Date tanggal,int lapanganId,int userId) {
        initComponents();
        
        this.bookings = bookings;
        this.tanggal = tanggal;
        this.lapanganId = lapanganId;
        this.userId = userId;
        setupToggleButtons();
      
        ButtonGroup buttonGroup = new ButtonGroup();

        
        buttonGroup.add(togel1);
        buttonGroup.add(togel2);
        buttonGroup.add(togel3);
        buttonGroup.add(togel4);
        buttonGroup.add(togel5);
        buttonGroup.add(togel6);
        buttonGroup.add(togel7);
        buttonGroup.add(togel8);
        buttonGroup.add(togel9);
        buttonGroup.add(togel10);
        buttonGroup.add(togel11);
        buttonGroup.add(togel12);
        buttonGroup.add(togel13);
        buttonGroup.add(togel14);
        
    
        togel1.addActionListener(createActionListenerForToggleButton(togel1, "08:00:00", "09:00:00"));
        togel2.addActionListener(createActionListenerForToggleButton(togel2, "09:00:00", "10:00:00"));
        togel3.addActionListener(createActionListenerForToggleButton(togel3, "10:00:00", "11:00:00"));
        togel4.addActionListener(createActionListenerForToggleButton(togel3, "11:00:00", "12:00:00"));
        togel5.addActionListener(createActionListenerForToggleButton(togel3, "12:00:00", "13:00:00"));
        togel6.addActionListener(createActionListenerForToggleButton(togel3, "13:00:00", "14:00:00"));
        togel7.addActionListener(createActionListenerForToggleButton(togel3, "14:00:00", "15:00:00"));
        togel8.addActionListener(createActionListenerForToggleButton(togel3, "15:00:00", "16:00:00"));
        togel9.addActionListener(createActionListenerForToggleButton(togel3, "16:00:00", "17:00:00"));
        togel10.addActionListener(createActionListenerForToggleButton(togel3, "17:00:00", "18:00:00"));
        togel11.addActionListener(createActionListenerForToggleButton(togel3, "18:00:00", "19:00:00"));
        togel12.addActionListener(createActionListenerForToggleButton(togel3, "19:00:00", "20:00:00"));
        togel13.addActionListener(createActionListenerForToggleButton(togel3, "20:00:00", "21:00:00"));
        togel14.addActionListener(createActionListenerForToggleButton(togel3, "21:00:00", "22:00:00"));
    
    }
    
    private ActionListener createActionListenerForToggleButton(JToggleButton toggleButton, String startTimeStr, String endTimeStr) {
    return new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            startTime = Time.valueOf(startTimeStr);
            endTime = Time.valueOf(endTimeStr);
        }
    };
}
    
    private void setupToggleButtons() {
    // Buat ButtonGroup
    ButtonGroup buttonGroup = new ButtonGroup();

    // Tambahkan setiap JToggleButton ke dalam ButtonGroup
    buttonGroup.add(togel1);
    buttonGroup.add(togel2);
    // ... tambahkan yang lainnya

    // Lakukan iterasi terhadap bookings dan atur warna/status toggle button
    for (BookingBean booking : bookings) {
        Time startTime = booking.getStartTime();
        Time endTime = booking.getEndTime();

        int startHour = startTime.getHours();
        int endHour = endTime.getHours();

        for (int i = startHour; i < endHour; i++) {
            JToggleButton toggleButton = getToggleButtonByIndex(i);
            if (toggleButton != null) {
                toggleButton.setBackground(Color.RED);
                toggleButton.setEnabled(false);
            }
        }
    }
}
private JToggleButton getToggleButtonByIndex(int index) {
    switch (index) {
        case 8:
            return togel1;
        case 9:
            return togel2;
        case 10:
            return togel3;
        case 11:
            return togel4;
        case 12:
            return togel5;
        case 13:
            return togel6;
        case 14:
            return togel7;
        case 15:
            return togel8;
        case 16:
            return togel9;
        case 17:
            return togel10;
        case 18:
            return togel11;
        case 19:
            return togel12;
        case 20:
            return togel13;
        case 21:
            return togel14;
          
        
        default:
            return null;
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jDesktopPane5 = new javax.swing.JDesktopPane();
        jToggleButton3 = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jDesktopPane7 = new javax.swing.JDesktopPane();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jDesktopPane8 = new javax.swing.JDesktopPane();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jToggleButton20 = new javax.swing.JToggleButton();
        jToggleButton25 = new javax.swing.JToggleButton();
        jToggleButton26 = new javax.swing.JToggleButton();
        jToggleButton27 = new javax.swing.JToggleButton();
        jToggleButton28 = new javax.swing.JToggleButton();
        jToggleButton29 = new javax.swing.JToggleButton();
        jToggleButton30 = new javax.swing.JToggleButton();
        jToggleButton31 = new javax.swing.JToggleButton();
        jToggleButton32 = new javax.swing.JToggleButton();
        jToggleButton33 = new javax.swing.JToggleButton();
        jToggleButton34 = new javax.swing.JToggleButton();
        jDesktopPane9 = new javax.swing.JDesktopPane();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton17 = new javax.swing.JToggleButton();
        jToggleButton18 = new javax.swing.JToggleButton();
        jToggleButton19 = new javax.swing.JToggleButton();
        jToggleButton21 = new javax.swing.JToggleButton();
        jToggleButton22 = new javax.swing.JToggleButton();
        jToggleButton23 = new javax.swing.JToggleButton();
        jToggleButton24 = new javax.swing.JToggleButton();
        jDesktopPane6 = new javax.swing.JDesktopPane();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jDesktopPane10 = new javax.swing.JDesktopPane();
        jToggleButton35 = new javax.swing.JToggleButton();
        jToggleButton36 = new javax.swing.JToggleButton();
        jToggleButton37 = new javax.swing.JToggleButton();
        jToggleButton38 = new javax.swing.JToggleButton();
        jToggleButton39 = new javax.swing.JToggleButton();
        jToggleButton40 = new javax.swing.JToggleButton();
        jToggleButton41 = new javax.swing.JToggleButton();
        jToggleButton42 = new javax.swing.JToggleButton();
        jToggleButton43 = new javax.swing.JToggleButton();
        jToggleButton44 = new javax.swing.JToggleButton();
        jToggleButton45 = new javax.swing.JToggleButton();
        jToggleButton46 = new javax.swing.JToggleButton();
        jToggleButton47 = new javax.swing.JToggleButton();
        jToggleButton48 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        togel1 = new javax.swing.JToggleButton();
        togel8 = new javax.swing.JToggleButton();
        togel2 = new javax.swing.JToggleButton();
        togel3 = new javax.swing.JToggleButton();
        togel4 = new javax.swing.JToggleButton();
        togel5 = new javax.swing.JToggleButton();
        togel6 = new javax.swing.JToggleButton();
        togel7 = new javax.swing.JToggleButton();
        togel10 = new javax.swing.JToggleButton();
        togel9 = new javax.swing.JToggleButton();
        togel12 = new javax.swing.JToggleButton();
        togel11 = new javax.swing.JToggleButton();
        togel13 = new javax.swing.JToggleButton();
        togel14 = new javax.swing.JToggleButton();
        textFieldNamaTeam = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        ButtonBooking = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButtonHome = new javax.swing.JButton();

        jTextField1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField1.setSelectionColor(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Nama Team:");

        jDesktopPane4.setBackground(new java.awt.Color(255, 204, 102));
        jDesktopPane4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jToggleButton1.setText("Lapangan 1");

        jLabel4.setText("Lapangan 1");

        jLabel5.setText("Rumput Sintetis");

        jLabel6.setText("Rp.150.000 / jam");

        jDesktopPane4.setLayer(jToggleButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane4Layout = new javax.swing.GroupLayout(jDesktopPane4);
        jDesktopPane4.setLayout(jDesktopPane4Layout);
        jDesktopPane4Layout.setHorizontalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane4Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1)
                    .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)))
                .addGap(91, 91, 91))
        );
        jDesktopPane4Layout.setVerticalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane4Layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addContainerGap())
        );

        jDesktopPane2.setBackground(new java.awt.Color(0, 91, 65));
        jDesktopPane2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 3, 0, new java.awt.Color(51, 51, 51)));
        jDesktopPane2.setForeground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("BOOKING");
        jLabel1.setMaximumSize(new java.awt.Dimension(40, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HOME");
        jLabel2.setMaximumSize(new java.awt.Dimension(40, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 20));

        jTextField2.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextField2.setSelectionColor(new java.awt.Color(255, 255, 255));

        jLabel10.setText("Nama Team:");

        jDesktopPane5.setBackground(new java.awt.Color(255, 204, 102));
        jDesktopPane5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jToggleButton3.setText("Lapangan 1");

        jLabel11.setText("Lapangan 1");

        jLabel12.setText("Rumput Sintetis");

        jLabel13.setText("Rp.150.000 / jam");

        jDesktopPane5.setLayer(jToggleButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane5.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane5.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane5.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane5Layout = new javax.swing.GroupLayout(jDesktopPane5);
        jDesktopPane5.setLayout(jDesktopPane5Layout);
        jDesktopPane5Layout.setHorizontalGroup(
            jDesktopPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane5Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane5Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jDesktopPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton3)
                    .addGroup(jDesktopPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel13)
                        .addComponent(jLabel12)))
                .addGap(91, 91, 91))
        );
        jDesktopPane5Layout.setVerticalGroup(
            jDesktopPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane5Layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(4, 4, 4)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton3)
                .addContainerGap())
        );

        jDesktopPane7.setBackground(new java.awt.Color(0, 91, 65));
        jDesktopPane7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 3, 0, new java.awt.Color(51, 51, 51)));
        jDesktopPane7.setForeground(new java.awt.Color(153, 255, 153));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("BOOKING");
        jLabel14.setMaximumSize(new java.awt.Dimension(40, 20));
        jLabel14.setPreferredSize(new java.awt.Dimension(50, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("HOME");
        jLabel15.setMaximumSize(new java.awt.Dimension(40, 20));
        jLabel15.setPreferredSize(new java.awt.Dimension(50, 20));

        jDesktopPane7.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane7.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane7Layout = new javax.swing.GroupLayout(jDesktopPane7);
        jDesktopPane7.setLayout(jDesktopPane7Layout);
        jDesktopPane7Layout.setHorizontalGroup(
            jDesktopPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane7Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1186, Short.MAX_VALUE))
            .addGroup(jDesktopPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane7Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1275, Short.MAX_VALUE)))
        );
        jDesktopPane7Layout.setVerticalGroup(
            jDesktopPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jDesktopPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jDesktopPane8.setBackground(new java.awt.Color(51, 204, 255));
        jDesktopPane8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 51)));

        jToggleButton13.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton13.setText("14:00 - 15:00");
        jToggleButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton13ActionPerformed(evt);
            }
        });

        jToggleButton14.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton14.setText("13:00 - 14:00");
        jToggleButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton14ActionPerformed(evt);
            }
        });

        jToggleButton16.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton16.setText("12:00 - 13:00");
        jToggleButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton16ActionPerformed(evt);
            }
        });

        jToggleButton20.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton20.setText("11:00 - 12:00");
        jToggleButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton20ActionPerformed(evt);
            }
        });

        jToggleButton25.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton25.setText("10:00 - 11:00");
        jToggleButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton25ActionPerformed(evt);
            }
        });

        jToggleButton26.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton26.setText("09:00 - 10:00");
        jToggleButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton26ActionPerformed(evt);
            }
        });

        jToggleButton27.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton27.setText("21:00 - 22:00");
        jToggleButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton27ActionPerformed(evt);
            }
        });

        jToggleButton28.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton28.setText("18:00 - 19:00");

        jToggleButton29.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton29.setText("19:00 - 20:00");

        jToggleButton30.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton30.setText("20:00 - 21:00");

        jToggleButton31.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton31.setText("17:00 - 18:00");

        jToggleButton32.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton32.setText("16:00 - 17:00");

        jToggleButton33.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton33.setText("15:00 - 16:00");

        jToggleButton34.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton34.setText("08:00 - 09:00");
        jToggleButton34.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jToggleButton34.setName(""); // NOI18N
        jToggleButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton34ActionPerformed(evt);
            }
        });

        jDesktopPane8.setLayer(jToggleButton13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane8.setLayer(jToggleButton14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane8.setLayer(jToggleButton16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane8.setLayer(jToggleButton20, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane8.setLayer(jToggleButton25, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane8.setLayer(jToggleButton26, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane8.setLayer(jToggleButton27, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane8.setLayer(jToggleButton28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane8.setLayer(jToggleButton29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane8.setLayer(jToggleButton30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane8.setLayer(jToggleButton31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane8.setLayer(jToggleButton32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane8.setLayer(jToggleButton33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane8.setLayer(jToggleButton34, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane8Layout = new javax.swing.GroupLayout(jDesktopPane8);
        jDesktopPane8.setLayout(jDesktopPane8Layout);
        jDesktopPane8Layout.setHorizontalGroup(
            jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton33, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jToggleButton34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton32, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jToggleButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton25, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jToggleButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton28, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jToggleButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane8Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jToggleButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton29, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton30, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jToggleButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton27, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jToggleButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDesktopPane8Layout.setVerticalGroup(
            jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton13)
                    .addComponent(jToggleButton14)
                    .addComponent(jToggleButton16)
                    .addComponent(jToggleButton20)
                    .addComponent(jToggleButton25)
                    .addComponent(jToggleButton26)
                    .addComponent(jToggleButton34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton27)
                    .addComponent(jToggleButton28)
                    .addComponent(jToggleButton29)
                    .addComponent(jToggleButton30)
                    .addComponent(jToggleButton31)
                    .addComponent(jToggleButton32)
                    .addComponent(jToggleButton33))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDesktopPane9.setBackground(new java.awt.Color(255, 204, 102));
        jDesktopPane9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jToggleButton4.setText("Lapangan 1");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jLabel16.setText("Lapangan 2");

        jLabel17.setText("Karpet");

        jLabel18.setText("Rp.175.000 / jam");

        jDesktopPane9.setLayer(jToggleButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane9Layout = new javax.swing.GroupLayout(jDesktopPane9);
        jDesktopPane9.setLayout(jDesktopPane9Layout);
        jDesktopPane9Layout.setHorizontalGroup(
            jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane9Layout.createSequentialGroup()
                .addGroup(jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane9Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel16))
                    .addGroup(jDesktopPane9Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel17))
                    .addGroup(jDesktopPane9Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jToggleButton4))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jDesktopPane9Layout.setVerticalGroup(
            jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton4)
                .addContainerGap())
        );

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("HOME");
        jLabel19.setMaximumSize(new java.awt.Dimension(40, 20));
        jLabel19.setPreferredSize(new java.awt.Dimension(50, 20));

        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jDesktopPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jDesktopPane7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jDesktopPane8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jDesktopPane9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1186, Short.MAX_VALUE))
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1275, Short.MAX_VALUE)))
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDesktopPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDesktopPane2Layout.createSequentialGroup()
                            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addGap(338, 338, 338))
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addGap(111, 111, 111)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addGap(67, 67, 67)
                                    .addComponent(jDesktopPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(84, 84, 84)
                                    .addComponent(jDesktopPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jDesktopPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap()))
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jDesktopPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jDesktopPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jDesktopPane5)
                        .addComponent(jDesktopPane9))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addContainerGap()))
            .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jDesktopPane3.setBackground(new java.awt.Color(51, 204, 255));
        jDesktopPane3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 51)));

        jToggleButton7.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton7.setText("14:00 - 15:00");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton8.setText("13:00 - 14:00");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jToggleButton9.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton9.setText("12:00 - 13:00");
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jToggleButton10.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton10.setText("11:00 - 12:00");
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        jToggleButton11.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton11.setText("10:00 - 11:00");
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton11ActionPerformed(evt);
            }
        });

        jToggleButton12.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton12.setText("09:00 - 10:00");
        jToggleButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton12ActionPerformed(evt);
            }
        });

        jToggleButton15.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton15.setText("21:00 - 22:00");
        jToggleButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton15ActionPerformed(evt);
            }
        });

        jToggleButton17.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton17.setText("18:00 - 19:00");

        jToggleButton18.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton18.setText("19:00 - 20:00");

        jToggleButton19.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton19.setText("20:00 - 21:00");

        jToggleButton21.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton21.setText("17:00 - 18:00");

        jToggleButton22.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton22.setText("16:00 - 17:00");

        jToggleButton23.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton23.setText("15:00 - 16:00");

        jToggleButton24.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton24.setText("08:00 - 09:00");
        jToggleButton24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jToggleButton24.setName(""); // NOI18N
        jToggleButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton24ActionPerformed(evt);
            }
        });

        jDesktopPane3.setLayer(jToggleButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jToggleButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jToggleButton9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jToggleButton10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jToggleButton11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jToggleButton12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jToggleButton15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jToggleButton17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jToggleButton18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jToggleButton19, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jToggleButton21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jToggleButton22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jToggleButton23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane3.setLayer(jToggleButton24, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton23, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jToggleButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton22, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jToggleButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jToggleButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton17, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jToggleButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jToggleButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton18, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton19, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton15, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton7)
                    .addComponent(jToggleButton8)
                    .addComponent(jToggleButton9)
                    .addComponent(jToggleButton10)
                    .addComponent(jToggleButton11)
                    .addComponent(jToggleButton12)
                    .addComponent(jToggleButton24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton15)
                    .addComponent(jToggleButton17)
                    .addComponent(jToggleButton18)
                    .addComponent(jToggleButton19)
                    .addComponent(jToggleButton21)
                    .addComponent(jToggleButton22)
                    .addComponent(jToggleButton23))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jDesktopPane6.setBackground(new java.awt.Color(255, 204, 102));
        jDesktopPane6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jToggleButton2.setText("Lapangan 1");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Lapangan 2");

        jLabel8.setText("Karpet");

        jLabel9.setText("Rp.175.000 / jam");

        jDesktopPane6.setLayer(jToggleButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane6.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane6.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane6.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane6Layout = new javax.swing.GroupLayout(jDesktopPane6);
        jDesktopPane6.setLayout(jDesktopPane6Layout);
        jDesktopPane6Layout.setHorizontalGroup(
            jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane6Layout.createSequentialGroup()
                .addGroup(jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane6Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel7))
                    .addGroup(jDesktopPane6Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel8))
                    .addGroup(jDesktopPane6Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jToggleButton2))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jDesktopPane6Layout.setVerticalGroup(
            jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton2)
                .addContainerGap())
        );

        jDesktopPane10.setBackground(new java.awt.Color(51, 204, 255));
        jDesktopPane10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 51)));

        jToggleButton35.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton35.setText("14:00 - 15:00");
        jToggleButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton35ActionPerformed(evt);
            }
        });

        jToggleButton36.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton36.setText("13:00 - 14:00");
        jToggleButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton36ActionPerformed(evt);
            }
        });

        jToggleButton37.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton37.setText("12:00 - 13:00");
        jToggleButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton37ActionPerformed(evt);
            }
        });

        jToggleButton38.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton38.setText("11:00 - 12:00");
        jToggleButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton38ActionPerformed(evt);
            }
        });

        jToggleButton39.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton39.setText("10:00 - 11:00");
        jToggleButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton39ActionPerformed(evt);
            }
        });

        jToggleButton40.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton40.setText("09:00 - 10:00");
        jToggleButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton40ActionPerformed(evt);
            }
        });

        jToggleButton41.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton41.setText("21:00 - 22:00");
        jToggleButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton41ActionPerformed(evt);
            }
        });

        jToggleButton42.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton42.setText("18:00 - 19:00");

        jToggleButton43.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton43.setText("19:00 - 20:00");

        jToggleButton44.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton44.setText("20:00 - 21:00");

        jToggleButton45.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton45.setText("17:00 - 18:00");

        jToggleButton46.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton46.setText("16:00 - 17:00");

        jToggleButton47.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton47.setText("15:00 - 16:00");

        jToggleButton48.setBackground(new java.awt.Color(255, 204, 102));
        jToggleButton48.setText("08:00 - 09:00");
        jToggleButton48.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jToggleButton48.setName(""); // NOI18N
        jToggleButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton48ActionPerformed(evt);
            }
        });

        jDesktopPane10.setLayer(jToggleButton35, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane10.setLayer(jToggleButton36, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane10.setLayer(jToggleButton37, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane10.setLayer(jToggleButton38, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane10.setLayer(jToggleButton39, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane10.setLayer(jToggleButton40, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane10.setLayer(jToggleButton41, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane10.setLayer(jToggleButton42, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane10.setLayer(jToggleButton43, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane10.setLayer(jToggleButton44, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane10.setLayer(jToggleButton45, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane10.setLayer(jToggleButton46, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane10.setLayer(jToggleButton47, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane10.setLayer(jToggleButton48, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane10Layout = new javax.swing.GroupLayout(jDesktopPane10);
        jDesktopPane10.setLayout(jDesktopPane10Layout);
        jDesktopPane10Layout.setHorizontalGroup(
            jDesktopPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton47, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jToggleButton48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton46, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jToggleButton40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton39, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jToggleButton45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton42, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jToggleButton38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jDesktopPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane10Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jToggleButton37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton43, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton44, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jToggleButton36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton41, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(jToggleButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDesktopPane10Layout.setVerticalGroup(
            jDesktopPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton35)
                    .addComponent(jToggleButton36)
                    .addComponent(jToggleButton37)
                    .addComponent(jToggleButton38)
                    .addComponent(jToggleButton39)
                    .addComponent(jToggleButton40)
                    .addComponent(jToggleButton48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton41)
                    .addComponent(jToggleButton42)
                    .addComponent(jToggleButton43)
                    .addComponent(jToggleButton44)
                    .addComponent(jToggleButton45)
                    .addComponent(jToggleButton46)
                    .addComponent(jToggleButton47))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(71, 109, 124));
        jPanel1.setPreferredSize(new java.awt.Dimension(975, 260));

        jPanel3.setBackground(new java.awt.Color(37, 75, 98));
        jPanel3.setPreferredSize(new java.awt.Dimension(700, 85));

        togel1.setBackground(new java.awt.Color(35, 45, 63));
        togel1.setForeground(new java.awt.Color(255, 255, 255));
        togel1.setText("08:00 - 09:00");
        togel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        togel1.setName(""); // NOI18N
        togel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togel1ActionPerformed(evt);
            }
        });

        togel8.setBackground(new java.awt.Color(35, 45, 63));
        togel8.setForeground(new java.awt.Color(255, 255, 255));
        togel8.setText("15:00 - 16:00");
        togel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        togel8.setName(""); // NOI18N
        togel8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togel8ActionPerformed(evt);
            }
        });

        togel2.setBackground(new java.awt.Color(35, 45, 63));
        togel2.setForeground(new java.awt.Color(255, 255, 255));
        togel2.setText("09:00 - 10:00");
        togel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        togel2.setName(""); // NOI18N
        togel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togel2ActionPerformed(evt);
            }
        });

        togel3.setBackground(new java.awt.Color(35, 45, 63));
        togel3.setForeground(new java.awt.Color(255, 255, 255));
        togel3.setText("10:00 - 11:00");
        togel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        togel3.setName(""); // NOI18N
        togel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togel3ActionPerformed(evt);
            }
        });

        togel4.setBackground(new java.awt.Color(35, 45, 63));
        togel4.setForeground(new java.awt.Color(255, 255, 255));
        togel4.setText("11:00 - 12:00");
        togel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        togel4.setName(""); // NOI18N
        togel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togel4ActionPerformed(evt);
            }
        });

        togel5.setBackground(new java.awt.Color(35, 45, 63));
        togel5.setForeground(new java.awt.Color(255, 255, 255));
        togel5.setText("12:00 - 13:00");
        togel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        togel5.setName(""); // NOI18N
        togel5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togel5ActionPerformed(evt);
            }
        });

        togel6.setBackground(new java.awt.Color(35, 45, 63));
        togel6.setForeground(new java.awt.Color(255, 255, 255));
        togel6.setText("13:00 - 14:00");
        togel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        togel6.setName(""); // NOI18N
        togel6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togel6ActionPerformed(evt);
            }
        });

        togel7.setBackground(new java.awt.Color(35, 45, 63));
        togel7.setForeground(new java.awt.Color(255, 255, 255));
        togel7.setText("14:00 - 15:00");
        togel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        togel7.setName(""); // NOI18N
        togel7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togel7ActionPerformed(evt);
            }
        });

        togel10.setBackground(new java.awt.Color(35, 45, 63));
        togel10.setForeground(new java.awt.Color(255, 255, 255));
        togel10.setText("17:00 - 18:00");
        togel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        togel10.setName(""); // NOI18N
        togel10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togel10ActionPerformed(evt);
            }
        });

        togel9.setBackground(new java.awt.Color(35, 45, 63));
        togel9.setForeground(new java.awt.Color(255, 255, 255));
        togel9.setText("16:00 - 17:00");
        togel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        togel9.setName(""); // NOI18N
        togel9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togel9ActionPerformed(evt);
            }
        });

        togel12.setBackground(new java.awt.Color(35, 45, 63));
        togel12.setForeground(new java.awt.Color(255, 255, 255));
        togel12.setText("19:00 - 20:00");
        togel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        togel12.setName(""); // NOI18N
        togel12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togel12ActionPerformed(evt);
            }
        });

        togel11.setBackground(new java.awt.Color(35, 45, 63));
        togel11.setForeground(new java.awt.Color(255, 255, 255));
        togel11.setText("18:00 - 19:00");
        togel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        togel11.setName(""); // NOI18N
        togel11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togel11ActionPerformed(evt);
            }
        });

        togel13.setBackground(new java.awt.Color(35, 45, 63));
        togel13.setForeground(new java.awt.Color(255, 255, 255));
        togel13.setText("20:00 - 21:00");
        togel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        togel13.setName(""); // NOI18N
        togel13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togel13ActionPerformed(evt);
            }
        });

        togel14.setBackground(new java.awt.Color(35, 45, 63));
        togel14.setForeground(new java.awt.Color(255, 255, 255));
        togel14.setText("21:00 - 22:00");
        togel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        togel14.setName(""); // NOI18N
        togel14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togel14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(togel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(togel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(togel2)
                    .addComponent(togel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(togel10)
                    .addComponent(togel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(togel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(togel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(togel4)
                        .addGap(19, 19, 19)
                        .addComponent(togel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(togel6)
                    .addComponent(togel13, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(togel7)
                    .addComponent(togel14))
                .addGap(182, 182, 182))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(togel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(togel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(togel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(togel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(togel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(togel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(togel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(togel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(togel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(togel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(togel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(togel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(togel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(togel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        textFieldNamaTeam.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        textFieldNamaTeam.setSelectionColor(new java.awt.Color(255, 255, 255));

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Nama Team :");

        ButtonBooking.setBackground(new java.awt.Color(29, 62, 83));
        ButtonBooking.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtonBooking.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBooking.setText("BOOKING");
        ButtonBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBookingActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(37, 75, 98));

        jButtonHome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonHome.setForeground(new java.awt.Color(29, 62, 83));
        jButtonHome.setText("Back");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonHome)
                .addContainerGap(726, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jButtonHome)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldNamaTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(ButtonBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNamaTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addComponent(ButtonBooking)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton11ActionPerformed

    private void jToggleButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton12ActionPerformed

    private void jToggleButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton15ActionPerformed

    private void jToggleButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton24ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button2ActionPerformed

    private void jToggleButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton13ActionPerformed

    private void jToggleButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton14ActionPerformed

    private void jToggleButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton16ActionPerformed

    private void jToggleButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton20ActionPerformed

    private void jToggleButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton25ActionPerformed

    private void jToggleButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton26ActionPerformed

    private void jToggleButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton27ActionPerformed

    private void jToggleButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton34ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton35ActionPerformed

    private void jToggleButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton36ActionPerformed

    private void jToggleButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton37ActionPerformed

    private void jToggleButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton38ActionPerformed

    private void jToggleButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton39ActionPerformed

    private void jToggleButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton40ActionPerformed

    private void jToggleButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton41ActionPerformed

    private void jToggleButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton48ActionPerformed

    private void togel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togel1ActionPerformed
        
    }//GEN-LAST:event_togel1ActionPerformed

    private void togel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_togel2ActionPerformed

    private void togel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togel3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_togel3ActionPerformed

    private void togel4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togel4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_togel4ActionPerformed

    private void togel5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togel5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_togel5ActionPerformed

    private void togel6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togel6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_togel6ActionPerformed

    private void togel7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togel7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_togel7ActionPerformed

    private void togel8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togel8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_togel8ActionPerformed

    private void togel10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togel10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_togel10ActionPerformed

    private void togel9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togel9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_togel9ActionPerformed

    private void togel12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togel12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_togel12ActionPerformed

    private void togel11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togel11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_togel11ActionPerformed

    private void togel13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togel13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_togel13ActionPerformed

    private void togel14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togel14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_togel14ActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
       this.hide();
       ListBooking userFrame = new ListBooking(userId);
       userFrame.show();
       
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void ButtonBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBookingActionPerformed
       String namaTeam = textFieldNamaTeam.getText();
       
       if (namaTeam == null || namaTeam.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Nama tim tidak boleh kosong.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        return; 
    }
       
       double totalHarga = 0;
       
       if (lapanganId == 1 ){
           totalHarga = 150_000;
       }else if(lapanganId == 2){
           totalHarga = 175_000;
       }
       
       if (startTime == null || endTime == null) {
        JOptionPane.showMessageDialog(this, "Pilih jam booking.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
      BookingBean bookingBean = new BookingBean(userId, lapanganId, tanggal, startTime, endTime, totalHarga, namaTeam);
      bookingFrameBal bfb = new bookingFrameBal();
      bfb.InsertBooking(bookingBean);
      
      this.hide();
       ListBooking userFrame = new ListBooking(userId);
       userFrame.show();
    }//GEN-LAST:event_ButtonBookingActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            int lapangan = 1;
            java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());

            
            bookingFrameBal bfbObj = new bookingFrameBal();
            List<BookingBean> bookings = bfbObj.isAvailable(sqlDate, lapangan);

            
            new BookingRequest(bookings,sqlDate,lapangan,userId).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBooking;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JDesktopPane jDesktopPane10;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JDesktopPane jDesktopPane5;
    private javax.swing.JDesktopPane jDesktopPane6;
    private javax.swing.JDesktopPane jDesktopPane7;
    private javax.swing.JDesktopPane jDesktopPane8;
    private javax.swing.JDesktopPane jDesktopPane9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton17;
    private javax.swing.JToggleButton jToggleButton18;
    private javax.swing.JToggleButton jToggleButton19;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton20;
    private javax.swing.JToggleButton jToggleButton21;
    private javax.swing.JToggleButton jToggleButton22;
    private javax.swing.JToggleButton jToggleButton23;
    private javax.swing.JToggleButton jToggleButton24;
    private javax.swing.JToggleButton jToggleButton25;
    private javax.swing.JToggleButton jToggleButton26;
    private javax.swing.JToggleButton jToggleButton27;
    private javax.swing.JToggleButton jToggleButton28;
    private javax.swing.JToggleButton jToggleButton29;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton30;
    private javax.swing.JToggleButton jToggleButton31;
    private javax.swing.JToggleButton jToggleButton32;
    private javax.swing.JToggleButton jToggleButton33;
    private javax.swing.JToggleButton jToggleButton34;
    private javax.swing.JToggleButton jToggleButton35;
    private javax.swing.JToggleButton jToggleButton36;
    private javax.swing.JToggleButton jToggleButton37;
    private javax.swing.JToggleButton jToggleButton38;
    private javax.swing.JToggleButton jToggleButton39;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton40;
    private javax.swing.JToggleButton jToggleButton41;
    private javax.swing.JToggleButton jToggleButton42;
    private javax.swing.JToggleButton jToggleButton43;
    private javax.swing.JToggleButton jToggleButton44;
    private javax.swing.JToggleButton jToggleButton45;
    private javax.swing.JToggleButton jToggleButton46;
    private javax.swing.JToggleButton jToggleButton47;
    private javax.swing.JToggleButton jToggleButton48;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    private javax.swing.JTextField textFieldNamaTeam;
    private javax.swing.JToggleButton togel1;
    private javax.swing.JToggleButton togel10;
    private javax.swing.JToggleButton togel11;
    private javax.swing.JToggleButton togel12;
    private javax.swing.JToggleButton togel13;
    private javax.swing.JToggleButton togel14;
    private javax.swing.JToggleButton togel2;
    private javax.swing.JToggleButton togel3;
    private javax.swing.JToggleButton togel4;
    private javax.swing.JToggleButton togel5;
    private javax.swing.JToggleButton togel6;
    private javax.swing.JToggleButton togel7;
    private javax.swing.JToggleButton togel8;
    private javax.swing.JToggleButton togel9;
    // End of variables declaration//GEN-END:variables
}
