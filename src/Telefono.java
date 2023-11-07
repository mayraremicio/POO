import javax.swing.*;

public class Telefono {


    String color;
    String Ram;
    String camara;

    public static void main(String[] args) {

        Telefono Telefono1=new Telefono();

        Telefono1.color="negro";
        Telefono1.Ram="4 GB";
        Telefono1.camara="48 M";

        Telefono Telefono2=new Telefono();

        Telefono2.color=" azul";
        Telefono2.Ram=" 12 GB";
        Telefono2.camara="12 M ";

        Telefono Telefono3=new Telefono();

        Telefono3.color="gris";
        Telefono3.Ram=" 16 GB";
        Telefono3.camara="50 M ";



        JOptionPane.showMessageDialog(null,"DATOS TELEFONO 1 \n"+" color "+Telefono1.color + "Ram"+Telefono1.Ram+"camara"+Telefono1.camara);
        JOptionPane.showMessageDialog(null,"DATOS TELEFONO 2\n"+"color "+Telefono2.color+"Ram"+ Telefono2.Ram+"camara "+Telefono2.camara);
        JOptionPane.showMessageDialog(null,"DATOS TELEFONO 3 \n"+" color "+Telefono3.color + "Ram"+Telefono3.Ram+"camara"+Telefono3.camara);
    }
}