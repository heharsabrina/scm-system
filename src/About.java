import java.awt.*;
import javax.swing.*;

public class About
{
   private JFrame frame;
   private ImageIcon icon;
   private JLabel scm_process;

   private JLabel headerLabel;
   private JLabel imageLabel;
   private JLabel title;
   private JLabel desc;
   //private JLabel companyLabel;

   
   public About()
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

      headerLabel = new JLabel("About this Project", JLabel.CENTER);
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
      scm_process = new JLabel(new ImageIcon("images/scm_process.png"));
      scm_process.setBounds(760, 250, 600, 384);
      scm_process.setBorder(BorderFactory.createLineBorder(Color.black, 2));
      frame.add(scm_process);
      
      
      title = new JLabel();
      title.setText("Supply chain management (SCM) is the management of the flow of goods and services.");
      title.setBounds(560, 650, 2000, 100);
      title.setFont(new Font("SanSerif", Font.PLAIN, 30));
      title.setForeground(Color.black);
      

      desc = new JLabel();
      desc.setText("Developed by: Sabrina Hehar ( 4SO22CS135 )");
      desc.setBounds(800, 900, 500, 100);
      desc.setFont(new Font("SanSerif", Font.PLAIN, 25));
      desc.setForeground(Color.gray);
      

      // companyLabel = new JLabel("Name of the Company");
      // companyLabel.setBounds(760, 550, 350, 100);
      // companyLabel.setFont(new Font("SanSerif", Font.PLAIN, 30));
      // companyLabel.setForeground(Color.black);
      
      
   
      frame.add(title);
      frame.add(desc);
      //frame.add(companyLabel);
      frame.setVisible(true);
      
      //add.addActionListener(e -> new Purchase_Product());

  }
}