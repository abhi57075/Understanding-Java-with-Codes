import java.awt.*;
import java.applet.*;

public class Lec3v1 extends Applet{
    int x,y,w,h;
    public void init(){
        resize(400,400);
        setBackground(Color.blue);
        setForeground(Color.green);
        x = Integer.parseInt(getParameter("x"));
        y = Integer.parseInt(getParameter("y"));
        w = Integer.parseInt(getParameter("w"));
        h = Integer.parseInt(getParameter("h"));
    }
    public void paint(Graphics g){
        g.drawRect(x,y,w,h);
    }
}

/* 
<html>
<head>
</head>
<body>
  <applet width=1000 height=500 code="Lec3v1.class">
  <param name = x value = 50>
  <param name = y value = 50>
  <param name = w value = 50>
  <param name = h value = 50>
  </applet>
</body>
</html> 
*/