import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Hardcoded user validation (for demo purposes)
        if ("admin".equals(username) && "password123".equals(password)) {
            // Valid login: Redirect to a welcome page (or home)
            response.sendRedirect("welcome.jsp");
        } else {
            // Invalid login: Redirect back to login page with error
            response.sendRedirect("login.jsp?error=true");
        }
    }
}

