import java.awt.*;
import java.applet.*;

public class Lec1v1 extends Applet{
    String msg;
    public void init(){
        resize(500,500);
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg = "Inside init -- ";
    }
    public void start(){
        msg += "Inside start -- ";
    }
    public void paint(Graphics g){
        msg += "Inside paint";
        g.drawString(msg,10,10);
    }
    public void stop(){

    }
    public void destroy(){

    }
}

/*
<html>
    <head>
    </head>
    <body>
        <applet code = "Lec1v1.class" width = 300 height = 300>
        </applet>
    </body>
</html>
 */