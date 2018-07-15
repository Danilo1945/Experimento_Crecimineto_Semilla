package Controlador;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import static javafx.scene.input.KeyCode.J;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Danilo
 */
public class Grafica {

    private String TipoSensor;
    private String Nom_Grafica;
    public int contador = 0;
    public int posicion = 0; // para la pocicion del vector o lista
    JPanel pa;

    XYSeries Gra1 = new XYSeries("Experimento 1"); // serie de tipo lista o vector
    XYSeries Gra2 = new XYSeries("Experimento 2"); // serie de tipo lista o vector
    XYSeries Gra3 = new XYSeries("Experimento 3"); // serie de tipo lista o vector
    XYSeries Gra4 = new XYSeries("Experimento 4"); // serie de tipo lista o vector
    XYSeries Gra5 = new XYSeries("Experimento 5"); // serie de tipo lista o vector
    XYSeries Gra6 = new XYSeries("Experimento 6"); // serie de tipo lista o vector
    XYSeries Gra7 = new XYSeries("Experimento 7"); // serie de tipo lista o vector
    XYSeries Gra8 = new XYSeries("Experimento 8"); // serie de tipo lista o vector
    XYSeries Gra9 = new XYSeries("Experimento 9"); // serie de tipo lista o vector
    XYSeries Gra10 = new XYSeries("Experimento 10"); // serie de tipo lista o vector

    public int incolor;

    XYSeriesCollection Coleccion = new XYSeriesCollection(); // coleccion a graficar de freechar

    JFreeChart grafica;   /// grafica de tipo freechar

//     constructor
    public Grafica(String tipoSensor, String nom_Grafica, int indicador) {

        this.TipoSensor = tipoSensor;
        this.Nom_Grafica = nom_Grafica;

        if (indicador == 1) {
            Coleccion.addSeries(Gra1);
            Gra1.add(0, 0);
            incolor = 1;
        }
        if (indicador == 2) {
            Coleccion.addSeries(Gra1);
            Coleccion.addSeries(Gra2);/////
            Gra1.add(0, 0);
            Gra2.add(0, 0);
            incolor = 2;

        }

        if (indicador == 3) {
            Coleccion.addSeries(Gra1);
            Coleccion.addSeries(Gra2);/////
            Coleccion.addSeries(Gra3);/////
            Gra1.add(0, 0);
            Gra2.add(0, 0);
            Gra3.add(0, 0);

        }
        if (indicador == 4) {
            Coleccion.addSeries(Gra1);
            Coleccion.addSeries(Gra2);/////
            Coleccion.addSeries(Gra3);/////
            Coleccion.addSeries(Gra4);/////
            Gra1.add(0, 0);
            Gra2.add(0, 0);
            Gra3.add(0, 0);
            Gra4.add(0, 0);

        }
        if (indicador == 5) {
            Coleccion.addSeries(Gra1);
            Coleccion.addSeries(Gra2);/////
            Coleccion.addSeries(Gra3);/////
            Coleccion.addSeries(Gra4);/////
            Coleccion.addSeries(Gra5);/////
            Gra1.add(0, 0);
            Gra2.add(0, 0);
            Gra3.add(0, 0);
            Gra4.add(0, 0);
            Gra5.add(0, 0);

        }
        if (indicador == 6) {
            Coleccion.addSeries(Gra1);
            Coleccion.addSeries(Gra2);/////
            Coleccion.addSeries(Gra3);/////
            Coleccion.addSeries(Gra4);/////
            Coleccion.addSeries(Gra5);/////
            Coleccion.addSeries(Gra6);/////
            Gra1.add(0, 0);
            Gra2.add(0, 0);
            Gra3.add(0, 0);
            Gra4.add(0, 0);
            Gra5.add(0, 0);
            Gra6.add(0, 6);

        }
        if (indicador == 7) {
            Coleccion.addSeries(Gra1);
            Coleccion.addSeries(Gra2);/////
            Coleccion.addSeries(Gra3);/////
            Coleccion.addSeries(Gra4);/////
            Coleccion.addSeries(Gra5);/////
            Coleccion.addSeries(Gra6);/////
            Coleccion.addSeries(Gra7);/////
            Gra1.add(0, 0);
            Gra2.add(0, 0);
            Gra3.add(0, 0);
            Gra4.add(0, 0);
            Gra5.add(0, 0);
            Gra6.add(0, 0);
            Gra6.add(0, 0);

        }

    }

    public void addgrafica(ArrayList<Integer> tiempo, ArrayList<Integer> peso) {

        for (int i = 0; i < tiempo.size(); i++) {
            Gra1.add(tiempo.get(i), peso.get(i));

        }

    }

    public void addgrafica2(ArrayList<Integer> tiempo, ArrayList<Integer> peso, ArrayList<Integer> tiempo2, ArrayList<Integer> peso2) {

        for (int i = 0; i <tiempo.size(); i++) {
            Gra1.add(tiempo.get(i), peso.get(i));
            Gra2.add(tiempo2.get(i), peso2.get(i));

        }

    }

    public void addgrafica3(ArrayList<Integer> tiempo, ArrayList<Integer> peso, ArrayList<Integer> tiempo2, ArrayList<Integer> peso2, ArrayList<Integer> tiempo3, ArrayList<Integer> peso3) {

        for (int i = 0; i < tiempo.size(); i++) {
            Gra1.add(tiempo.get(i), peso.get(i));
            Gra2.add(tiempo2.get(i), peso2.get(i));
            Gra3.add(tiempo3.get(i), peso3.get(i));

        }
    }

