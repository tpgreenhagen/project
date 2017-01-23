import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class RectangleViewer
{
    
    final static int ATIS = 10;
   public static void main(String[] args) throws InterruptedException
   {
      JFrame frame = new JFrame();


      frame.setSize(1200, 700);
      frame.setTitle("Two rectangles");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//       RectangleComponent component = new RectangleComponent(100,80,50,20);
//       frame.add(component);
//       frame.setVisible(true);
//       
//        RectangleComponent component2 = new RectangleComponent();
//       frame.add(component2);
//       frame.setVisible(true);
//       
//       RectangleComponent component3 = new RectangleComponent(50,50,50,50);
//       frame.add(component3);
//       frame.setVisible(true);
//       
//       FaceComponent face = new FaceComponent();
//       frame.add(face);
//       frame.setVisible(true);
        
        CircleComponent com1 = new CircleComponent((int)(Math.random()*1000),(int)(Math.random()*600),50);
        CircleComponent com2 = new CircleComponent(0,0,1200,700,5);
        
       
        
        int di;
        
             for (int sec = 0; sec <ATIS; sec++){
            
                     for (int m = 0; m<15;m++){
                  di = (int)(Math.random()*200);
               CircleComponent hi = new CircleComponent((int)(Math.random()*1000),(int)(Math.random()*600),di);
               frame.add(hi);
               
                       frame.setVisible(true);
            }
            
            for (int m = 0; m<15;m++){
                CircleComponent hi = new CircleComponent((int)(Math.random()*1000),(int)(Math.random()*600),(int)(Math.random()*100),(int)(Math.random()*100));
               frame.add(hi);
                       frame.setVisible(true);
                            }

                
                com2.nextFrame();
                Thread.sleep(1000);
                frame.add(com2);
              

                
        }
      
   }
}
