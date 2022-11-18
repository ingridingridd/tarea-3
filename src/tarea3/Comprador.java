package tarea3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Comprador {
    private Expendedor exp;
    private int vuelto;
    private String saborBebida;
    private int x,y;
    private int dinero;
    private int auxB;
    public ArrayList<Moneda> monedero;
    private ArrayList<Bebida> beb;
    public int Mon100, Mon500, Mon1000;
    private int serieMoneda=500; 
    
    public Comprador(Expendedor exp, int x, int y) throws PagoIncorrectoException, PagoInsuficienteException, NoHayBebidaException{
        this.x=x; this.y=y;
        this.exp=exp;
        monedero=new ArrayList<>();
        beb= new ArrayList<>();
    }
    
    public void addMoneda100(){
        Moneda m=new Moneda100(serieMoneda++,0,0);
        m.setXY(x+Mon100+30,y+233);
        System.out.println("Serie: "+m.getSerie());
        monedero.add(m);
        Mon100-=2;
        dinero+=m.getValor();
    }
    
    public void addMoneda500(){
        Moneda m=new Moneda500(serieMoneda++,0,0);
        m.setXY(x+Mon500+35*4, y+233);
        System.out.println("Serie: "+m.getSerie());
        monedero.add(m);
        Mon500-=2;
        dinero+=m.getValor();
    }
    public void addMoneda1000(){
        Moneda m=new Moneda1000(serieMoneda++,0,0);
        m.setXY(x+Mon1000+(30*4)*2+30, y+233);
        System.out.println("Serie: "+m.getSerie());
        monedero.add(m);
        Mon1000-=2;
        dinero+=m.getValor();
    }
    
    public Moneda getVuelto(){
        Moneda m=exp.getVuelto();
        if(m!=null){
            dinero+=m.getValor();
            System.out.println("Vuelto: "+m.getValor());
            m.setXY(x+10+vuelto, y+317);
            vuelto+=2;
            monedero.add(m);
        }return m;
    }
    
    public void resetMonedas(){
        Mon100=0;
        Mon500=0;
        Mon1000=0;
        vuelto=0;
    }
    
    public void cualBebida(int cual) throws PagoIncorrectoException, PagoInsuficienteException, NoHayBebidaException{
        resetMonedas();
        dinero=0;
        exp.comprarBebida(monedero, cual);
        monedero.clear();
    }
    
    public void getBebida(){
        Bebida b=exp.getDepUnico();
        if(b!=null){
           auxB+=30;
           System.out.println("Bebida: "+b.beber()+ "Serie: "+b.getSerie());
           b.setXY(x+10, y+370+auxB);
           beb.add(b);
        }
    }
    
    public void paint(Graphics g){
        g.setColor(Color.white);
        g.drawRect(x,y,350,600);
        Color color=new Color(102,40,153);
        g.setColor(color);
        g.fillRect(x+1, y+1, 349, 599);
        
        g.setColor(Color.white);
        g.drawString("Eliga sabor de la bebida", x+12,y+20);
        g.setColor(Color.red);
        g.fillRect(x+17, y+30, 120, 25);
        g.setColor(Color.white);
        g.drawString("Coca Cola", x+47, y+46);
        
        g.setColor(Color.green);
        g.fillRect(x+17, y+60, 120, 25);
        g.setColor(Color.white);
        g.drawString("Sprite", x+60, y+76);
        
        Color o=new Color(255,153,0);
        g.setColor(o);
        g.fillRect(x+17, y+90, 120, 25);
        g.setColor(Color.white);
        g.drawString("Fanta", x+60, y+106);
        
        g.setColor(Color.white);
        g.drawString("Eliga una cantidad de dinero", x+12, y+140);
        
        /*100
        g.setColor(Color.white);
        g.drawRect(x+20, y+150,50,50);
        
        //500
        g.drawRect(x+80, y+150,50,50);
        
        1000
        g.drawRect(x+140, y+150,50,50);*/
        
        Color brown=new Color(153,102,0);
        g.setColor(brown);
        g.fillOval(x+20, y+150, 50, 50);
        g.setColor(Color.black);
        g.drawOval(x+20, y+150, 50, 50);
        g.setColor(Color.white);
        g.drawString("100", x+34, y+179);
        
        Color grey=new Color(204,204,204);
        g.setColor(grey);
        g.fillOval(x+80, y+150, 50, 50);
        g.setColor(Color.black);
        g.drawOval(x+80, y+150, 50, 50);
        g.setColor(Color.white);
        g.drawString("500", x+95, y+179);
        
        Color gold=new Color(255,204,51);
        g.setColor(gold);
        g.fillOval(x+140, y+150, 50, 50);
        g.setColor(Color.black);
        g.drawOval(x+140, y+150, 50, 50);
        g.setColor(Color.white);
        g.drawString("1000", x+151, y+179);
        
        g.setColor(Color.white);
        g.drawString("Nuestro dinero", x+12,y+223);
        g.drawString("Vuelto", x+12,y+223+(223-140));
        g.drawString("Bebida Comprada", x+12,y+223+2*(223-140));
        
        for(Moneda moneda:monedero){
            moneda.paint(g);
        }
        
        for(Bebida bebida:beb){
            bebida.paint(g);
        }
    }
    public int cuantoVuelto(){
        return vuelto;
    }
}