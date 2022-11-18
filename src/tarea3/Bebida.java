package tarea3;

import java.awt.Graphics;

abstract class Bebida{
    private int serie;
    protected int x,y;
    public Bebida(int serie, int x, int y) {
        this.serie = serie;
        this.x = x;
        this.y = y;
    }
    public int getSerie(){
        return this.serie;
    }
    
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract String beber();
    public abstract void paint(Graphics g);
}
