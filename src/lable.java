import javax.swing.*;
import java.awt.*;

public class lable extends JFrame{

    public lable(){
        setTitle("레이블 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel textLabel = new JLabel("제임스 고슬링 입니다.");

        ImageIcon img = new ImageIcon("images/Gosling.jpg");
        JLabel imageLabel = new JLabel(img);

        ImageIcon icon = new ImageIcon("images/icon.png");
        JLabel label = new JLabel("커피한잔 하실래예, 전화주이소", icon, SwingConstants.CENTER);

        c.add(textLabel); c.add(imageLabel); c.add(label);
        setSize(300,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new lable();
    }
}