package presentation.forms.register;

import presentation.events.LoginRegisterEvent;
import presentation.events.WindowEvent;

import javax.swing.*;

public class Register {
    private JButton btn_save;
    private JButton btn_abort;
    public JTextField tf_username;
    public JTextField tf_passwd;
    public JTextField tf_passwd2;
    public JTextField tf_email;
    private JPanel pan_register;

    private WindowEvent windowevent = null;
    private LoginRegisterEvent logregevent = null;

    public Register() {
        JFrame frame = new JFrame("Registrierung");
        windowevent = new WindowEvent(frame);
        logregevent = new LoginRegisterEvent(frame);

        this.setButtons();

        frame.setContentPane(pan_register);
        frame.pack();
        frame.setVisible(true);
    }

    private void setButtons() {
        btn_abort.addActionListener(windowevent);
        btn_abort.setName("btn_abort");

        btn_save.addActionListener(logregevent);
        btn_save.setName("btn_saveRegister");
    }
}
