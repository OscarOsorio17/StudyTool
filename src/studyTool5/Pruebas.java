package studyTool5;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Pruebas {
    static int counter = 0;

    public static void main(String[] args) {
        Frame frame = new Frame("Counter Example");
        frame.setSize(400, 300);

        Button button = new Button("Click");
        button.setBounds(100, 50, 100, 40);
        Label label = new Label();

        label.setBounds(100, 100, 200, 100);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                String counterAsString = String.valueOf(counter);
                label.setText("Click Counter: " + counterAsString);
            }
        });


        frame.add(button);
        frame.add(label);

        frame.setLayout(null);
        frame.setVisible(true);

    }
}
