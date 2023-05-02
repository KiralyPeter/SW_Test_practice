import javax.swing.JFrame;

public class MainFrame extends JFrame{

    public MainFrame() {
        this.setFrame();
    }

    private void setFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }
    
}
