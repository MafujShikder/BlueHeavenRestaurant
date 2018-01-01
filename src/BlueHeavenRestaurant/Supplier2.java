
package BlueHeavenRestaurant;


import BlueHeavenRestaurant.Item4;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * @author Toxic
 */
 /*

 */
public class Supplier2 extends JFrame implements ActionListener {

    public static final String dbHost = "jdbc:mysql://localhost:3306/restaurant1";
    public static final String dbUser = "root";
    public static final String dbPass = "";

    private Connection connection = null;
    private Statement statement = null;
    private ResultSet rs = null;

    PreparedStatement ps;

    private String id = null;
    private String name = null;
    private String address = null;
    private String phoneno = null;
    private String email = null;

    JFrame jframe;
    private JPanel panel;
    JTextField txt1, txt2, txt3, txt4, txt5;
    JLabel label1, label2, label3, label4, label5, label6;
    JButton button1, button2, button3, button4, button5, button6, button7;
    Font f;

    DefaultTableModel model = new DefaultTableModel();
    JTable tabgrid = new JTable(model);
    JScrollPane scrollpane = new JScrollPane(tabgrid);
    //private int reply;
    private int reply;

    private JPopupMenu popup;

    Supplier2() {
        jframe = new JFrame();
        f = new Font("Times New Roman", Font.BOLD, 20);
        jframe.setLayout(null);
        jframe.getContentPane().setBackground(Color.LIGHT_GRAY);
        
        panel = new JPanel();
        panel.setBounds(100,100,WIDTH,HEIGHT);
        getContentPane().add(panel);
        
        label1 = new JLabel("Blue Heaven Restaurant");
        label1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        label1.setForeground(Color.BLUE);
        label1.setBounds(300, 10, 600, 40);
        jframe.add(label1);

        label6 = new JLabel("New Supplier Details");
        label6.setFont(f);
        label6.setBounds(350, 80, 300, 40);
        jframe.add(label6);

        label1 = new JLabel("Supplier ID ");
        label1.setFont(f);
        label1.setBounds(210, 120, 135, 25);
        jframe.add(label1);
        txt1 = new JTextField(20);
        txt1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt1.setBounds(358, 120, 200, 25);
        txt1.setToolTipText("EnterSupplierID");
        jframe.add(txt1);

        label2 = new JLabel(" Name:");
        label2.setFont(f);
        label2.setBounds(210, 160, 170, 25);
        jframe.add(label2);

        txt2 = new JTextField(20);
        txt2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt2.setBounds(358, 160, 200, 25);
        txt2.setToolTipText("EnterSupplierName");
        jframe.add(txt2);

        label3 = new JLabel("Address:");
        label3.setFont(f);
        label3.setBounds(210, 200, 170, 25);
        jframe.add(label3);

        txt3 = new JTextField(20);
        txt3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt3.setBounds(358, 200, 200, 25);
        txt3.setToolTipText("EnterSupplierAddress");
        jframe.add(txt3);

        label4 = new JLabel("Phone No:");
        label4.setFont(f);
        label4.setBounds(210, 240, 170, 25);
        jframe.add(label4);
        txt4 = new JTextField(20);
        txt4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt4.setBounds(358, 240, 200, 25);
        txt4.setToolTipText("EnterSupplierPhoneNo");
        jframe.add(txt4);

        label5 = new JLabel("Email Id:");
        label5.setFont(f);
        label5.setBounds(210, 280, 170, 25);
        jframe.add(label5);
        txt5 = new JTextField(20);
        txt5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        txt5.setBounds(358, 280, 200, 25);
        txt5.setToolTipText("EnterSuppliereEmailId");
        jframe.add(txt5);

        button1 = new JButton("Insert", new ImageIcon(""));
        button1.setContentAreaFilled(false);
        button1.setFocusPainted(false);
        button1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        button1.setBounds(150, 330, 80, 35);
        button1.setToolTipText("Click To Save Supplier Details ");
        jframe.add(button1);
        button1.addActionListener(this);

        button2 = new JButton("Clear", new ImageIcon(""));
        button2.setBounds(235, 330, 80, 35);
        button2.setContentAreaFilled(false);
        button2.setFocusPainted(false);
        button2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        button2.setToolTipText("Click To Clear All Textfields");
        jframe.add(button2);
        button2.addActionListener(this);

        button3 = new JButton("All", new ImageIcon(""));
        button3.setBounds(320, 330, 80, 35);
        button3.setContentAreaFilled(false);
        button3.setFocusPainted(false);
        button3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        button3.setToolTipText("Click To View All");
        jframe.add(button3);
        button3.addActionListener(this);

        button7 = new JButton("Open", new ImageIcon(""));
        button7.setBounds(405, 330, 80, 35);
        button7.setContentAreaFilled(false);
        button7.setFocusPainted(false);
        button7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        button7.setToolTipText("Click To View All");
        jframe.add(button7);
        button7.addActionListener(this);

        button5 = new JButton("Update", new ImageIcon(""));
        button5.setBounds(490, 330, 80, 35);
        button5.setContentAreaFilled(false);
        button5.setFocusPainted(false);
        button5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        button5.setToolTipText("Click To View All");
        jframe.add(button5);
        button5.addActionListener(this);

        button6 = new JButton("Delete", new ImageIcon(""));
        button6.setBounds(575, 330, 80, 35);
        button6.setContentAreaFilled(false);
        button6.setFocusPainted(false);
        button6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        button6.setToolTipText("Click To View All");
        jframe.add(button6);
        button6.addActionListener(this);

        scrollpane.setBounds(0, 380, 807, 500);
        jframe.add(scrollpane);
        tabgrid.setFont(new Font("Times New Roman", 25, 15));

        model.addColumn("Supplier_ID");
        model.addColumn("Supplier_Name");
        model.addColumn("Supplier_Address");
        model.addColumn("Supplier_PhoneNo");
        model.addColumn("Supplier_EmailID");



        jframe.setTitle("Add New Supplier");
        jframe.setSize(810, 600);
        jframe.setLocation(270, 100);
        jframe.setResizable(false);
      
        jframe.setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button1) {

            id = txt1.getText().toString();
            name = txt2.getText().toString();
            address = txt3.getText().toString();
            phoneno = txt4.getText().toString();
            email = txt5.getText().toString();
            Pattern p = Pattern.compile("[_a-z_A-Z_0-9]+[0-9]*@[a-zA-Z0-9]+.[a-zA-Z0-9]+");
            Matcher m = p.matcher(email);

            boolean matchFound = m.matches();

            if (((txt1.getText()).equals("")) || ((txt2.getText()).equals("")) || ((txt3.getText()).equals("")) || ((txt4.getText()).equals("")) || ((txt5.getText()).equals(""))) {
                JOptionPane.showMessageDialog(this, "Every Field Is Required");

            } else if (!matchFound) {
                JOptionPane.showMessageDialog(this, "Invalid Email ID");
            } else {
                try {

                    connection = (Connection) DriverManager.getConnection(dbHost, dbUser, dbPass);
                    ps = connection.prepareStatement("insert into supplier (SupplierID,Name,Address,PhoneNo,Email)values(?,?,?,?,?)");
                    ps.setString(1, txt1.getText());
                    ps.setString(2, txt2.getText());
                    ps.setString(3, txt3.getText());
                    ps.setString(4, txt4.getText());
                    ps.setString(5, txt5.getText());
                    ps.executeUpdate();
                    System.out.println(email);
                    reply = JOptionPane.showConfirmDialog(null, "Supplier Added Successfully.Do you want add more supplier?", "Added Supplier", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) {
                        jframe.setVisible(false);
                        new Supplier2();

                    } else if (reply == JOptionPane.NO_OPTION) {

                        jframe.setVisible(false);
                        new Supplier2();
                    }
                    connection.close();

                } catch (SQLException err) {
                    System.out.println(err);
                    JOptionPane.showMessageDialog(null, "SQL Error:" + err);
                } catch (Exception e) {
                    System.out.println(e);
                    JOptionPane.showMessageDialog(null, "Error:" + e);
                }

            }

        } else if (ae.getSource() == button2) {

            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            txt4.setText("");
            txt5.setText("");
        } else if (ae.getSource() == button3) {
            int r = 0;
            try {

                connection = DriverManager.getConnection(dbHost, dbUser, dbPass);
                statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                rs = statement.executeQuery("select * from supplier ");
                while (rs.next()) {
                    model.insertRow(r++, new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
                }
                connection.close();
            } catch (SQLException se) {
                System.out.println(se);
                JOptionPane.showMessageDialog(null, "SQL Error:" + se);
            } catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Error:" + e);
            }

        } else if (ae.getSource() == button7) {
            String dataopen = txt1.getText();
            try {
                connection = DriverManager.getConnection(dbHost, dbUser, dbPass);
                ps = connection.prepareStatement("select * from supplier where SupplierID = '" + dataopen + "'");
                ResultSet result = ps.executeQuery();
                while (result.next()) {
                    txt1.setText(result.getString(1));
                    txt2.setText(result.getString(2));
                    txt3.setText(result.getString(3));
                    txt4.setText(result.getString(4));
                    txt5.setText(result.getString(5));

                }
            } catch (SQLException ex) {
                Logger.getLogger(Item4.class.getName()).log(Level.SEVERE, null, ex);

            }

        } else if (ae.getSource() == button5) {
            String fname = txt1.getText();
            String fprice = txt2.getText();
            String fmfg = txt3.getText();
            String fexp = txt4.getText();
            String ST = txt5.getText();

            try {
                connection = DriverManager.getConnection(dbHost, dbUser, dbPass);
                Statement st = connection.createStatement();
                String sql = "update supplier set SupplierID = '" + fname + "', Name = '" + fprice + "', Address = '" + fmfg + "', PhoneNo = '" + fexp + "',Email = '" + ST + "' where SupplierID = '"+fname+"'";
                  st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Update Data Successfully");
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                txt4.setText("");
                txt5.setText("");

            } catch (Exception err) {
                err.printStackTrace();
            }
        }
        else if (ae.getSource() == button6) {
            String fname = txt1.getText();
            String fprice = txt2.getText();
            String fmfg = txt3.getText();
            String fexp = txt4.getText();
            String ST = txt5.getText();

            try {
                connection = DriverManager.getConnection(dbHost, dbUser, dbPass);
               
            ps = connection.prepareStatement("delete from supplier where SupplierID = '" + fname + "'");
            ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Delete Data Successfully");
                txt1.setText("");
     

            } catch (Exception err) {
                err.printStackTrace();
            }
        }


    }

    public static void main(String args[]) {
        new Supplier2();
    }

}
