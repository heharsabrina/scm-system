import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Search_Product {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   private JLabel pid;
   GridLayout experimentLayout = new GridLayout(0, 2);

   Search_Product() {
      prepareGUI();
   }

   public static void main(String[] args) {
      Search_Product swingControlDemo = new Search_Product();
      swingControlDemo.showButtonDemo();
   }

   private void prepareGUI() {
      mainFrame = new JFrame("Search Product");
      mainFrame.setSize(700, 400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.getContentPane().setBackground(Color.green);
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent) {
            mainFrame.setVisible(false);
         }
      });
      headerLabel = new JLabel("", JLabel.CENTER);
      statusLabel = new JLabel("", JLabel.CENTER);

      statusLabel.setSize(350, 400);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);
   }

   public void showButtonDemo() {
      headerLabel.setText("Supply Chain Management System");
      headerLabel.setFont(new Font(null, Font.BOLD, 27));
      headerLabel.setForeground(Color.black);

      pid = new JLabel("Enter Product Id");
      JTextField tf2 = new JTextField();
      tf2.setSize(100, 30);

      JButton okButton = new JButton("Search Product");

      okButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            // Perform actions when the button is clicked
            // For example, retrieve product details from a local data structure and display them
            JOptionPane.showMessageDialog(null, "Product Details Available Quantity: Price: " + tf2.getText());
            mainFrame.setVisible(false);
         }
      });

      JPanel jp = new JPanel();
      jp.add(pid);
      jp.add(tf2);

      jp.setSize(200, 200);
      jp.setLayout(experimentLayout);
      controlPanel.add(jp);
      jp.add(okButton);

      mainFrame.setVisible(true);

      mainFrame.setLocationRelativeTo(null);
   }
}
