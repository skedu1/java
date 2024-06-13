package file;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
 
@WebServlet("/download")
public class Download extends HttpServlet {
 
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
 
        PrintWriter out = response.getWriter();
        String textFileName = "newfile.txt";
        String textFilePath = "C:\\download.txt" ;
 
        response.setContentType("text/plain");
        response.setHeader("Content-Disposition", "attachment; filename=\"" + textFileName + "\"");
 
        FileInputStream inputStream = new FileInputStream(textFilePath);
 
        int in;
        while ((in = inputStream.read()) != -1) {
            out.write(in);
        }
        inputStream.close();
        out.close();
    }
}