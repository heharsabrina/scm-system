import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Add_Supplier_Acc
{
   private JFrame frame;
   private ImageIcon icon;

   private JLabel headerLabel;
   private JLabel imageLabel;
   private JLabel nameLabel;
   private JLabel mailLabel;
   private JLabel companyLabel;

   private JTextField name;
   private JTextField mail;
   private JTextField company;
   
   public Add_Supplier_Acc()
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
      nameLabel = new JLabel();
      nameLabel.setText("Name");
      nameLabel.setBounds(760, 350, 150, 100);
      nameLabel.setFont(new Font("SanSerif", Font.PLAIN, 30));
      nameLabel.setForeground(Color.black);
      

      mailLabel = new JLabel("Email ID");
      mailLabel.setBounds(760, 450, 200, 100);
      mailLabel.setFont(new Font("SanSerif", Font.PLAIN, 30));
      mailLabel.setForeground(Color.black);
      

      companyLabel = new JLabel("Name of the Company");
      companyLabel.setBounds(760, 550, 350, 100);
      companyLabel.setFont(new Font("SanSerif", Font.PLAIN, 30));
      companyLabel.setForeground(Color.black);
      
      
      name = new JTextField();
      name.setBounds(1150, 380, 200, 30);
      
      
      mail = new JTextField();
      mail.setBounds(1150, 480, 200, 30);
      

      company = new JTextField();
      company.setBounds(1150, 580, 200, 30);
      
      
      JButton add = createStyledButton("Add");
      add.addActionListener(new ActionListener()
      {
         @Override
         public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Supplier Account Created! Name: " + name.getText());
            frame.setVisible(false);
         }
      });
      add.setBounds(980, 700, 130, 45);
      frame.add(nameLabel);
      frame.add(mailLabel);
      frame.add(companyLabel);
      frame.add(name);
      frame.add(mail);
      frame.add(company);
      frame.add(add);
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