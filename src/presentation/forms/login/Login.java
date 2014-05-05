package presentation.forms.login;

import presentation.events.LoginRegisterEvent;
import presentation.events.WindowEvent;

import javax.swing.*;

public class Login {
    private JButton btn_login;
    private JButton btn_register;
    private JButton btn_abort;
    public JTextField tf_username;
    public JTextField tf_passwd;
    private JPanel pan_login;

    private WindowEvent windowevent = null;
    private LoginRegisterEvent logRegEvent = null;

    public Login() {
        JFrame frame = new JFrame("Login");
        windowevent = new WindowEvent(frame);
        logRegEvent = new LoginRegisterEvent(frame);

        this.setButtons();

        frame.setContentPane(pan_login);
        frame.pack();
        frame.setVisible(true);
    }

    private void setButtons() {
        btn_abort.addActionListener(windowevent);
        btn_abort.setName("btn_abort");

        btn_login.addActionListener(logRegEvent);
        btn_login.setName("btn_login");

        btn_register.addActionListener(logRegEvent);
        btn_register.setName("btn_register");
    }
}
