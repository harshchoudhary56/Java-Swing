import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionFrame extends JFrame {
    private JPanel panel;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JTextField t1;
    private JTextField t2;
    private JButton b1;

    public void initComponents() {
        panel = new JPanel(); // Initialize the panel
        panel.setLayout(null);
        l1.setBounds(50, 50, 100, 20);
        panel.add(l1);

        l2.setBounds(50, 80, 120, 20);
        panel.add(l2);

        t1.setBounds(200, 50, 100, 20);
        panel.add(t1);

        t2.setBounds(200, 80, 100, 20);
        panel.add(t2);

        b1.setBounds(100, 110, 100, 20);
        panel.add(b1);

        l3.setBounds(50, 140, 300, 30);
        panel.add(l3);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                l3.setText("Sum of " + a + " and " + b + " is " + c);
            }
        });
    }

    public AdditionFrame() {
        l1 = new JLabel("First number");
        l2 = new JLabel("Second number");
        l3 = new JLabel();
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("Add");

        initComponents();
        setContentPane(panel);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        AdditionFrame frame = new AdditionFrame();
    }
}
