package presentation.login;

import presentation.events.WindowEvent;

import javax.swing.*;

public class Login {
    JButton btn_login;
    JButton btn_register;
    JButton btn_abort;
    JTextField tf_username;
    JTextField tf_passwd;
    JPanel pan_login;

    WindowEvent windowevent = null;

    public Login() {
        JFrame frame = new JFrame("Login");
        windowevent = new WindowEvent(frame);

        btn_abort.addActionListener(windowevent);
        btn_abort.setName("btn_name");

        frame.setContentPane(pan_login);
        frame.pack();
        frame.setVisible(true);
    }
}
