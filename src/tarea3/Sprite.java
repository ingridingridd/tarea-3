package tarea3;

import java.awt.Color;
import java.awt.Graphics;

class Sprite extends Bebida{
    public Sprite(int serie, int x,int y){
        super(serie, x, y);
    }
    @Override
    public String beber(){
        return "Sprite";
    }
    @Override
    public void paint (Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(x+4, y+4, 142, 25);
        g.setColor(Color.white);
        g.drawString(Integer.toString(getSerie()), x+60, y+21);
    }
}