package test1;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Handles GET requests and displays a welcome message.
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Setting response content type
        response.setContentType("text/html");

        // Getting the current time
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        // Writing response
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello World, this is my first servlet</h1>");
        out.println("<p>Current server time: " + formattedTime + "</p>");
        out.println("</body></html>");
    }
}

/**
 * Servlet implementation class RedirectServlet
 * Redirects users to a specified URL based on request parameters.
 */

