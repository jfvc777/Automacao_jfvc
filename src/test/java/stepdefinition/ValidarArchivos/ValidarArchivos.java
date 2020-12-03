package stepdefinition.ValidarArchivos;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

/**
 * @author Juan Castillo
 * @since 30/11/2020
 */
public class ValidarArchivos {

    public String direccionArchivo;
    public String tipoArchivo;
    public String nomeArchivo;
    public String nomeHoja = "";


    public void leerArchivo(String direccionArchivo, String nomeArchivo, String tipoArchivo, String nomeHoja) {

        String direccionCompleta = direccionArchivo + nomeArchivo + "." + tipoArchivo;
        System.out.printf("Informe el nombre del archivo:\n");
        System.out.println(direccionCompleta);

        System.out.printf("\nContenido del archivo:\n");
        switch (tipoArchivo) {
            case "txt":
            case "csv":
                try {
                    FileReader arq = new FileReader(direccionCompleta);
                    BufferedReader leerArq = new BufferedReader(arq);

                    String linea = leerArq.readLine();

                    while (linea != null) {
                        System.out.printf("%s\n", linea);
                        linea = leerArq.readLine();
                    }
                    arq.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    System.err.printf("Erro na abertura do arquivo: %s.\n",
                            e.getMessage());
                }
                System.out.println();
                break;
            case "xls":
                try (FileInputStream file = new FileInputStream(new File(direccionCompleta))) {

                    //leer archivo
                    HSSFWorkbook workbook = new HSSFWorkbook(file);
                    //obtener hoja
                    HSSFSheet sheet = workbook.getSheetAt(0);

                    //Obtener filas
                    Iterator<Row> rowIterator = sheet.iterator();
                    Row row;

                    //se recorre cada fila hasta el final
                    while (rowIterator.hasNext()) {
                        row = rowIterator.next();
                        //se obtiene celdas por fila
                        Iterator<Cell> cellIterator = row.cellIterator();
                        Cell cell;
                        //se recorre cada celda
                        while (cellIterator.hasNext()) {
                            //se obitene la celda en especifico
                            cell = cellIterator.next();

                            DataFormatter formatter = new DataFormatter();
                            String strValue = formatter.formatCellValue(cell);

                            System.out.println(strValue + " | ");
                        }
                        System.out.println();
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "xlsx":
                try (FileInputStream file = new FileInputStream(new File(direccionCompleta))) {

                    //leer archivo
                    XSSFWorkbook workbook = new XSSFWorkbook(file);
                    //obtener hoja
                    XSSFSheet sheet = workbook.getSheetAt(0);

                    //Obtener filas
                    Iterator<Row> rowIterator = sheet.iterator();
                    Row row;

                    //se recorre cada fila hasta el final
                    while (rowIterator.hasNext()) {
                        row = rowIterator.next();
                        //se obtiene celdas por fila
                        Iterator<Cell> cellIterator = row.cellIterator();
                        Cell cell;
                        //se recorre cada celda
                        while (cellIterator.hasNext()) {
                            //se obitene la celda en especifico
                            cell = cellIterator.next();

                            DataFormatter formatter = new DataFormatter();
                            String strValue = formatter.formatCellValue(cell);

                            System.out.println(strValue + " | ");
                        }
                        System.out.println();
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                break;
        }


    }



}
