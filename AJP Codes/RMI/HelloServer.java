import java.rmi.*;
import java.io.*;

public class HelloServer{
    public static void main(String args[]){
        try{
            Hello robj = new Hello ("Hello World"); // rmiregistry
            Naming.rebind("Hello",robj);
            System.out.println("Server is ready");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}