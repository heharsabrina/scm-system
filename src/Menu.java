import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class Menu
{
   private JFrame frame;
   private JLabel headerLabel;
   private ImageIcon icon;
   //private JLabel statusLabel;
   //private JPanel controlPanel;
   
   public Menu()
   {
      prepareGUI(); //Setup main frame, header label, status label, and control panel
      showButtonDemo();//Configure and add buttons for various functionalities
   }
   /*public static void main(String[] args)
   {
      Menu swingControlDemo = new Menu();
      swingControlDemo.showButtonDemo();
   }*/

   void prepareGUI()
   {
      frame = new JFrame("SCM");
      icon = new ImageIcon("images/icon.png");
      frame.setIconImage(icon.getImage()); //Change icon of the image
      frame.setSize(1920, 1080);
      frame.setLayout(null); //This sets the layout manager for the frame. A layout manager is responsible for arranging components within a container. Here, we're using a GridLayout with 3 rows and 1 column. This means that components added to the frame will be arranged in three vertical sections.
      frame.getContentPane().setBackground(new Color(225, 243, 252));
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      headerLabel = new JLabel("Menu", JLabel.CENTER);
      headerLabel.setFont(new Font("Serif", Font.PLAIN, 75));
      //headerLabel.setForeground(new Color(0, 74, 173));
      headerLabel.setForeground(Color.black);
      headerLabel.setBounds(850, 50, 400, 150);

      // statusLabel = new JLabel("dhd",JLabel.WEST);
      // statusLabel.setBackground(Color.BLUE);
      // statusLabel.setSize(350,300);
      JLabel imageLabel = new JLabel(new ImageIcon("images/menu_bg.png"));
      imageLabel.setBounds(-100, -350, 550, 2000);
      frame.add(imageLabel);
      //controlPanel = new JPanel();
   
      //controlPanel.setLayout(new GridLayout(1, 5)); //Sets the layout manager for the controlPanel to a GridLayout with 1 row and 5 columns. This layout will arrange components added to controlPanel in a single row with five equally sized columns.
      //controlPanel.setLayout(new GridLayout(1, 5, 20, 0)); // Added horizontal and vertical gaps between buttons
      //controlPanel.setBackground(new Color(225, 243, 253));

      frame.add(headerLabel);
      //frame.add(controlPanel);
      //frame.add(statusLabel);
      frame.setVisible(true);
   }

   public void showButtonDemo()
   {
      JButton view_product_details_button = createStyledButton("Search for a product");
      JButton about_button = createStyledButton("About this project");
      JButton add_product_button = createStyledButton("Add a product");
      JButton add_supplier_acc_button = createStyledButton("Add a supplier account");
      JButton purchase_product_button = createStyledButton("Purchase a product");

      about_button.addActionListener(e -> new About());
      view_product_details_button.addActionListener(e -> new Search_Product());
      add_product_button.addActionListener(e -> new Add_Product());
      add_supplier_acc_button.addActionListener(e -> new Add_Supplier_Acc());
      purchase_product_button.addActionListener(e -> new Purchase_Product());

      ImageIcon icon_1 = new ImageIcon("images/about.png");
      about_button.setIcon(icon_1);
      about_button.setBounds(490, 350, 320, 150);
      
      ImageIcon icon_2 = new ImageIcon("images/add_supplier_acc.png");
      add_supplier_acc_button.setIcon(icon_2);
      add_supplier_acc_button.setBounds(890, 350, 320, 150);

      ImageIcon icon_3 = new ImageIcon("images/add_product.png");
      add_product_button.setIcon(icon_3);
      add_product_button.setBounds(1290, 350, 320, 150);

      ImageIcon icon_4 = new ImageIcon("images/search_product.png");
      view_product_details_button.setIcon(icon_4);
      view_product_details_button.setBounds(690, 550, 320, 150);

      ImageIcon icon_5 = new ImageIcon("images/purchase_product.png");
      purchase_product_button.setIcon(icon_5);
      purchase_product_button.setBounds(1090, 550, 320, 150);

      frame.add(about_button);
      frame.add(add_supplier_acc_button);
      frame.add(add_product_button);
      frame.add(view_product_details_button);
      frame.add(purchase_product_button);
      // controlPanel.add(about_button);
      // controlPanel.add(add_supplier_acc_button);
      // controlPanel.add(add_product_button);
      // controlPanel.add(view_product_details_button);
      // controlPanel.add(purchase_product_button);
  }

  private JButton createStyledButton(String text)
  {
      JButton button = new JButton(text);
      //button.setFont(new Font("SanSerif", Font.PLAIN, 25));
      button.setFont(new Font("SanSerif", Font.BOLD, 22));

      button.setHorizontalTextPosition(JButton.CENTER);
      button.setVerticalTextPosition(JButton.TOP);
      button.setIconTextGap(15);
      button.setBorder(BorderFactory.createLineBorder(Color.black, 2));
      button.setBackground(Color.white);
      //button.setForeground(new Color(0, 148, 218));
      button.setForeground(Color.black);

      button.setFocusable(false);
      return button;
  }
}
