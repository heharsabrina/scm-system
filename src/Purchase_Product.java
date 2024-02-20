import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Purchase_Product
{
   private JFrame frame;
   private ImageIcon icon;

   private JLabel headerLabel;
   private JLabel imageLabel;

   private JLabel idLabel;
   private JLabel quantLabel;

   private JTextField id;
   private JTextField quant;
   
   public Purchase_Product()
   {
      prepareGUI();
      showButtonDemo();//Configure and add buttons for various functionalities
   }

   void prepareGUI()
   {
      frame = new JFrame("SCM");
      icon = new ImageIcon("images/icon.png");
      frame.setIconImage(icon.getImage()); //Change icon of the image
      frame.setSize(1920, 1080);
      frame.setLayout(null); //This sets the layout manager for the frame. A layout manager is responsible for arranging components within a container. Here, we're using a GridLayout with 3 rows and 1 column. This means that components added to the frame will be arranged in three vertical sections.
      frame.getContentPane().setBackground(new Color(225, 243, 252));

      headerLabel = new JLabel("Add a Supplier Account", JLabel.CENTER);
      headerLabel.setFont(new Font("Serif", Font.PLAIN, 75));
      //headerLabel.setForeground(new Color(0, 74, 173));
      headerLabel.setForeground(Color.black);
      headerLabel.setBounds(450, 50, 1250, 150);

      // statusLabel = new JLabel("dhd",JLabel.WEST);
      // statusLabel.setBackground(Color.BLUE);
      // statusLabel.setSize(350,300);
      imageLabel = new JLabel(new ImageIcon("images/menu_bg.png"));
      imageLabel.setBounds(-100, -350, 550, 2000);
      frame.add(imageLabel);
      frame.add(headerLabel);
   }

   public void showButtonDemo()
   {
      idLabel = new JLabel();
      idLabel.setText("Enter Product ID");
      idLabel.setBounds(760, 350, 300, 100);
      idLabel.setFont(new Font("SanSerif", Font.PLAIN, 30));
      idLabel.setForeground(Color.black);
      

      quantLabel = new JLabel("Enter Quantity");
      quantLabel.setBounds(760, 450, 300, 100);
      quantLabel.setFont(new Font("SanSerif", Font.PLAIN, 30));
      quantLabel.setForeground(Color.black);
      

      
      id = new JTextField();
      id.setBounds(1150, 380, 200, 30);
      id.setFont(new Font("SanSerif", Font.PLAIN, 20));
      
      
      quant = new JTextField();
      quant.setBounds(1150, 480, 200, 30);
      quant.setFont(new Font("SanSerif", Font.PLAIN, 20));

      ImageIcon icon_1 = new ImageIcon("images/check-mark.png");
      ImageIcon icon_2 = new ImageIcon("images/cross.png");
      
      JButton place_order = createStyledButton("Place Order");
      // ... (your existing code)

   place_order.addActionListener(new ActionListener()
   {
      @Override
      public void actionPerformed(ActionEvent e)
      {
         String enteredProductId = id.getText();

       // Check if the entered product ID exists in the Product class
         if (!enteredProductId.equals(Product.getId()))
         {
            JOptionPane.showMessageDialog(null, "Product ID does not exist. Please enter a valid product ID.", "SCM", JOptionPane.ERROR_MESSAGE, icon_2);
         }
         else
         {
           // Product ID exists, proceed with the order
           try
           {
               double quantity = Double.parseDouble(quant.getText());
               double orderAmount = quantity * Product.getPrice();

               // Perform actions when the button is clicked
               // For example, update the product quantity in a local data structure
               JOptionPane.showMessageDialog(null, "Product Ordered! Amount: " + orderAmount, "SCM", JOptionPane.INFORMATION_MESSAGE, icon_1);
               frame.setVisible(false);
            }
            catch (NumberFormatException ex)
            {
               JOptionPane.showMessageDialog(null, "Invalid quantity format. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE, icon_2);
            }
         }
      }
   });


      
      place_order.setBounds(980, 600, 130, 45);
      frame.add(idLabel);
      frame.add(quantLabel);

      frame.add(id);
      frame.add(quant);

      frame.add(place_order);
      frame.setVisible(true);
      
      //add.addActionListener(e -> new Purchase_Product());

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