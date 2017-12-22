package Controlador;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Image;
import java.awt.Toolkit;
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
    public int contador=0; 
    public int posicion=0; // para la pocicion del vector o lista
    JPanel pa;

    
    
     XYSeries Gra1=new XYSeries("MASA VS TIEMPO"); // serie de tipo lista o vector
     XYSeries Gra2=new XYSeries(" S.Tem.A"); // serie de tipo lista o vector
   
     public int incolor;
     
      
     XYSeriesCollection Coleccion=new XYSeriesCollection(); // coleccion a graficar de freechar
       
               
     JFreeChart grafica;   /// grafica de tipo freechar
     
     
     
     
     
//     constructor
    public Grafica(String tipoSensor, String nom_Grafica, int indicador) { 
        
        this.TipoSensor = tipoSensor;
        this.Nom_Grafica = nom_Grafica;
 
        
        
                 Gra1.add(0, 0);
                 Gra2.add(0, 0);
                 
                 
                 
                 
                  if (indicador==1){
               Coleccion.addSeries(Gra1);
               incolor=1;
               }
               if(indicador==2){
               Coleccion.addSeries(Gra2);/////
               incolor=2;
               }
             
               if(indicador==7){
                Coleccion.addSeries(Gra1);
               Coleccion.addSeries(Gra2);/////
               
              }        
                   
    }

  
   
    
//      public  void addgrafica(int stt,int sta,int sht,int sha,int sph,int sl ,int cont){
//        
//                    this.contador=contador+1;
//                    Gra1.add(contador,stt); 
//                    Gra2.add(contador,sta ); 
//                    
//                    }
      
     public void IniciarGraficaGeneral(){
              
                grafica=ChartFactory.createXYLineChart(TipoSensor,"XX", this.TipoSensor, Coleccion, PlotOrientation.VERTICAL, true, true,false);
        
                ChartPanel panel= new  ChartPanel(grafica);
                   JFrame ventana = new JFrame("GRAFICA DE "+this.Nom_Grafica);

                   XYPlot plot = grafica.getXYPlot();/// para poner las vertices
                   XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();/// para poner las vertices
//          
                 renderer.setSeriesPaint(0, Color.RED);
                 renderer.setSeriesPaint(1, Color.GREEN);
                 renderer.setSeriesPaint(2, Color.YELLOW);
                 renderer.setSeriesPaint(3, Color.BLUE);
                 renderer.setSeriesPaint(4, Color.ORANGE);
                 renderer.setSeriesPaint(5, Color.black);
               ventana.getContentPane().add(panel);
               ventana.setSize(3000, 3000);
               ventana.pack();

               ventana.setVisible(true);

      // ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
     }    
         
      
   public  void addgraficaDesdeLista(int tiempo[],int peso[]){
                    for(int i=0;i<tiempo.length;i++){
                     Gra1.add(tiempo[i],peso[i]); 
                    
                    }
    }
   


  
   public void IniciarGraficaIndividual(){
              try{
       
       
                                                        // AQUI LLAMAR  QUE GRAFICA ES
                grafica=ChartFactory.createXYLineChart("MASA VS TIEMPO","TIEMPO", this.TipoSensor, Coleccion, PlotOrientation.VERTICAL, true, true,false);
        
                ChartPanel panel= new  ChartPanel(grafica);
                
                //// INICIAMOS EL FORMULARIO
                JFrame ventana = new JFrame("GRAFICA DE "+this.Nom_Grafica);
            //JPanel p= new JPanel();
                   XYPlot plot = grafica.getXYPlot();/// para poner las vertices
                   XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();/// para poner las vertices
//          

                if (incolor==1){
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

               ventana.add(panel);
               ventana.setSize(3000, 3000);
               ventana.pack();
               ventana.setVisible(true);
//          //  Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Imagenes/img1.png")); 
//            //ventana.setIconImage(icono);
//            ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);                
        // pan.removeAll();
       
    
//         pan.add(panel2);
//         
//         pan.setSize(300,300);
//         pan.setEnabled(true);
//        pan.setVisible(true);
        // pan.validate();
       
         
                    
                    
   }
              catch(Exception ex){
                   JOptionPane.showMessageDialog(null,ex);// mensaje de notificacion
              }
    
    
   }
   
    
    
    
}
