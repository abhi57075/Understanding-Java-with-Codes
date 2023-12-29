import java.awt.*; // import java.awt.Graphics;
import java.applet.*; // import java.applet.Applet;

public class Lec1_BasicAppletCode extends Applet{
    public void init(){
        resize(400,400);
        setBackground(Color.red);
    }
    public void start(){

    }
    public void paint(Graphics g){
        g.drawString("This is the applet Window", 50, 100);
        // the first is the text string to be drawn, 
        // the second is the x-coordinate of the starting position of the text string, 
        // and the third is the y-coordinate of the starting position of the text string.
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
  <applet width=300 height=300 code="Lec1_BasicAppletCode.class">
  </applet>
</body>
</html>
 */
