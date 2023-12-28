
package Forms;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Arrays;


public class MainMenuUI extends javax.swing.JFrame {
    
    // responsible for changing the foreground color of jLabel components 
    Color DefaultColor, ClickedColor;
    
    // declaring ArrayList responsible for storing book details and info
    public static ArrayList<String> title = new ArrayList<>();
    public static ArrayList<String> author = new ArrayList<>();
    public static ArrayList<Integer> price = new ArrayList<>();
   
    public static JPanel[] pnlItem;
    public static JSpinner[] itemQty;
    public static int totalPrice = 0;
    
    
    public MainMenuUI() {
        
        initComponents();
        setLocationRelativeTo(null);
        DefaultColor = new Color(153,153,153);
        ClickedColor = new Color(255,102,0);
        
        All.setForeground(DefaultColor);
        Fiction.setForeground(DefaultColor);
        History.setForeground(DefaultColor);
        Romance.setForeground(DefaultColor);
        Science.setForeground(DefaultColor);
  
        
        for (Component c : pnlItemList.getComponents())
            c.setVisible(false);
        
        numOfItems.setText(countItem());
        new fileHandling().read();
        
        this.pnlItem = new JPanel[]{pnlItem1, pnlItem2, pnlItem3, pnlItem4, pnlItem5, pnlItem6, 
            pnlItem7, pnlItem8, pnlItem9, pnlItem10, pnlItem11, pnlItem12};
        this.itemQty = new JSpinner[]{itemQty1, itemQty2, itemQty3, itemQty4, itemQty5, itemQty6, 
            itemQty7, itemQty8, itemQty9, itemQty10, itemQty11, itemQty12};
        
        
    }
    
   
    public static String countItem(){
        int count = 0;
        for (Component c : pnlItemList.getComponents())
            if (c.isVisible())
                count++;
        return String.valueOf(count);
    }
    
     
    public static void showPanel(JPanel pnl, JSpinner spn){
        pnl.setVisible(true);
        spn.setValue(1);
        numOfItems.setText(countItem());
    }
    
    
    public static void hidePanel(JSpinner itemQty, JPanel item){
        if ((int) itemQty.getValue() == 0){
            item.setVisible(false);
            numOfItems.setText(countItem());
        }
    }
    
