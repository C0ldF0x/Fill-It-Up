package NothingHere;

import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author C0ldF0x
 * All rights reserved.
 * 
 */
public class Box extends JLabel{
    
    final static int N=0,S=1,E=2,W=3;
    static Color colorList[] = {Color.red, Color.blue, Color.green, Color.pink, Color.orange, Color.cyan, Color.gray, Color.magenta};
    Color color;
    boolean selected;
    static int idCounter=0;
    int ID;
    
    boolean openRoute[]=new boolean[4];
    
    public Box(){
        color=Color.white;
        selected=false;
        ID=idCounter;
        idCounter++;
        openRoute[0]=true;
        openRoute[1]=true;
        openRoute[2]=true;
        openRoute[3]=true;
        this.setBackground(color);
        setVisible(true);
        this.setOpaque(true);
    }

    void colorize() {
        color=colorList[(int)(Math.random()*colorList.length)];
        setBackground(color);
    }
    
}
