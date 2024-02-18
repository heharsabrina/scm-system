import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Search_Product
{
   private JFrame frame;
   private ImageIcon icon;

   private JLabel headerLabel;
   private JLabel imageLabel;

   private JLabel idLabel;

   private JTextField id;
   
   public Search_Product()
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

      headerLabel = new JLabel("Search for a Product", JLabel.CENTER);
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
      idLabel.setText("Product ID");
      idLabel.setBounds(760, 350, 150, 100);
      idLabel.setFont(new Font("SanSerif", Font.PLAIN, 30));
      idLabel.setForeground(Color.black);
      
      id = new JTextField();
      id.setBounds(1150, 380, 200, 30);
      
     
      JButton search = createStyledButton("Search");
      search.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Product Details Available Quantity: Price: " + id.getText());
            frame.setVisible(false);
         }
      });
      search.setBounds(980, 500, 130, 45);
      frame.add(idLabel);
      frame.add(id);
      frame.add(search);
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