    public void addgrafica4(ArrayList<Integer> tiempo, ArrayList<Integer> peso, ArrayList<Integer> tiempo2, ArrayList<Integer> peso2, ArrayList<Integer> tiempo3, ArrayList<Integer> peso3, ArrayList<Integer> tiempo4, ArrayList<Integer> peso4) {

        for (int i = 0; i < tiempo.size(); i++) {
            Gra1.add(tiempo.get(i), peso.get(i));
            Gra2.add(tiempo2.get(i), peso2.get(i));
            Gra3.add(tiempo3.get(i), peso3.get(i));
            Gra4.add(tiempo4.get(i), peso4.get(i));

        }
    }

     public void addgrafica5(ArrayList<Integer> tiempo, ArrayList<Integer> peso, ArrayList<Integer> tiempo2, ArrayList<Integer> peso2, ArrayList<Integer> tiempo3, ArrayList<Integer> peso3, ArrayList<Integer> tiempo4, ArrayList<Integer> peso4, ArrayList<Integer> tiempo5, ArrayList<Integer> peso5) {

    
            for (int i = 0; i <tiempo.size(); i++) {
            Gra1.add(tiempo.get(i), peso.get(i));
            Gra2.add(tiempo2.get(i), peso2.get(i));
            Gra3.add(tiempo3.get(i), peso3.get(i));
            Gra4.add(tiempo4.get(i), peso4.get(i));
            Gra5.add(tiempo5.get(i), peso5.get(i));

        }
    

}

//      public  void addgrafica(int stt,int sta,int sht,int sha,int sph,int sl ,int cont){
//        
//                    this.contador=contador+1;
//                    Gra1.add(contador,stt); 
//                    Gra2.add(contador,sta ); 
//                    
//                    }
public void IniciarGraficaGeneral(JPanel panel_gra) {

        grafica = ChartFactory.createXYLineChart(Nom_Grafica, "TIEMPO", this.TipoSensor, Coleccion, PlotOrientation.VERTICAL, true, true, false);

        ChartPanel panel = new ChartPanel(grafica);
        JFrame ventana = new JFrame("GRAFICA GENERAL");

        XYPlot plot = grafica.getXYPlot();/// para poner las vertices
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();/// para poner las vertices
//          
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesPaint(1, Color.GREEN);
        renderer.setSeriesPaint(2, Color.YELLOW);
        renderer.setSeriesPaint(3, Color.BLUE);
        renderer.setSeriesPaint(4, Color.ORANGE);
        renderer.setSeriesPaint(5, Color.black);
        panel_gra.setLayout(new java.awt.BorderLayout());
        panel_gra.add(panel);
        panel_gra.validate();
//        ventana.getContentPane().add(panel);
//        ventana.setSize(3000, 3000);
//        ventana.pack();
//
//        ventana.setVisible(true);
        // ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
    }

    public void addgraficaDesdeLista(ArrayList<Float> tiempo, ArrayList<Float> peso, int num_muestras) {
        ArrayList<Float> t = new ArrayList();
        ArrayList<Float> p = new ArrayList();
        t = tiempo;
        p = peso;

        //JOptionPane.showMessageDialog(null, t.get(2));
        for (int i = 0; i <= num_muestras; i++) {
            Gra1.add(t.get(i), p.get(i));

        }
    }

    public void IniciarGraficaIndividual(JPanel panel_gra) {
        try {

            // AQUI LLAMAR  QUE GRAFICA ES
            grafica = ChartFactory.createXYLineChart("MASA VS TIEMPO", "TIEMPO", this.TipoSensor, Coleccion, PlotOrientation.VERTICAL, true, true, false);

            ChartPanel panel = new ChartPanel(grafica);

            //// INICIAMOS EL FORMULARIO
            JFrame ventana = new JFrame("GRAFICA DE " + this.Nom_Grafica);

            // pa.setBounds(34, 45, 33, 56);
            XYPlot plot = grafica.getXYPlot();/// para poner las vertices
            XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();/// para poner las vertices
//          

            if (incolor == 1) {
                renderer.setSeriesPaint(0, Color.RED);

            }
//               if(incolor==2){
//             renderer.setSeriesPaint(0, Color.GREEN);
//                
//               }
//              if (incolor==3){
//              renderer.setSeriesPaint(0, Color.YELLOW);// posi, color
//                
//              }
//              if (incolor==4){
//               renderer.setSeriesPaint(0, Color.BLUE);
//                 
//              }
//              if (incolor==5){ 
//             renderer.setSeriesPaint(0, Color.ORANGE);
//                
//              }
//              if(incolor==6){
//          renderer.setSeriesPaint(0, Color.black);
//              }
            panel_gra.setLayout(new java.awt.BorderLayout());
            panel_gra.add(panel);
            panel_gra.setSize(650,440);
            panel_gra.validate();

//            ventana.add(panel);
//            ventana.setSize(3000, 3000);
//            ventana.pack();
//            ventana.setVisible(true);
//          //  Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Imagenes/img1.png")); 
//            //ventana.setIconImage(icono);
//            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                
            // pan.removeAll();
//         
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex + "No se pudo graficar");// mensaje de notificacion
        }

    }

}
