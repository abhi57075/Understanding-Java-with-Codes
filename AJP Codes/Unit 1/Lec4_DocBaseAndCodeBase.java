import java.awt.*;
import java.applet.*;
import java.net.*;

public class Lec4_DocBaseAndCodeBase extends Applet{
    public void paint(Graphics g){
        String msg;

        URL url = getCodeBase(); // file:/h:/java/
        msg = "Code base: " + url.toString();
        g.drawString(msg, 10, 20);

        url = getDocumentBase(); // file:/h:/java/Lec4_DocBaseAndCodeBase
        msg = "Document base: " + url.toString();
        g.drawString(msg, 10, 40);
    }
}

/*
<html>
<head>
</head>
<body>
  <applet width=300 height=300 code="Lec4_DocBaseAndCodeBase.class">
  </applet>
</body>
</html>
 */

/* 
Often we will create applets that will need to explicitly load media and text.
Java will allow the applet to load data from the directory holding the html file that started the applet(the document base)
and the directory from which the applets class file was loaded(the code base)
These directories are returned as URL objects.
 */