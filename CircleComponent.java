
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
public class CircleComponent extends JComponent
{
    int x,y,h,w,v;
    Ellipse2D.Double cir;
    Rectangle box;
    
   public CircleComponent(int x, int y, int w){
        this.x = x;
        this.y = y;
        this.w = w;
       this.cir = new Ellipse2D.Double(x,y,w,w);
        }
        
   public CircleComponent(int x, int y, int h, int w){
    
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.box = new Rectangle(x,y,h,w);
    }

    public CircleComponent(int x, int y, int h, int w, int v){
    
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.v = 1;
        this.box = new Rectangle(x,y,h,w);
    }
    
    public void paintComponent(Graphics g)
    {  
      Graphics2D g2 = (Graphics2D)g;
      
      if (this.v != 1){
      if (this.cir != null)
      g2.draw(cir);
       if (this.box != null)
       g2.draw(box);}
      
       else{ g2.setColor(Color.RED);
           Rectangle rec = new Rectabgle
           g2.fill(this.box);
          System.out.println("hi");}
           
       
      
       //hi.translate(x+10,y+10);
    }
    
     public void paintComponent(Graphics g, int x){
         Graphics2D g2 = (Graphics2D)g;
          g2.setColor(Color.WHITE);
          g2.fill(box);
          System.out.println("hi");
        }
    
    public void update(Graphics g){
    
    
    
    
    
    }
  
 
   
   
   public void nextFrame(){
    
       
       this.box.translate(x+10,y+10);
       repaint();}

   public void getRand(int x, int y, int w, int h){
    
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    }
}
