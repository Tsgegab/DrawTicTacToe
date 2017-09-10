import java.applet.Applet;
import java.awt.Graphics;
public class DrawTicTacToe extends Applet{
    public void paint (Graphics g) {
        g.drawOval( 325, 50, 100, 100);
        g.drawOval(550,460,100,100);
        g.drawOval(100,460,100,100);
        g.drawOval(100,270,100,100);
        g.drawOval(300,270,100,100);
        g.drawLine( 250,0,250, 600);
        g.drawLine(500,0,500,600);
        g.drawLine(700,0,250,430);
        g.drawLine(0,250,700,250);
        g.drawLine(0,10, 200, 200);
        g.drawLine(250,0,0,250);
        g.drawLine(700,200,500,0);
        g.drawLine(700, 400, 0, 400);
    }

}

