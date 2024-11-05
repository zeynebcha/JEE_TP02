package test1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Vérifier si les identifiants sont corrects (ici, on teste avec "J2EE/J2EE")
        if ("J2EE".equals(username) && "J2EE".equals(password)) {
            // Si les identifiants sont corrects, rediriger vers un formulaire pour utiliser RedirectServlet
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            
            // Générer le formulaire pour rediriger l'utilisateur
            out.println("<html><body>");
            out.println("<h2>Choisissez une action de redirection</h2>");
            out.println("<form action='RedirectServlet' method='GET'>");
            out.println("<label for='action'>Action :</label>");
            out.println("<input type='text' id='action' name='action' required><br><br>");
            out.println("<label for='page'>URL de redirection :</label>");
            out.println("<input type='text' id='page' name='page' required><br><br>");
            out.println("<button type='submit'>Rediriger</button>");
            out.println("</form>");
            out.println("</body></html>");
        } else {
            // Si les identifiants sont incorrects, afficher un message d'erreur
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h2>Erreur : Identifiants incorrects.</h2>");
            out.println("<p>Veuillez réessayer.</p>");
            out.println("<a href='login.html'>Retour au formulaire de connexion</a>");
            out.println("</body></html>");
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
