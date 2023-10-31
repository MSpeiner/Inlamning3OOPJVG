import javax.swing.*;
import java.util.ArrayList;

public class Huvudkod {
    //Skapar upp paneler
    final static JPanel jp = new JPanel();
    final static JPanel northPanel = new JPanel();
    final static JPanel centerPanel = new JPanel();
    final static JPanel southPanel = new JPanel();
    //SKapar upp instans av Metoder
    Metoder m = new Metoder(this);
    //Skapar upp knapplista
    ArrayList<JButton> knappLista = new ArrayList<>();
    Huvudkod(){}
    public static void main(String[] args) {

    }
}


