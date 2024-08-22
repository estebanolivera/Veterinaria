/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Aerolinea;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Esteban
 */
public class AerolineaDAO {
    public void guardar(Aerolinea aerolinea){
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            FileWriter archivo = new FileWriter("aerolinea.txt", true);
            PrintWriter pw = new PrintWriter(archivo);
            
            pw.println(aerolinea.getCodigo() +"|"+ aerolinea.getNombreAerolinea() +"|"+ aerolinea.getAntiguedad() +"|"+ aerolinea.getDireccionAerolinea());
            pw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public ArrayList<Aerolinea> obtener(){
    ArrayList<Aerolinea> lstAerolinea = new ArrayList();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Scanner scanner = new Scanner(System.in);
        try {
            FileReader archivo = new FileReader("aerolinea.txt");
            BufferedReader br = new BufferedReader(archivo);
            
            String linea;
            while((linea = br.readLine())    != null ){
            StringTokenizer st = new StringTokenizer(linea,  "|");
            
            String codigo = st.nextToken();
            String nombreAerolinea = st.nextToken();
            int antiguedad = scanner.nextInt();
            String direccionAerolinea = st.nextToken();
            
            Aerolinea aerolinea = new Aerolinea()
            
            }
        } catch (Exception e) {
        }
    }
    
}
