// import ;
import java.awt.*;
import javax.swing.*;

public class LedBit extends JPanel {
    private boolean state=false;
    private Color color=Color.decode("#000000");
    private boolean small=false;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth();
        int h = getHeight();
        g2.setColor(color);
        int m=0;
        if(small) m=w/2;
        if(state){
            g2.fillArc(0+m, 0+m, w-1-m, h-1-m, 0, 360);
        } else {
            g2.drawArc(0+m, 0+m, w-1-m, h-1-m, 0, 360);
        }
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color c){
        color=c;
        repaint();
    }

    public boolean getState(){
        return state;
    }

    public void setState(boolean s){
        state=s;
        repaint();
    }

    public boolean getSizeState(){
        return small;
    }

    public void setSizeState(boolean s){
        small=s;
        repaint();
    }
}