    public static void showPrev(JPanel pnl, JSpinner spn, int qty){
        pnl.setVisible(true);
        spn.setValue(qty);
        numOfItems.setText(countItem());
    }
    
    
    public void computeTotal(){
        totalPrice = 0;
        int i = 0;
        for (JPanel pnl : pnlItem){
            if(pnl.isVisible())
                totalPrice += (int) itemQty[i].getValue() * price.get(i);
            i++;
        }
            
        if (totalPrice == 0)
            txtTotalPrice.setText("");
        else
            txtTotalPrice.setText(String.format("%d", totalPrice));
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        All = new javax.swing.JLabel();
        Fiction = new javax.swing.JLabel();
        History = new javax.swing.JLabel();
        Romance = new javax.swing.JLabel();
        Science = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ShoppingCart = new javax.swing.JLabel();
        numOfItems = new javax.swing.JTextField();
        Total = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        btnCheckout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlItemList = new javax.swing.JPanel();
        pnlItem1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        closeItem1 = new javax.swing.JLabel();
        itemQty1 = new javax.swing.JSpinner();
        pnlItem2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        closeItem2 = new javax.swing.JLabel();
        itemQty2 = new javax.swing.JSpinner();
        pnlItem4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        closeItem4 = new javax.swing.JLabel();
        itemQty4 = new javax.swing.JSpinner();
        pnlItem3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        closeItem3 = new javax.swing.JLabel();
        itemQty3 = new javax.swing.JSpinner();
        pnlItem5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        closeItem5 = new javax.swing.JLabel();
        itemQty5 = new javax.swing.JSpinner();
        pnlItem6 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        closeItem6 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        itemQty6 = new javax.swing.JSpinner();
        pnlItem7 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        closeItem7 = new javax.swing.JLabel();
        itemQty7 = new javax.swing.JSpinner();
        pnlItem8 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        closeItem8 = new javax.swing.JLabel();
        itemQty8 = new javax.swing.JSpinner();
        pnlItem9 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        closeItem9 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        itemQty9 = new javax.swing.JSpinner();
        pnlItem10 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        closeItem10 = new javax.swing.JLabel();
        itemQty10 = new javax.swing.JSpinner();
        pnlItem11 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        closeItem11 = new javax.swing.JLabel();
        itemQty11 = new javax.swing.JSpinner();
        pnlItem12 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        closeItem12 = new javax.swing.JLabel();
        itemQty12 = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Street - Plain", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("E V E R B O O K S");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 179, 50));
        jLabel2.setText("Hello,");

        txtUsername.setEditable(false);
        txtUsername.setFont(new java.awt.Font("Street - Plain", 0, 14)); // NOI18N
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsername.setText("Username");
        txtUsername.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Categories");

        All.setBackground(new java.awt.Color(255, 255, 255));
        All.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        All.setForeground(new java.awt.Color(255, 255, 255));
        All.setText("All (12)");
        All.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AllMousePressed(evt);
            }
        });

        Fiction.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Fiction.setForeground(new java.awt.Color(255, 255, 255));
        Fiction.setText("Fiction");
        Fiction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FictionMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FictionMousePressed(evt);
            }
        });

        History.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        History.setForeground(new java.awt.Color(255, 255, 255));
        History.setText("History");
        History.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistoryMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HistoryMousePressed(evt);
            }
        });

        Romance.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Romance.setForeground(new java.awt.Color(255, 255, 255));
        Romance.setText("Romance");
        Romance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RomanceMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RomanceMousePressed(evt);
            }
        });

        Science.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Science.setForeground(new java.awt.Color(255, 255, 255));
        Science.setText("Science");
        Science.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScienceMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ScienceMousePressed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 102, 0));
        btnLogout.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("LOG OUT");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(All, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Fiction, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(History, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Romance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Science, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(All)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fiction)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(History)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Romance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Science)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel3.setBackground(new java.awt.Color(233, 230, 230));

        ShoppingCart.setFont(new java.awt.Font("Street - Plain", 0, 24)); // NOI18N
        ShoppingCart.setText("Shopping Cart");

        numOfItems.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        numOfItems.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Total.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Total.setText("Total");

        txtTotalPrice.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        txtTotalPrice.setToolTipText("");
        txtTotalPrice.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCheckout.setBackground(new java.awt.Color(255, 102, 0));
        btnCheckout.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        btnCheckout.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckout.setText("Proceed to Checkout");
        btnCheckout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel4.setText("items");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/fiction-sting.jpg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel14.setText("Sting");

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel15.setText("by Sanda Brown");

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 102, 0));
        jLabel16.setText("₱275");

        closeItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/close.png"))); // NOI18N
        closeItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeItem1MouseClicked(evt);
            }
        });

        itemQty1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                itemQty1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlItem1Layout = new javax.swing.GroupLayout(pnlItem1);
        pnlItem1.setLayout(pnlItem1Layout);
        pnlItem1Layout.setHorizontalGroup(
            pnlItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addGroup(pnlItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlItem1Layout.createSequentialGroup()
                        .addGroup(pnlItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(67, 67, 67)
                        .addComponent(closeItem1))
                    .addGroup(pnlItem1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(65, 65, 65)
                        .addComponent(itemQty1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        pnlItem1Layout.setVerticalGroup(
            pnlItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem1Layout.createSequentialGroup()
                .addGroup(pnlItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlItem1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel15)
                        .addGap(83, 83, 83)
                        .addGroup(pnlItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemQty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlItem1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlItem1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(closeItem1))))
                .addGap(0, 0, 0))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/fiction-the-magicians.jpg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel17.setText("The Magicians");

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel18.setText("by Lev Grossman");

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 102, 0));
        jLabel19.setText("₱675");

        closeItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/close.png"))); // NOI18N
        closeItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeItem2MouseClicked(evt);
            }
        });

        itemQty2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                itemQty2StateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlItem2Layout = new javax.swing.GroupLayout(pnlItem2);
        pnlItem2.setLayout(pnlItem2Layout);
        pnlItem2Layout.setHorizontalGroup(
            pnlItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addGroup(pnlItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlItem2Layout.createSequentialGroup()
                        .addGroup(pnlItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(61, 61, 61)
                        .addComponent(closeItem2))
                    .addGroup(pnlItem2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(65, 65, 65)
                        .addComponent(itemQty2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        pnlItem2Layout.setVerticalGroup(
            pnlItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlItem2Layout.createSequentialGroup()
                        .addGroup(pnlItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(closeItem2)
                            .addComponent(jLabel17))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel18)
                        .addGap(86, 86, 86)
                        .addGroup(pnlItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemQty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/history-battle-cry-of-freedom.jpg"))); // NOI18N
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 102, 0));
        jLabel22.setText("₱275");

        jLabel65.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel65.setText("Battle Cry of Freedom");

        jLabel66.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel66.setText("The Civil War Era");

        jLabel67.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel67.setText("by James M. Mcpherson");

        closeItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/close.png"))); // NOI18N
        closeItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeItem4MouseClicked(evt);
            }
        });

        itemQty4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                itemQty4StateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlItem4Layout = new javax.swing.GroupLayout(pnlItem4);
        pnlItem4.setLayout(pnlItem4Layout);
        pnlItem4Layout.setHorizontalGroup(
            pnlItem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel9)
                .addGap(6, 6, 6)
                .addGroup(pnlItem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlItem4Layout.createSequentialGroup()
                        .addGroup(pnlItem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel65)
                            .addComponent(jLabel66)
                            .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(closeItem4))
                    .addGroup(pnlItem4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(65, 65, 65)
                        .addComponent(itemQty4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        pnlItem4Layout.setVerticalGroup(
            pnlItem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlItem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlItem4Layout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel66)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel67)
                        .addGap(69, 69, 69)
                        .addGroup(pnlItem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemQty4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(closeItem4)))
        );

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/fiction-white-queen.jpg"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel23.setText("The White Queen");

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel24.setText("by Philippa Gregory");

        jLabel25.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 102, 0));
        jLabel25.setText("₱485");

        closeItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/close.png"))); // NOI18N
        closeItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeItem3MouseClicked(evt);
            }
        });

        itemQty3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                itemQty3StateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlItem3Layout = new javax.swing.GroupLayout(pnlItem3);
        pnlItem3.setLayout(pnlItem3Layout);
        pnlItem3Layout.setHorizontalGroup(
            pnlItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel11)
                .addGap(6, 6, 6)
                .addGroup(pnlItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlItem3Layout.createSequentialGroup()
                        .addGroup(pnlItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(43, 43, 43)
                        .addComponent(closeItem3))
                    .addGroup(pnlItem3Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(65, 65, 65)
                        .addComponent(itemQty3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        pnlItem3Layout.setVerticalGroup(
            pnlItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlItem3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel23)
                .addGap(6, 6, 6)
                .addComponent(jLabel24)
                .addGap(84, 84, 84)
                .addGroup(pnlItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(itemQty3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(pnlItem3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(closeItem3))
        );

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/history-burn-my-heart.jpg"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 102, 0));
        jLabel28.setText("₱750");

        jLabel68.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel68.setText("Burn My Heart at");

        jLabel69.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel69.setText("Wounded Knee");

        jLabel70.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel70.setText("by Dee Brown");

        closeItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/close.png"))); // NOI18N
        closeItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeItem5MouseClicked(evt);
            }
        });

        itemQty5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                itemQty5StateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlItem5Layout = new javax.swing.GroupLayout(pnlItem5);
        pnlItem5.setLayout(pnlItem5Layout);
        pnlItem5Layout.setHorizontalGroup(
            pnlItem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel13)
                .addGap(6, 6, 6)
                .addGroup(pnlItem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlItem5Layout.createSequentialGroup()
                        .addGroup(pnlItem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel68)
                            .addComponent(jLabel69)
                            .addComponent(jLabel70))
                        .addGap(46, 46, 46)
                        .addComponent(closeItem5))
                    .addGroup(pnlItem5Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(65, 65, 65)
                        .addComponent(itemQty5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        pnlItem5Layout.setVerticalGroup(
            pnlItem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlItem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlItem5Layout.createSequentialGroup()
                        .addComponent(jLabel68)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel69)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel70)
                        .addGap(58, 58, 58)
                        .addGroup(pnlItem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(itemQty5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(closeItem5)))
        );

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/history-europe.jpg"))); // NOI18N
        jLabel30.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel31.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel31.setText("Europe: A History");

        jLabel32.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel32.setText("by Norman Davies");

        jLabel33.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 102, 0));
        jLabel33.setText("₱395");

        closeItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/close.png"))); // NOI18N
        closeItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeItem6MouseClicked(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jLabel41.setText("Quantity");

        itemQty6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                itemQty6StateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlItem6Layout = new javax.swing.GroupLayout(pnlItem6);
        pnlItem6.setLayout(pnlItem6Layout);
        pnlItem6Layout.setHorizontalGroup(
            pnlItem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel30)
                .addGap(6, 6, 6)
                .addGroup(pnlItem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlItem6Layout.createSequentialGroup()
                        .addGroup(pnlItem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32))
                        .addGap(43, 43, 43)
                        .addComponent(closeItem6))
                    .addGroup(pnlItem6Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemQty6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        pnlItem6Layout.setVerticalGroup(
            pnlItem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlItem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlItem6Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel32)
                        .addGap(84, 84, 84)
                        .addGroup(pnlItem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemQty6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(closeItem6)))
        );

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/romance-one-last-stop.jpg"))); // NOI18N
        jLabel35.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel36.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel36.setText("One Last Stop");

        jLabel37.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel37.setText("by Casie McQuiston");

        jLabel38.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 102, 0));
        jLabel38.setText("₱540");

        closeItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/close.png"))); // NOI18N
        closeItem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeItem7MouseClicked(evt);
            }
        });

        itemQty7.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                itemQty7StateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlItem7Layout = new javax.swing.GroupLayout(pnlItem7);
        pnlItem7.setLayout(pnlItem7Layout);
        pnlItem7Layout.setHorizontalGroup(
            pnlItem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel35)
                .addGap(6, 6, 6)
                .addGroup(pnlItem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlItem7Layout.createSequentialGroup()
                        .addGroup(pnlItem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37))
                        .addGap(45, 45, 45)
                        .addComponent(closeItem7))
                    .addGroup(pnlItem7Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(65, 65, 65)
                        .addComponent(itemQty7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        pnlItem7Layout.setVerticalGroup(
            pnlItem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(closeItem7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlItem7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlItem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlItem7Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel37)
                        .addGap(84, 84, 84)
                        .addGroup(pnlItem7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(itemQty7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/romance-people-we-meet-on-vacation.jpg"))); // NOI18N
        jLabel40.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel43.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 102, 0));
        jLabel43.setText("₱520");

        jLabel71.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel71.setText("People We Meet");

        jLabel72.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel72.setText("on Vacation");

        jLabel73.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel73.setText("by Emily Henry");

        closeItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/close.png"))); // NOI18N
        closeItem8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeItem8MouseClicked(evt);
            }
        });

        itemQty8.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                itemQty8StateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlItem8Layout = new javax.swing.GroupLayout(pnlItem8);
        pnlItem8.setLayout(pnlItem8Layout);
        pnlItem8Layout.setHorizontalGroup(
            pnlItem8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem8Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel40)
                .addGap(6, 6, 6)
                .addGroup(pnlItem8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlItem8Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(65, 65, 65)
                        .addComponent(itemQty8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlItem8Layout.createSequentialGroup()
                        .addGroup(pnlItem8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addComponent(jLabel72)
                            .addComponent(jLabel73))
                        .addGap(48, 48, 48)
                        .addComponent(closeItem8)))
                .addGap(0, 0, 0))
        );
        pnlItem8Layout.setVerticalGroup(
            pnlItem8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem8Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlItem8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlItem8Layout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel73)
                        .addGap(67, 67, 67)
                        .addGroup(pnlItem8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemQty8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(closeItem8))
                .addGap(2, 2, 2))
        );

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/romance-the-soulmate-equation.jpg"))); // NOI18N
        jLabel45.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel46.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel46.setText("The Soulmate Equation");

        jLabel47.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel47.setText("by Christina Lauren");

        jLabel48.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 102, 0));
        jLabel48.setText("₱680");

        closeItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/close.png"))); // NOI18N
        closeItem9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeItem9MouseClicked(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        jLabel57.setText("Quantity");

        itemQty9.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                itemQty9StateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlItem9Layout = new javax.swing.GroupLayout(pnlItem9);
        pnlItem9.setLayout(pnlItem9Layout);
        pnlItem9Layout.setHorizontalGroup(
            pnlItem9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem9Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel45)
                .addGap(6, 6, 6)
                .addGroup(pnlItem9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlItem9Layout.createSequentialGroup()
                        .addGroup(pnlItem9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47))
                        .addGap(12, 12, 12)
                        .addComponent(closeItem9))
                    .addGroup(pnlItem9Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemQty9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlItem9Layout.setVerticalGroup(
            pnlItem9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem9Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlItem9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlItem9Layout.createSequentialGroup()
                        .addGroup(pnlItem9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlItem9Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel47))
                            .addComponent(closeItem9))
                        .addGap(85, 85, 85)
                        .addGroup(pnlItem9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlItem9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(itemQty9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/science-the-god-equation.jpg"))); // NOI18N
        jLabel50.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel51.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel51.setText("The God Equation");

        jLabel52.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel52.setText("by Michio Kaku");

        jLabel53.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 102, 0));
        jLabel53.setText("₱730");

        closeItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/close.png"))); // NOI18N
        closeItem10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeItem10MouseClicked(evt);
            }
        });

        itemQty10.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                itemQty10StateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlItem10Layout = new javax.swing.GroupLayout(pnlItem10);
        pnlItem10.setLayout(pnlItem10Layout);
        pnlItem10Layout.setHorizontalGroup(
            pnlItem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem10Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel50)
                .addGap(6, 6, 6)
                .addGroup(pnlItem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlItem10Layout.createSequentialGroup()
                        .addGroup(pnlItem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52))
                        .addGap(37, 37, 37)
                        .addComponent(closeItem10))
                    .addGroup(pnlItem10Layout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addGap(73, 73, 73)
                        .addComponent(itemQty10, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
        );
        pnlItem10Layout.setVerticalGroup(
            pnlItem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem10Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlItem10Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel51)
                .addGap(6, 6, 6)
                .addComponent(jLabel52)
                .addGap(86, 86, 86)
                .addGroup(pnlItem10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemQty10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(pnlItem10Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(closeItem10))
        );

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/science-the-premonition.jpg"))); // NOI18N
        jLabel55.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel58.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 102, 0));
        jLabel58.setText("₱710");

        jLabel74.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel74.setText("The Premonition:");

        jLabel75.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel75.setText("A Pandemic Story");

        jLabel76.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel76.setText("by Michael Lewis");

        closeItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/close.png"))); // NOI18N
        closeItem11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeItem11MouseClicked(evt);
            }
        });

        itemQty11.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                itemQty11StateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlItem11Layout = new javax.swing.GroupLayout(pnlItem11);
        pnlItem11.setLayout(pnlItem11Layout);
        pnlItem11Layout.setHorizontalGroup(
            pnlItem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem11Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel55)
                .addGap(6, 6, 6)
                .addGroup(pnlItem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlItem11Layout.createSequentialGroup()
                        .addGroup(pnlItem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel74)
                            .addComponent(jLabel75)
                            .addComponent(jLabel76))
                        .addGap(37, 37, 37)
                        .addComponent(closeItem11))
                    .addGroup(pnlItem11Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addGap(73, 73, 73)
                        .addComponent(itemQty11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlItem11Layout.setVerticalGroup(
            pnlItem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem11Layout.createSequentialGroup()
                .addGroup(pnlItem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlItem11Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlItem11Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel74)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel75)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel76)
                        .addGap(61, 61, 61)
                        .addGroup(pnlItem11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemQty11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlItem11Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(closeItem11)))
                .addGap(1, 1, 1))
        );

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/science-under-a-white-sky.jpg"))); // NOI18N
        jLabel60.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel63.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 102, 0));
        jLabel63.setText("₱650");

        jLabel77.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel77.setText("Under a White Sky");

        jLabel78.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel78.setText("The Nature of the Future");

        jLabel79.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel79.setText("by Elizabeth Kolbert");

        closeItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/close.png"))); // NOI18N
        closeItem12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeItem12MouseClicked(evt);
            }
        });

        itemQty12.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                itemQty12StateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlItem12Layout = new javax.swing.GroupLayout(pnlItem12);
        pnlItem12.setLayout(pnlItem12Layout);
        pnlItem12Layout.setHorizontalGroup(
            pnlItem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem12Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel60)
                .addGap(6, 6, 6)
                .addGroup(pnlItem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78)
                    .addComponent(jLabel79)
                    .addGroup(pnlItem12Layout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addGap(32, 32, 32)
                        .addComponent(closeItem12))
                    .addGroup(pnlItem12Layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addGap(71, 71, 71)
                        .addComponent(itemQty12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlItem12Layout.setVerticalGroup(
            pnlItem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItem12Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnlItem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlItem12Layout.createSequentialGroup()
                        .addGroup(pnlItem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77)
                            .addComponent(closeItem12))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel79)
                        .addGap(65, 65, 65)
                        .addGroup(pnlItem12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemQty12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout pnlItemListLayout = new javax.swing.GroupLayout(pnlItemList);
        pnlItemList.setLayout(pnlItemListLayout);
        pnlItemListLayout.setHorizontalGroup(
            pnlItemListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItemListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItemListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlItem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlItem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlItem4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlItem3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlItem5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlItem6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlItem7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlItem8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlItem9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlItem10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlItem11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlItem12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlItemListLayout.setVerticalGroup(
            pnlItemListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItemListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlItem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlItem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlItem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlItem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlItem5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlItem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlItem7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlItem8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlItem9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlItem10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlItem11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlItem12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(pnlItemList);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 20)); // NOI18N
        jLabel8.setText("₱");
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShoppingCart)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(numOfItems, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(ShoppingCart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numOfItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Total)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(31, 31, 31)
                .addComponent(btnCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AllMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllMousePressed
        All.setForeground(ClickedColor);
        Fiction.setForeground(DefaultColor);
        History.setForeground(DefaultColor);
        Romance.setForeground(DefaultColor);
        Science.setForeground(DefaultColor);
    }//GEN-LAST:event_AllMousePressed

    private void FictionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FictionMousePressed
        All.setForeground(DefaultColor);
        Fiction.setForeground(ClickedColor);
        History.setForeground(DefaultColor);
        Romance.setForeground(DefaultColor);
        Science.setForeground(DefaultColor);
    }//GEN-LAST:event_FictionMousePressed

    private void HistoryMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistoryMousePressed
        All.setForeground(DefaultColor);
        Fiction.setForeground(DefaultColor);
        History.setForeground(ClickedColor);
        Romance.setForeground(DefaultColor);
        Science.setForeground(DefaultColor);
    }//GEN-LAST:event_HistoryMousePressed

    private void RomanceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RomanceMousePressed
        All.setForeground(DefaultColor);
        Fiction.setForeground(DefaultColor);
        History.setForeground(DefaultColor);
        Romance.setForeground(ClickedColor);
        Science.setForeground(DefaultColor);
    }//GEN-LAST:event_RomanceMousePressed

    private void ScienceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScienceMousePressed
        All.setForeground(DefaultColor);
        Fiction.setForeground(DefaultColor);
        History.setForeground(DefaultColor);
        Romance.setForeground(DefaultColor);
        Science.setForeground(ClickedColor);
    }//GEN-LAST:event_ScienceMousePressed

    private void AllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllMouseClicked
        AllBooks allBooks = new AllBooks();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(allBooks).setVisible(true);   
    }//GEN-LAST:event_AllMouseClicked

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        if (Integer.valueOf(countItem()) != 0 ){
            dispose();
            new CheckoutForm(this).setVisible(true);
        }
    }//GEN-LAST:event_btnCheckoutActionPerformed

    private void FictionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FictionMouseClicked
        FictionBooks fictionBooks = new FictionBooks();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(fictionBooks).setVisible(true);
    }//GEN-LAST:event_FictionMouseClicked

    private void HistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistoryMouseClicked
        HistoryBooks historyBooks = new HistoryBooks();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(historyBooks).setVisible(true);
    }//GEN-LAST:event_HistoryMouseClicked

    private void RomanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RomanceMouseClicked
        RomanceBooks romanceBooks = new RomanceBooks();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(romanceBooks).setVisible(true);
    }//GEN-LAST:event_RomanceMouseClicked

    private void ScienceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScienceMouseClicked
        ScienceBooks scienceBooks = new ScienceBooks();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(scienceBooks).setVisible(true);
    }//GEN-LAST:event_ScienceMouseClicked

    private void closeItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeItem1MouseClicked
        // TODO add your handling code here:
        itemQty1.setValue(0);
    }//GEN-LAST:event_closeItem1MouseClicked

    private void closeItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeItem2MouseClicked
        // TODO add your handling code here:
        itemQty2.setValue(0);
    }//GEN-LAST:event_closeItem2MouseClicked

    private void closeItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeItem3MouseClicked
        // TODO add your handling code here:
        itemQty3.setValue(0);
    }//GEN-LAST:event_closeItem3MouseClicked

    private void closeItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeItem4MouseClicked
        // TODO add your handling code here:
        itemQty4.setValue(0);
    }//GEN-LAST:event_closeItem4MouseClicked

    private void closeItem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeItem5MouseClicked
        // TODO add your handling code here:
        itemQty5.setValue(0);
    }//GEN-LAST:event_closeItem5MouseClicked

    private void closeItem6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeItem6MouseClicked
        // TODO add your handling code here:
        itemQty6.setValue(0);
    }//GEN-LAST:event_closeItem6MouseClicked

    private void closeItem7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeItem7MouseClicked
        // TODO add your handling code here:
        itemQty7.setValue(0);
    }//GEN-LAST:event_closeItem7MouseClicked

    private void closeItem8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeItem8MouseClicked
        // TODO add your handling code here:
        itemQty8.setValue(0);
    }//GEN-LAST:event_closeItem8MouseClicked

    private void closeItem9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeItem9MouseClicked
        // TODO add your handling code here:
        itemQty9.setValue(0);
    }//GEN-LAST:event_closeItem9MouseClicked

    private void closeItem10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeItem10MouseClicked
        // TODO add your handling code here:
        itemQty10.setValue(0);
    }//GEN-LAST:event_closeItem10MouseClicked

    private void closeItem11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeItem11MouseClicked
        // TODO add your handling code here:
        itemQty11.setValue(0);
    }//GEN-LAST:event_closeItem11MouseClicked

    private void closeItem12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeItem12MouseClicked
        // TODO add your handling code here:
        itemQty12.setValue(0);
    }//GEN-LAST:event_closeItem12MouseClicked

    private void itemQty1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_itemQty1StateChanged
        // TODO add your handling code here:
        hidePanel(itemQty1, pnlItem1);
        computeTotal();
    }//GEN-LAST:event_itemQty1StateChanged

    private void itemQty2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_itemQty2StateChanged
        // TODO add your handling code here:
        hidePanel(itemQty2, pnlItem2);
        computeTotal();
    }//GEN-LAST:event_itemQty2StateChanged

    private void itemQty3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_itemQty3StateChanged
        // TODO add your handling code here:
        hidePanel(itemQty3, pnlItem3);
        computeTotal();
    }//GEN-LAST:event_itemQty3StateChanged

    private void itemQty4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_itemQty4StateChanged
        // TODO add your handling code here:
        hidePanel(itemQty4, pnlItem4);
        computeTotal();
    }//GEN-LAST:event_itemQty4StateChanged

    private void itemQty5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_itemQty5StateChanged
        // TODO add your handling code here:
        hidePanel(itemQty5, pnlItem5);
        computeTotal();
    }//GEN-LAST:event_itemQty5StateChanged

    private void itemQty6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_itemQty6StateChanged
        // TODO add your handling code here:
        hidePanel(itemQty6, pnlItem6);
        computeTotal();
    }//GEN-LAST:event_itemQty6StateChanged

    private void itemQty7StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_itemQty7StateChanged
        // TODO add your handling code here:
        hidePanel(itemQty7, pnlItem7);
        computeTotal();
    }//GEN-LAST:event_itemQty7StateChanged

    private void itemQty8StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_itemQty8StateChanged
        // TODO add your handling code here:
        hidePanel(itemQty8, pnlItem8);
        computeTotal();
    }//GEN-LAST:event_itemQty8StateChanged

    private void itemQty9StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_itemQty9StateChanged
        // TODO add your handling code here:
        hidePanel(itemQty9, pnlItem9);
        computeTotal();
    }//GEN-LAST:event_itemQty9StateChanged

    private void itemQty10StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_itemQty10StateChanged
        // TODO add your handling code here:
        hidePanel(itemQty10, pnlItem10);
        computeTotal();
    }//GEN-LAST:event_itemQty10StateChanged

    private void itemQty11StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_itemQty11StateChanged
        // TODO add your handling code here:
        hidePanel(itemQty11, pnlItem11);
        computeTotal();
    }//GEN-LAST:event_itemQty11StateChanged

    private void itemQty12StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_itemQty12StateChanged
        // TODO add your handling code here:
        hidePanel(itemQty12, pnlItem12);
        computeTotal();
    }//GEN-LAST:event_itemQty12StateChanged

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        dispose();
        new LoginFormUI().setVisible(true);
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        txtUsername.setText(LoginFormUI.username);
    }//GEN-LAST:event_txtUsernameFocusGained

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
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel All;
    private javax.swing.JLabel Fiction;
    private javax.swing.JLabel History;
    private javax.swing.JLabel Romance;
    private javax.swing.JLabel Science;
    private javax.swing.JLabel ShoppingCart;
    private javax.swing.JLabel Total;
    private javax.swing.JButton btnCheckout;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel closeItem1;
    private javax.swing.JLabel closeItem10;
    private javax.swing.JLabel closeItem11;
    private javax.swing.JLabel closeItem12;
    private javax.swing.JLabel closeItem2;
    private javax.swing.JLabel closeItem3;
    private javax.swing.JLabel closeItem4;
    private javax.swing.JLabel closeItem5;
    private javax.swing.JLabel closeItem6;
    private javax.swing.JLabel closeItem7;
    private javax.swing.JLabel closeItem8;
    private javax.swing.JLabel closeItem9;
    public static javax.swing.JSpinner itemQty1;
    public static javax.swing.JSpinner itemQty10;
    public static javax.swing.JSpinner itemQty11;
    public static javax.swing.JSpinner itemQty12;
    public static javax.swing.JSpinner itemQty2;
    public static javax.swing.JSpinner itemQty3;
    public static javax.swing.JSpinner itemQty4;
    public static javax.swing.JSpinner itemQty5;
    public static javax.swing.JSpinner itemQty6;
    public static javax.swing.JSpinner itemQty7;
    public static javax.swing.JSpinner itemQty8;
    public static javax.swing.JSpinner itemQty9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField numOfItems;
    public static javax.swing.JPanel pnlItem1;
    public static javax.swing.JPanel pnlItem10;
    public static javax.swing.JPanel pnlItem11;
    public static javax.swing.JPanel pnlItem12;
    public static javax.swing.JPanel pnlItem2;
    public static javax.swing.JPanel pnlItem3;
    public static javax.swing.JPanel pnlItem4;
    public static javax.swing.JPanel pnlItem5;
    public static javax.swing.JPanel pnlItem6;
    public static javax.swing.JPanel pnlItem7;
    public static javax.swing.JPanel pnlItem8;
    public static javax.swing.JPanel pnlItem9;
    public static javax.swing.JPanel pnlItemList;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

 
}
