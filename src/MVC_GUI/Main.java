package MVC_GUI;

/**
 * JAVA_Review
 * MVC_GUI
 *
 * @author Ablecisi
 * @version 1.0
 * 2024/1/10
 * 星期三
 * 19:58
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Trapezoid {
    private double top, bottom, height;

    public void setTop(double top) { this.top = top; }
    public void setBottom(double bottom) { this.bottom = bottom; }
    public void setHeight(double height) { this.height = height; }

    public double getTop() { return top; }
    public double getBottom() { return bottom; }
    public double getHeight() { return height; }

    public double calculateArea() {
        return ((top + bottom) * height) / 2;
    }
}

class TrapezoidWindow extends JFrame {
    private JTextField topField, bottomField, heightField;
    private JTextArea areaField;
    private JButton calculateButton;
    private Trapezoid trapezoid;

    public TrapezoidWindow() {
        trapezoid = new Trapezoid();

        topField = new JTextField(10);
        bottomField = new JTextField(10);
        heightField = new JTextField(10);
        areaField = new JTextArea(5, 20);
        calculateButton = new JButton("计算");

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double top = Double.parseDouble(topField.getText());
                    double bottom = Double.parseDouble(bottomField.getText());
                    double height = Double.parseDouble(heightField.getText());

                    trapezoid.setTop(top);
                    trapezoid.setBottom(bottom);
                    trapezoid.setHeight(height);

                    double area = trapezoid.calculateArea();
                    areaField.setText(Double.toString(area));
                } catch (NumberFormatException ex) {
                    areaField.setText("“数据格式错误，无法计算面积！");
                }
            }
        });
        // 将组件添加到JFrame并设置布局，等等。
        setLayout(new FlowLayout());
        add(new JLabel("Top:"));
        add(topField);
        add(new JLabel("Bottom:"));
        add(bottomField);
        add(new JLabel("Height:"));
        add(heightField);
        add(calculateButton);
        add(new JScrollPane(areaField));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }
}
