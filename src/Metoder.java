import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Metoder extends JFrame {
    //Skapar upp Paneler
    JPanel jp;
    JPanel northPanel;
    JPanel centerPanel;
    JPanel southPanel;


    //skapar upp 16 knappar för centerPanel
    JButton KnappEtt = new JButton("1");
    JButton knappTvå = new JButton("2");
    JButton knappTre = new JButton("3");
    JButton knappFyra = new JButton("4");
    JButton knappFem = new JButton("5");
    JButton knappSex = new JButton("6");
    JButton knappSju = new JButton("7");
    JButton knappÅtta = new JButton("8");
    JButton knappNio = new JButton("9");
    JButton knappTio = new JButton("10");
    JButton knappElva = new JButton("11");
    JButton knappTolv = new JButton("12");
    JButton knappTretton = new JButton("13");
    JButton knappFjorton = new JButton("14");
    JButton knappFemton = new JButton("15");
    JButton knappSexton = new JButton(" ");




    //Skapar upp 2 knappar för northPanel
    JButton nyttSpel = new JButton("Nytt Spel");
    JButton rättaSpel = new JButton("Rätta ditt spel");


    //South panel
    JLabel vinstMeddelande = new JLabel(" ");
    JLabel antalVinster = new JLabel(" ");
    Huvudkod h;
    Metoder(Huvudkod h){
        this.h = h;
    }

    //Skapar upp metod för att skapa knappar
    public void skapaKnappar (ArrayList<JButton> knappLista){
        knappLista.add(KnappEtt);
        knappLista.add(knappTvå);
        knappLista.add(knappTre);
        knappLista.add(knappFyra);
        knappLista.add(knappFem);
        knappLista.add(knappSex);
        knappLista.add(knappSju);
        knappLista.add(knappÅtta);
        knappLista.add(knappNio);
        knappLista.add(knappTio);
        knappLista.add(knappElva);
        knappLista.add(knappTolv);
        knappLista.add(knappTretton);
        knappLista.add(knappFjorton);
        knappLista.add(knappFemton);
        knappLista.add(knappSexton);
    }

    public void läggTillIJP(JPanel jp, JPanel northPanel, JPanel centerPanel, JPanel southPanel){

        jp.setLayout(new BorderLayout());
        jp.add(northPanel, BorderLayout.NORTH);
        jp.add(centerPanel, BorderLayout.CENTER);
        jp.add(southPanel, BorderLayout.SOUTH);
    }

}
