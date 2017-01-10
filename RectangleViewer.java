import javax.swing.JFrame;

public class RectangleViewer
{
    
    final static int ATIS = 60;
   public static void main(String[] args) throws InterruptedException
   {
      JFrame frame = new JFrame();

      frame.setSize(1200, 700);
      frame.setTitle("Two rectangles");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      RectangleComponent component = new RectangleComponent(100,80,50,20);
      frame.add(component);
      frame.setVisible(true);
      
       RectangleComponent component2 = new RectangleComponent();
      frame.add(component2);
      frame.setVisible(true);
      
      RectangleComponent component3 = new RectangleComponent(50,50,50,50);
      frame.add(component3);
      frame.setVisible(true);
      
   }
}
