import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chat {

    private final JFrame mainFrame;

    public Chat() {
        mainFrame = new JFrame();

        mainFrame.setTitle("Chat v1.0");
        mainFrame.setBounds(new Rectangle(500, 700));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        mainFrame.setLayout(null);


        JTextField field = new JTextField();
        field.setBounds(1, 620, 400, 40);
        field.getText();
        mainFrame.add(field);

        JTextArea area = new JTextArea();
        area.setEditable(false);
        area.setBounds(new Rectangle(500, 600));
        mainFrame.add(area);


        JButton button = new JButton("Send");
        button.setBounds(400, 620, 100, 40);
        button.addActionListener(e -> {
            area.setText((field.getText()));
        });
        mainFrame.add(button);


        mainFrame.setVisible(true);
    }
}













