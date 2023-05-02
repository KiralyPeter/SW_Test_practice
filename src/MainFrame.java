import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{

    InputPanel tomegPanel;
    InputPanel magassagPanel;
    InputPanel indexPanel;
    JPanel buttoPanel;

    public MainFrame() {
        this.initComponent();
        this.addComponent();
        this.setFrame();
    }

    private void initComponent(){
        this.tomegPanel = new InputPanel("Tömeg");
        this.magassagPanel = new InputPanel("Magasság");
        this.buttoPanel = new JPanel();
        this.indexPanel = new InputPanel("Testtömegindex");
    }

    private void addComponent(){
        this.add(this.tomegPanel);
        this.add(this.magassagPanel);
        this.add(this.buttoPanel);
        this.add(this.indexPanel);
    }

    private void setFrame() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        // this.setSize(300, 200);
        this.setVisible(true);
    }
    
}
