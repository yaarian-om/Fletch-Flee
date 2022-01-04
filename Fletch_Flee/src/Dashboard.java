
import java.awt.Color;
import java.awt.Font;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;


public class Dashboard extends javax.swing.JFrame {

    Utility util = new Utility();
    private int COLOR_R = 39;
    private int COLOR_G = 71;
    private int COLOR_B = 109;
    
    public static String GAP = "                                  ";
    public static String newLine = "\n";
    public static String name;
    public static String date;
    public static String startPos;
    public static String destination;
    public static String train;
    public static String passenger;
    public static String seats;
    public static String time;
    public static String classs;
    public static String price;
        
    private static String PRINT_TIME_DATE;
    private static String PRINT_LINE;
        
    
    
    
    public void initComponents2(){
        setLocationRelativeTo(null); // Set the start position to center
        username_jLabel.setText(util.getUSERNAME());
        dashboard_panel.setVisible(true);
        book_a_Ticket_jPanel.setVisible(false);
    }
    public Dashboard() {
        initComponents();
        initComponents2();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        background_jPanel = new javax.swing.JPanel();
        left_jPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dashBoard_jButton = new javax.swing.JButton();
        profile_jButton = new javax.swing.JButton();
        bookATicket_jButton = new javax.swing.JButton();
        payment_jButton = new javax.swing.JButton();
        username_jLabel = new javax.swing.JLabel();
        book_a_Ticket_2_jPanel = new javax.swing.JPanel();
        book_a_Ticket_jPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        date_jTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        starting_jComboBox = new javax.swing.JComboBox<>();
        destination_jComboBox = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        passenger_jTextField = new javax.swing.JTextField();
        time_jComboBox = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        name_jTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        next_jButton = new javax.swing.JButton();
        dashboard_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name_jLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        date_jLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        startingFrom_jLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        destination_jLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        passengerNum_jLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        time_jLabel = new javax.swing.JLabel();
        classs_jLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        seats_jLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        price_jLabel = new javax.swing.JLabel();
        print_jButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        train_jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background_jPanel.setBackground(new java.awt.Color(51, 51, 51));

        left_jPanel.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/myUser.png"))); // NOI18N

        dashBoard_jButton.setBackground(new java.awt.Color(102, 102, 102));
        dashBoard_jButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        dashBoard_jButton.setForeground(new java.awt.Color(255, 255, 255));
        dashBoard_jButton.setText("Dashboard");
        dashBoard_jButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashBoard_jButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dashBoard_jButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dashBoard_jButtonFocusLost(evt);
            }
        });
        dashBoard_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashBoard_jButtonActionPerformed(evt);
            }
        });

        profile_jButton.setBackground(new java.awt.Color(102, 102, 102));
        profile_jButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        profile_jButton.setForeground(new java.awt.Color(255, 255, 255));
        profile_jButton.setText("Profile");
        profile_jButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile_jButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                profile_jButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                profile_jButtonFocusLost(evt);
            }
        });
        profile_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_jButtonActionPerformed(evt);
            }
        });

        bookATicket_jButton.setBackground(new java.awt.Color(102, 102, 102));
        bookATicket_jButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        bookATicket_jButton.setForeground(new java.awt.Color(255, 255, 255));
        bookATicket_jButton.setText("Book a Ticket");
        bookATicket_jButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookATicket_jButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bookATicket_jButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bookATicket_jButtonFocusLost(evt);
            }
        });
        bookATicket_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookATicket_jButtonActionPerformed(evt);
            }
        });

        payment_jButton.setBackground(new java.awt.Color(102, 102, 102));
        payment_jButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        payment_jButton.setForeground(new java.awt.Color(255, 255, 255));
        payment_jButton.setText("Payment");
        payment_jButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payment_jButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                payment_jButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                payment_jButtonFocusLost(evt);
            }
        });
        payment_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payment_jButtonActionPerformed(evt);
            }
        });

        username_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        username_jLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        username_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username_jLabel.setText("username");
        username_jLabel.setToolTipText("username");

        javax.swing.GroupLayout left_jPanelLayout = new javax.swing.GroupLayout(left_jPanel);
        left_jPanel.setLayout(left_jPanelLayout);
        left_jPanelLayout.setHorizontalGroup(
            left_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashBoard_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(profile_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, left_jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(username_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addComponent(bookATicket_jButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(payment_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(left_jPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        left_jPanelLayout.setVerticalGroup(
            left_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(left_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(dashBoard_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookATicket_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(payment_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(profile_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        book_a_Ticket_2_jPanel.setBackground(new java.awt.Color(51, 51, 51));
        book_a_Ticket_2_jPanel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout book_a_Ticket_2_jPanelLayout = new javax.swing.GroupLayout(book_a_Ticket_2_jPanel);
        book_a_Ticket_2_jPanel.setLayout(book_a_Ticket_2_jPanelLayout);
        book_a_Ticket_2_jPanelLayout.setHorizontalGroup(
            book_a_Ticket_2_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 572, Short.MAX_VALUE)
        );
        book_a_Ticket_2_jPanelLayout.setVerticalGroup(
            book_a_Ticket_2_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );

        book_a_Ticket_jPanel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel13.setBackground(new java.awt.Color(51, 51, 51));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Time");

        jLabel14.setBackground(new java.awt.Color(51, 51, 51));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Departure Date");

        date_jTextField.setBackground(new java.awt.Color(102, 102, 102));
        date_jTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        date_jTextField.setForeground(new java.awt.Color(255, 255, 255));
        date_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date_jTextFieldActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(51, 51, 51));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Starting From");

        jLabel16.setBackground(new java.awt.Color(51, 51, 51));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Destination");

        starting_jComboBox.setBackground(new java.awt.Color(51, 51, 51));
        starting_jComboBox.setForeground(new java.awt.Color(255, 255, 255));
        starting_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Faridpur", "Gazipur", "Gopalganj", "Jamalpur", "Kishoreganj", "Madaripur", "Manikganj", "Munshiganj", "Mymensingh", "Narayanganj", "Narsingdi", "Netrokona", "Rajbari", "Shariatpur", "Sherpur", "Tangail                         ", "Bogra                              ", "Joypurhat                         ", "Naogaon                      ", "Natore                             ", "Nawabganj                          ", "Pabna                              ", "Rajshahi                         ", "Sirajgonj                           ", "Dinajpur                           ", "Gaibandha                          ", "Kurigram                           ", "Lalmonirhat                        ", "Nilphamari                         ", "Panchagarh                         ", "Rangpur                            ", "Thakurgaon                         ", "Barguna                       ", "Barisal                       ", "Bhola                              ", "Jhalokati                          ", "Patuakhali                         ", "Pirojpur                          ", "Bandarban                          ", "Brahmanbaria                       ", "Chandpur                           ", "Chittagong                         ", "Comilla                            ", "Cox''s Bazar                       ", "Feni                               ", "Khagrachari                        ", "Lakshmipur                         ", "Noakhali                           ", "Rangamati                          ", "Habiganj                           ", "Maulvibazar                        ", "Sunamganj                          ", "Sylhet                             ", "Bagerhat                           ", "Chuadanga                          ", "Jessore                            ", "Jhenaidah                          ", "Khulna                             ", "Kushtia                             ", "Magura                             ", "Meherpur                           ", "Narail                             ", "Satkhira " }));

        destination_jComboBox.setBackground(new java.awt.Color(51, 51, 51));
        destination_jComboBox.setForeground(new java.awt.Color(255, 255, 255));
        destination_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Faridpur", "Gazipur", "Gopalganj", "Jamalpur", "Kishoreganj", "Madaripur", "Manikganj", "Munshiganj", "Mymensingh", "Narayanganj", "Narsingdi", "Netrokona", "Rajbari", "Shariatpur", "Sherpur", "Tangail                         ", "Bogra                              ", "Joypurhat                         ", "Naogaon                      ", "Natore                             ", "Nawabganj                          ", "Pabna                              ", "Rajshahi                         ", "Sirajgonj                           ", "Dinajpur                           ", "Gaibandha                          ", "Kurigram                           ", "Lalmonirhat                        ", "Nilphamari                         ", "Panchagarh                         ", "Rangpur                            ", "Thakurgaon                         ", "Barguna                       ", "Barisal                       ", "Bhola                              ", "Jhalokati                          ", "Patuakhali                         ", "Pirojpur                          ", "Bandarban                          ", "Brahmanbaria                       ", "Chandpur                           ", "Chittagong                         ", "Comilla                            ", "Cox''s Bazar                       ", "Feni                               ", "Khagrachari                        ", "Lakshmipur                         ", "Noakhali                           ", "Rangamati                          ", "Habiganj                           ", "Maulvibazar                        ", "Sunamganj                          ", "Sylhet                             ", "Bagerhat                           ", "Chuadanga                          ", "Jessore                            ", "Jhenaidah                          ", "Khulna                             ", "Kushtia                             ", "Magura                             ", "Meherpur                           ", "Narail                             ", "Satkhira " }));

        jLabel17.setBackground(new java.awt.Color(51, 51, 51));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Number of Passengers");

        passenger_jTextField.setBackground(new java.awt.Color(102, 102, 102));
        passenger_jTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passenger_jTextField.setForeground(new java.awt.Color(255, 255, 255));
        passenger_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passenger_jTextFieldActionPerformed(evt);
            }
        });

        time_jComboBox.setBackground(new java.awt.Color(51, 51, 51));
        time_jComboBox.setForeground(new java.awt.Color(255, 255, 255));
        time_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12:00 AM", "1:00 AM", "2:00 AM", "3:00 AM", "4:00 AM", "5:00 AM", "6:00 AM", "7:00 AM", "8:00 AM", "9:00 AM", "10:00 AM", "11:00 AM", "12:00 PM", "1:00 PM", "2:00 PM", "3:00 PM", "4:00 PM", "5:00 PM", "6:00 PM", "7:00 PM", "8:00 PM", "9:00 PM", "10:00 PM", "11:00 PM" }));
        time_jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time_jComboBoxActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(51, 51, 51));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Name");

        name_jTextField.setBackground(new java.awt.Color(102, 102, 102));
        name_jTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name_jTextField.setForeground(new java.awt.Color(255, 255, 255));
        name_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_jTextFieldActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(51, 51, 51));
        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Class");

        jLabel20.setBackground(new java.awt.Color(51, 51, 51));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("AC");

        jRadioButton1.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Economic Class");

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Business Class");

        jRadioButton3.setBackground(new java.awt.Color(51, 51, 51));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("First Class");

        next_jButton.setBackground(new java.awt.Color(102, 102, 255));
        next_jButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        next_jButton.setForeground(new java.awt.Color(255, 255, 255));
        next_jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next_1.png"))); // NOI18N
        next_jButton.setText("Next");
        next_jButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        next_jButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        next_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_jButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout book_a_Ticket_jPanelLayout = new javax.swing.GroupLayout(book_a_Ticket_jPanel);
        book_a_Ticket_jPanel.setLayout(book_a_Ticket_jPanelLayout);
        book_a_Ticket_jPanelLayout.setHorizontalGroup(
            book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, book_a_Ticket_jPanelLayout.createSequentialGroup()
                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(book_a_Ticket_jPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(next_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(book_a_Ticket_jPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, book_a_Ticket_jPanelLayout.createSequentialGroup()
                                    .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(77, 77, 77))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, book_a_Ticket_jPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(58, 58, 58)))
                            .addGroup(book_a_Ticket_jPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(destination_jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(book_a_Ticket_jPanelLayout.createSequentialGroup()
                                    .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(date_jTextField)
                                            .addComponent(starting_jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(name_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(passenger_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGroup(book_a_Ticket_jPanelLayout.createSequentialGroup()
                                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jCheckBox1)
                                    .addComponent(time_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton1))
                                .addGap(96, 96, 96)))))
                .addGap(35, 35, 35))
        );
        book_a_Ticket_jPanelLayout.setVerticalGroup(
            book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, book_a_Ticket_jPanelLayout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, book_a_Ticket_jPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(starting_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destination_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passenger_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(book_a_Ticket_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(book_a_Ticket_jPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, book_a_Ticket_jPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(next_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        dashboard_panel.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/metro.jpg"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name");

        name_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        name_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        name_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        name_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_jLabel.setText("Your name");

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Departure Date");

        date_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        date_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        date_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        date_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date_jLabel.setText("Departure Date");

        jLabel6.setBackground(new java.awt.Color(51, 51, 51));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Starting From");

        startingFrom_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        startingFrom_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        startingFrom_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        startingFrom_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        startingFrom_jLabel.setText("Starting From");

        jLabel7.setBackground(new java.awt.Color(51, 51, 51));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Destination");

        destination_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        destination_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        destination_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        destination_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        destination_jLabel.setText("Your Destination");

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Number of Passengers");

        passengerNum_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        passengerNum_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        passengerNum_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        passengerNum_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passengerNum_jLabel.setText("passenger");

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Time");

        time_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        time_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        time_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        time_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time_jLabel.setText("Your Time");

        classs_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        classs_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        classs_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        classs_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classs_jLabel.setText("Your Class");

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Class");

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Seats");

        seats_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        seats_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        seats_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        seats_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seats_jLabel.setText("Your Seats");

        jLabel11.setBackground(new java.awt.Color(51, 51, 51));
        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Price (BDT)");

        price_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        price_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        price_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        price_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price_jLabel.setText("Your Price");

        print_jButton.setBackground(new java.awt.Color(51, 255, 0));
        print_jButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        print_jButton.setForeground(new java.awt.Color(51, 51, 51));
        print_jButton.setText("Print");
        print_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_jButtonActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(51, 51, 51));
        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Train Name");

        train_jLabel.setBackground(new java.awt.Color(51, 51, 51));
        train_jLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        train_jLabel.setForeground(new java.awt.Color(255, 255, 255));
        train_jLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        train_jLabel.setText("Train");

        javax.swing.GroupLayout dashboard_panelLayout = new javax.swing.GroupLayout(dashboard_panel);
        dashboard_panel.setLayout(dashboard_panelLayout);
        dashboard_panelLayout.setHorizontalGroup(
            dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboard_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(131, 131, 131))
            .addGroup(dashboard_panelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(dashboard_panelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(52, 52, 52)
                                .addComponent(passengerNum_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(dashboard_panelLayout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73)
                                        .addComponent(classs_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(dashboard_panelLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73)
                                        .addComponent(time_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(dashboard_panelLayout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(73, 73, 73)
                                    .addComponent(seats_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(dashboard_panelLayout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(73, 73, 73)
                                    .addComponent(price_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboard_panelLayout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(print_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(108, 108, 108)))
                    .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(dashboard_panelLayout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(73, 73, 73)
                            .addComponent(destination_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(dashboard_panelLayout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(73, 73, 73)
                            .addComponent(startingFrom_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(dashboard_panelLayout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(73, 73, 73)
                            .addComponent(date_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(dashboard_panelLayout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(73, 73, 73)
                            .addComponent(name_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(dashboard_panelLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(73, 73, 73)
                            .addComponent(train_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        dashboard_panelLayout.setVerticalGroup(
            dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboard_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startingFrom_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destination_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(train_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passengerNum_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seats_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classs_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dashboard_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(print_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout background_jPanelLayout = new javax.swing.GroupLayout(background_jPanel);
        background_jPanel.setLayout(background_jPanelLayout);
        background_jPanelLayout.setHorizontalGroup(
            background_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background_jPanelLayout.createSequentialGroup()
                .addComponent(left_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dashboard_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(background_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_jPanelLayout.createSequentialGroup()
                    .addGap(280, 280, 280)
                    .addComponent(book_a_Ticket_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(background_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background_jPanelLayout.createSequentialGroup()
                    .addGap(0, 278, Short.MAX_VALUE)
                    .addComponent(book_a_Ticket_2_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        background_jPanelLayout.setVerticalGroup(
            background_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(left_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dashboard_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(background_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(background_jPanelLayout.createSequentialGroup()
                    .addComponent(book_a_Ticket_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(background_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(book_a_Ticket_2_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profile_jButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_profile_jButtonFocusGained
        // TODO add your handling code here:
        profile_jButton.setBackground(new Color(COLOR_R, COLOR_G, COLOR_B));
    }//GEN-LAST:event_profile_jButtonFocusGained

    private void profile_jButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_profile_jButtonFocusLost
        // TODO add your handling code here:
        profile_jButton.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_profile_jButtonFocusLost

    private void dashBoard_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashBoard_jButtonActionPerformed
        // TODO add your handling code here:
        book_a_Ticket_jPanel.setVisible(false);
        book_a_Ticket_2_jPanel.setVisible(false);
        dashboard_panel.setVisible(true);
    }//GEN-LAST:event_dashBoard_jButtonActionPerformed

    private void dashBoard_jButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dashBoard_jButtonFocusLost
        // TODO add your handling code here:
        dashBoard_jButton.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_dashBoard_jButtonFocusLost

    private void dashBoard_jButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dashBoard_jButtonFocusGained
        // TODO add your handling code here:
        dashBoard_jButton.setBackground(new Color(COLOR_R, COLOR_G, COLOR_B));
        //dashBoard_jButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_dashBoard_jButtonFocusGained

    private void payment_jButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_payment_jButtonFocusLost
        // TODO add your handling code here:
        payment_jButton.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_payment_jButtonFocusLost

    private void payment_jButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_payment_jButtonFocusGained
        // TODO add your handling code here:
        payment_jButton.setBackground(new Color(COLOR_R, COLOR_G, COLOR_B));
    }//GEN-LAST:event_payment_jButtonFocusGained

    private void bookATicket_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookATicket_jButtonActionPerformed
        // TODO add your handling code here:
        dashboard_panel.setVisible(false);
        book_a_Ticket_jPanel.setVisible(true);
        book_a_Ticket_2_jPanel.setVisible(false);
    }//GEN-LAST:event_bookATicket_jButtonActionPerformed

    private void bookATicket_jButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookATicket_jButtonFocusLost
        // TODO add your handling code here:
        bookATicket_jButton.setBackground(new Color(102, 102, 102));
    }//GEN-LAST:event_bookATicket_jButtonFocusLost

    private void bookATicket_jButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bookATicket_jButtonFocusGained
        // TODO add your handling code here:
        bookATicket_jButton.setBackground(new Color(COLOR_R, COLOR_G, COLOR_B));
    }//GEN-LAST:event_bookATicket_jButtonFocusGained

    private void print_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_jButtonActionPerformed
        // TODO add your handling code here:

//***************************************** Fixing Time And Date ************************************
        LocalDate Ldate = LocalDate.now(); // Create a date object
        LocalTime Ltime = LocalTime.now();
        PRINT_TIME_DATE = "Issue Date = "+Ldate.getDayOfMonth()+"-"+Ldate.getMonth()+"-"+Ldate.getYear()+"\n"
                +"Issue Time = "+Ltime.getHour()+":"+Ltime.getMinute();
//******************************** Fixing All the info for ticket *************************************
        
        name = name_jLabel.getText();
        date = date_jLabel.getText();
        startPos = startingFrom_jLabel.getText();
        destination = destination_jLabel.getText();
        train = train_jLabel.getText();
        passenger = passengerNum_jLabel.getText();
        seats = seats_jLabel.getText();
        time = time_jLabel.getText();
        classs = classs_jLabel.getText();
        price = price_jLabel.getText();
        
        PRINT_LINE = newLine+newLine+GAP+name+newLine+GAP+date+newLine+GAP+startPos+newLine+GAP+destination
                +newLine+GAP+train+newLine+GAP+passenger+newLine+GAP+seats+newLine+GAP+time+newLine+GAP+classs
                +newLine+GAP+price+newLine;
//******************************************* PRINTING *****************************************
        Utility util = new Utility();
        util.clearFile("passengerInfo.txt");
        util.infoWriter(PRINT_TIME_DATE, "passengerInfo.txt");
        util.infoWriter(PRINT_LINE, "passengerInfo.txt");
         //System.out.println("Train name = "+util.getRandomTrain());
    }//GEN-LAST:event_print_jButtonActionPerformed

    private void date_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date_jTextFieldActionPerformed

    private void passenger_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passenger_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passenger_jTextFieldActionPerformed

    private void time_jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_time_jComboBoxActionPerformed

    private void name_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_jTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_jTextFieldActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void payment_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payment_jButtonActionPerformed
        // TODO add your handling code here:
        dashboard_panel.setVisible(false);
        book_a_Ticket_jPanel.setVisible(false);
        book_a_Ticket_2_jPanel.setVisible(false);
    }//GEN-LAST:event_payment_jButtonActionPerformed

    private void profile_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_jButtonActionPerformed
        // TODO add your handling code here:
        dashboard_panel.setVisible(false);
        book_a_Ticket_jPanel.setVisible(false);
        book_a_Ticket_2_jPanel.setVisible(false);
    }//GEN-LAST:event_profile_jButtonActionPerformed

    private void next_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_jButtonActionPerformed
        // TODO add your handling code here:
        dashboard_panel.setVisible(false);
        book_a_Ticket_jPanel.setVisible(false);
        book_a_Ticket_jPanel.setVisible(false);
        book_a_Ticket_2_jPanel.setVisible(true);
    }//GEN-LAST:event_next_jButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background_jPanel;
    private javax.swing.JButton bookATicket_jButton;
    private javax.swing.JPanel book_a_Ticket_2_jPanel;
    private javax.swing.JPanel book_a_Ticket_jPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel classs_jLabel;
    private javax.swing.JButton dashBoard_jButton;
    private javax.swing.JPanel dashboard_panel;
    private javax.swing.JLabel date_jLabel;
    private javax.swing.JTextField date_jTextField;
    private javax.swing.JComboBox<String> destination_jComboBox;
    private javax.swing.JLabel destination_jLabel;
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JPanel left_jPanel;
    private javax.swing.JLabel name_jLabel;
    private javax.swing.JTextField name_jTextField;
    private javax.swing.JButton next_jButton;
    private javax.swing.JLabel passengerNum_jLabel;
    private javax.swing.JTextField passenger_jTextField;
    private javax.swing.JButton payment_jButton;
    private javax.swing.JLabel price_jLabel;
    private javax.swing.JButton print_jButton;
    private javax.swing.JButton profile_jButton;
    private javax.swing.JLabel seats_jLabel;
    private javax.swing.JLabel startingFrom_jLabel;
    private javax.swing.JComboBox<String> starting_jComboBox;
    private javax.swing.JComboBox<String> time_jComboBox;
    private javax.swing.JLabel time_jLabel;
    private javax.swing.JLabel train_jLabel;
    private javax.swing.JLabel username_jLabel;
    // End of variables declaration//GEN-END:variables
}
