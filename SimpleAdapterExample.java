package tarea1;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JFrame;
public class SimpleAdapterExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.addComponentListener(new MyAdapter());
        jFrame.setSize(300, 300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
class MyAdapter extends ComponentAdapter {
    @Override
    public void componentMoved(ComponentEvent e) {
        int x = e.getComponent().getX();
        int y = e.getComponent().getY();
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        
    }
}
