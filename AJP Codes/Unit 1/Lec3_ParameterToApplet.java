import java.awt.*;
import java.applet.*;

public class Lec3_ParameterToApplet extends Applet{
    String s;
    Font f1;
    public void init(){
        resize(400,400);
        s = getParameter("string");
        if (s == null){
           s = "Java";
        }
        else{
            s = "Hello "+ s;
        }
        f1 = new Font("Aerial",Font.BOLD,36);
    }
    public void paint(Graphics g){
        g.setFont(f1);
        g.drawString(s,10,10);
    }
}

/*
<html>
    <head>
    </head>
<body>
  <applet width=1000 height=500 code="Lec1v1.class">
  <param name = string value = Abhishek>
  </applet>
</body>
</html> 
 */