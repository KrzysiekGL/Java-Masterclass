package pl.krzysiekgl;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {
    public MyWindow(String title) {
        super(title);
        
        setSize(1920, 1080);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        Font sansSerifLarge = new Font(Font.SANS_SERIF, Font.BOLD, 18);
        Font sansSerifSmall = new Font(Font.SANS_SERIF, Font.BOLD, 12);
        
        g.setFont(sansSerifLarge);
        g.drawString("Hello, World!", 60, 60);
        
        g.setFont(sansSerifSmall);
        g.drawString("KrzysiekGL", 60, 130);
    }
}
