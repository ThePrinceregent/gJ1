import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

//Objektklasse f�r den Button f�r einzelflaschen. Dasselbe f�r Katen und palette
public class Spezi1 extends JLabel{

	private String name;
	private Alpha frame; 
	
	private String path;
	
	
	public Spezi1(String datapath, Alpha Alpha) {
		
		super();
		this.name=datapath;
		this.frame = Alpha;
		this.path = "Pic/"+datapath+".jpg";
		ImageIcon image = new ImageIcon(this.path);	
        this.setIcon(image);
		
		this.name=datapath;
		
	path = "Pic/SpeziE.jpg";
	
    
    addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent e) {
        	
        	
        	
        	
        //wird geklickt, reaktion hier	
        }
    
	});
	
}
}
