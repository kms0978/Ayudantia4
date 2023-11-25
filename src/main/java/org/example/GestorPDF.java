package org.example;
import java.io.IOException;
import java.util.List;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

class GestorPDF {
    // Método para generar un archivo PDF con los datos de todos los préstamos
    public void generarPDFPrestamos(List<Prestamo> prestamos, String rutaArchivo) {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);
            PDPageTree pages = document.getPages();
            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                contentStream.beginText();
                contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
                contentStream.newLineAtOffset(100, 700);
                // Agregar contenido al PDF
                contentStream.showText("Lista de Préstamos:");
                int yOffset = 680;
                for (Prestamo prestamo : prestamos) {
                    yOffset -= 20;
                    contentStream.newLineAtOffset(0, -20);
                    contentStream.showText("Libro: " + prestamo.getLibro().getTitulo());
                    contentStream.newLineAtOffset(0, -15);
                    contentStream.showText("Usuario: " + prestamo.getUsuario().getNombre());
                    contentStream.newLineAtOffset(0, -15);
                    contentStream.showText("Bibliotecario: " + prestamo.getBiliotecario().getNombre());
                    // Puedes agregar más información según tus necesidades
                }
                contentStream.endText();
            }
            document.save(rutaArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
