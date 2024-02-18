import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Add_Product {

   private JFrame mainFrame;
   private JLabel headerLabel;
   private JPanel controlPanel;
   private JLabel name, price, quantity, qt;
   GridLayout experimentLayout = new GridLayout(0, 2);

   Add_Product() {
      prepareGUI();
   }

   public static void main(String[] args) {
      Add_Product swingControlDemo = new Add_Product();
      swingControlDemo.showButtonDemo();
   }

   private void prepareGUI() {
      mainFrame = new JFrame("Add Product Details");
      mainFrame.setSize(700, 500);
      mainFrame.setLayout(new GridLayout(3, 1));
      

      mainFrame.getContentPane().setBackground(Color.green);

      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent) {
            mainFrame.setVisible(false);
         }
      });
      headerLabel = new JLabel("", JLabel.CENTER);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.setVisible(true);
   }

   public void showButtonDemo() {
      headerLabel.setText("Supply Chain Management System");
      headerLabel.setFont(new Font(null, Font.BOLD, 27));

      name = new JLabel("Enter Product Id");
      JTextField tf2 = new JTextField();
      tf2.setSize(100, 40);

      price = new JLabel("Enter Product Name");
      JTextField tf3 = new JTextField();
      tf3.setSize(100, 40);

      quantity = new JLabel("Enter Quantity");
      JTextField tf4 = new JTextField();
      tf4.setSize(100, 40);

      qt = new JLabel("Enter Price");
      JTextField tf5 = new JTextField();
      tf4.setSize(100, 40);

      JButton okButton = new JButton("Add");

      okButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Perform actions when the button is clicked
            JOptionPane.showMessageDialog(null, "Product Added!" + tf2.getText());
            mainFrame.setVisible(false);
         }
      });

      JPanel jp = new JPanel(null);
      jp.add(name);
      jp.add(tf2);
      jp.add(price);
      jp.add(tf3);
      jp.add(quantity);
      jp.add(tf4);
      jp.add(qt);
      jp.add(tf5);

      jp.setSize(700, 700);
      jp.setLayout(experimentLayout);
      controlPanel.add(jp);
      jp.add(okButton);

      mainFrame.setLocationRelativeTo(null);
      mainFrame.setVisible(true);
   }
}
