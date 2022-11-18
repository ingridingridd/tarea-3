package tarea3;

import java.awt.Color;
import java.awt.Graphics;

class CocaCola extends Bebida{
    public CocaCola(int serie, int x, int y) {
        super(serie, x, y);
    }
    @Override
    public String beber(){
        return "Cocacola";
    }
    @Override
    public void paint (Graphics g){
        g.setColor(Color.red);
        g.fillRect(x+4, y+4, 142, 25);
        g.setColor(Color.white);
        g.drawString(Integer.toString(getSerie()), x+60, y+21);
    }
}