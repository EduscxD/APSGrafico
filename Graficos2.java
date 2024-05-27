package trabalho.apss;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graficos2 {

    public static void main(String[] args) {

        DefaultCategoryDataset barragrafico = new DefaultCategoryDataset();
        barragrafico.addValue(14, "Atingido", "Jan");
        barragrafico.addValue(13, "Meta", "Jan");
        barragrafico.addValue(16, "Atingido", "Fev");
        barragrafico.addValue(14, "Meta", "Fev"); 
        barragrafico.addValue(17, "Atingido", "Março");
        barragrafico.addValue(15, "Meta", "Março");
        barragrafico.addValue(18, "Atingido", "Abril");
        barragrafico.addValue(18, "Meta", "Abril");

        JFreeChart barChart = ChartFactory.createBarChart(
                "Metas de Prevenção da Poluição/Emissao de CO2", "Metas", "Valores",
                barragrafico);


        DefaultPieDataset dadosgraficopizza = new DefaultPieDataset();
        dadosgraficopizza.setValue("Estados Unidos", 17.58);
        dadosgraficopizza.setValue("Rússia", 13.33);
        dadosgraficopizza.setValue("Coreia do Sul", 12.61);
        dadosgraficopizza.setValue("Irã", 10.78);
        dadosgraficopizza.setValue("Japão", 8.96);
        dadosgraficopizza.setValue("China", 8.56);
        dadosgraficopizza.setValue("Indonésia", 7.24);
        dadosgraficopizza.setValue("União Europeia", 7.04);
        dadosgraficopizza.setValue("Brasil", 6.88);
        dadosgraficopizza.setValue("Índia", 2.46);


        JFreeChart pieChart = ChartFactory.createPieChart(
                "Prevenção da Poluição no mundo 2019 (Media Global)", dadosgraficopizza, true, true, false);
        
        
      
                

        JPanel panel = new JPanel(new GridLayout(1, 2));
        ChartPanel barChartPanel = new ChartPanel(barChart);
        ChartPanel pieChartPanel = new ChartPanel(pieChart);

        panel.add(barChartPanel);
        panel.add(pieChartPanel);

        JFrame frame = new JFrame("Barra e Pizza");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(panel);
        frame.setVisible(true);

        Timer timer;
        timer = new Timer(1000, new ActionListener() {
            int AtingidoJan = 0;
            int AtingidoFev = 0;
            int AtingidoMarco = 0;
            int AtingidoAbril = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
               if (AtingidoJan < 14){
                AtingidoJan++;
                barragrafico.setValue(AtingidoJan, "Atingido", "Jan");
                barChartPanel.repaint();
               }
                if (AtingidoFev < 16){
                AtingidoFev++;
                barragrafico.setValue(AtingidoFev, "Atingido", "Fev");
                barChartPanel.repaint();
            }
                if (AtingidoMarco < 17){
                AtingidoMarco++;
                barragrafico.setValue(AtingidoMarco, "Atingido", "Março");
                barChartPanel.repaint();
        }
                if (AtingidoAbril < 18){
                AtingidoAbril++;
                barragrafico.setValue(AtingidoAbril, "Atingido", "Abril");
                barChartPanel.repaint();
        }
            }
        });
        timer.start();
    }

    }

