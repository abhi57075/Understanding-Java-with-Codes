import java.awt.*;
import java.applet.*;

public class Lec2_MethodsOfGraphicsClass extends Applet{
    Font f1;
    public void init(){
        resize(400,400);
        setBackground(Color.blue);
        setForeground(Color.green);
        f1 = new Font("Aerial",Font.BOLD,36); // 36 is the size
    }
    public void paint(Graphics g){
        g.setFont(f1);
        g.drawString("This is a string", 100, 50);

        g.setColor(Color.red); // Setting the foreground colour
        g.drawRect(100,80,300,30); // x,y,w,h
        g.fillRect(100,130,300,30);
        g.drawOval(100,180,300,30);
        g.fillOval(100,230,300,30);
        g.drawLine(100,280,400,280); // x1,x2,y1,y2

        g.setColor(Color.pink); // Setting the foregeound color
        g.drawArc(100,330,300,30,90,270); // x,y,w,h,startangle,arcangle
        g.fillArc(100,380,300,30,50,100);
        
    }
}

/*
<html>
    <head>
    </head>
    <body>
        <applet code = "Lec2_MethodsOfGraphicsClass.class" width = 300 height = 300>
        </applet>
    </body>
</html>
 */