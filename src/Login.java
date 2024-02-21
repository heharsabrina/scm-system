import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame
{
    //These variables represent various GUI components such as labels, text fields, password fields, and a button.
    JLabel usernameLabel;
    JLabel passLabel;

    JLabel background;
    JLabel headerLabel;
    JLabel welcome;
    JLabel desc;

    JTextField username;
    JPasswordField pass;

    JButton submit;
    ImageIcon icon;

    public Login()
	{

        icon = new ImageIcon("images/icon.png");
        this.setIconImage(icon.getImage()); //Change icon of the image
        setTitle("SCM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		this.background = new JLabel(new ImageIcon("images/login_bg.png"));
		//mainFrame.getContentPane().setBackground(Color.white);
		this.init();
		add(background);
		background.setVisible(true);  
        this.pack();
        this.setLayout(null);
		this.setSize(1920,1080);
        this.setLocationRelativeTo(null);
    }

    public void init()
	{
        //The init() method initializes the GUI components, such as labels, text fields, password fields, and the login button. It sets their positions, sizes, fonts, and colors.
        headerLabel = new JLabel();
		headerLabel.setText("Supply Chain Management System");
        headerLabel.setBounds(580, -150, 970, 450);
        headerLabel.setFont(new Font("Serif", Font.BOLD, 55));
        headerLabel.setForeground(Color.black);
        add(headerLabel);

        usernameLabel = new JLabel();
        usernameLabel.setText("Username");
        usernameLabel.setBounds(750, 300, 200, 150);
        usernameLabel.setFont(new Font("SanSerif", Font.PLAIN, 30));
        usernameLabel.setForeground(Color.white);
        add(usernameLabel);

        passLabel = new JLabel("Password");
        passLabel.setBounds(750, 400, 200, 150);
        passLabel.setFont(new Font("SanSerif", Font.PLAIN, 30));
        passLabel.setForeground(Color.white);
        add(passLabel);

        welcome = new JLabel();
        //welcome.setText("Welcome!");
        welcome.setBounds(870, 860, 1000, 55);
        welcome.setFont(new Font("SanSerif", Font.ITALIC, 45));
        welcome.setForeground(Color.black);
        
        username = new JTextField(1000);
        username.setFont(new Font("SanSerif", Font.PLAIN, 20));
        
        username.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyReleased(KeyEvent e) //Add a KeyListener to the username text field
            {
                super.keyReleased(e);
                // Update the welcome label text with the content of the JTextField
                welcome.setText("Welcome, "+username.getText()+"!");
            }
        });
        //username = new JTextField();
        username.setBounds(950, 360, 200, 30);
        add(username);
        add(welcome);
        
        
        pass = new JPasswordField();
        pass.setBounds(950, 460, 200, 30);
        pass.setFont(new Font("SanSerif", Font.PLAIN, 20));
        pass.setEchoChar('*'); //Set the placeholder character to asterisk
        add(pass);

        desc = new JLabel();
        desc.setText("Developed by: Sabrina Hehar ( 4SO22CS135 )");
        desc.setBounds(700, 900, 500, 100);
        desc.setFont(new Font("SanSerif", Font.PLAIN, 25));
        desc.setForeground(Color.gray);
        add(desc);

        this.submit = new JButton("Login");
        this.submit.setBounds(890, 600, 130, 45);
        this.submit.setFont(new Font("SanSerif", Font.BOLD, 20));
        this.submit.setBackground(Color.white);
        this.submit.setForeground(Color.black);
        add(submit);
        submit.addActionListener(this::submitActionPerformed); //This line adds an ActionListener to the submit JButton, which listens for button clicks and triggers the submitActionPerformed method when clicked.
        
    }

    //ImageIcon icon_1 = new ImageIcon("images/check-mark.png");
    ImageIcon icon_2 = new ImageIcon("images/cross.png");
    public void submitActionPerformed(ActionEvent evt)
	{
        //This method is invoked when the login button is clicked. It checks if the entered username and password match the expected values ("admin" for both in this case). If the login credentials are correct, it hides the login window and opens a new frame (Frame2new). Otherwise, it displays an error message.
        if (username.getText().equals("sjec") && new String(pass.getPassword()).equals("123456")) //The conversion to String is only needed for the password because getPassword() returns a character array
        {
            this.setVisible(false); //This line hides the current login window 
            new Menu();
        }
		else 
		{
            JOptionPane.showMessageDialog(null, "Invalid password", "SCM", JOptionPane.INFORMATION_MESSAGE, icon_2); //The null argument indicates that the dialog should be centered on the screen
        }
    }
}
class MyGui
{
    //This is the entry point of the program. It creates an instance of the Login class and makes it visible.
    public static void main(String[] a)
    {
        Login l = new Login();
        l.setVisible(true);
    }
}
