import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainFrame extends JFrame{

    InputPanel tomegPanel;
    InputPanel magassagPanel;
    InputPanel indexPanel;
    JPanel buttoPanel;
    JButton calcButton;


    public MainFrame() {
        this.initComponent();
        this.addComponent();
        this.hadleEvent();
        this.setFrame();
    }

    private void initComponent(){
        this.tomegPanel = new InputPanel("Tömeg (Kg)");
        this.magassagPanel = new InputPanel("Magasság (m)");
        this.buttoPanel = new JPanel();
        this.indexPanel = new InputPanel("Testtömegindex");
        this.calcButton = new JButton("Számít");
    }

    private void addComponent(){
        this.add(this.tomegPanel);
        this.add(this.magassagPanel);
        this.add(this.buttoPanel);
        this.add(this.indexPanel);
        this.buttoPanel.add(this.calcButton);
    }

    private void hadleEvent(){
        this.calcButton.addActionListener( e -> {
            startCalc();
        }); //névtelen függvény
    }

    private void startCalc(){
        String tomegStr = this.tomegPanel.getValue();
        if(!this.checkInput(tomegStr)){
            JOptionPane.showMessageDialog(this, "Csak számjegy!");
            return; // hogy ne számoljon 
        }
        double tomeg = Double.parseDouble(tomegStr);
        
        String magassagStr = this.magassagPanel.getValue();
        if(!this.checkInput(magassagStr)){
            JOptionPane.showMessageDialog(this, "Csak számjegy!");
            return; // hogy ne számoljon 
        }
        double magassag = Double.parseDouble(magassagStr);

        Double testtomegIndex = this.calcBodyIndex(tomeg, magassag);
        this.indexPanel.setValue(testtomegIndex.toString());
    }

    public double calcBodyIndex(double weight, double height){
        return weight / Math.pow(height, 2);
    }

    public boolean checkInput(String input){
        boolean ok = false;
        if(input.matches("[0-9.]+")){
            ok = true;
        }
        return ok;
    }

    private void setFrame() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        // this.setSize(300, 200);
        this.setVisible(true);
    }
    
}
