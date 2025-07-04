package servlets.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.user.User;
import service.user.UserServiceImpl;

/**
 * Servlet implementation class AddUserSrv
 */
@WebServlet("/add-user")
public class AddUserSrv extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/views/user/add-user.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String rePassword = request.getParameter("re-password");
        String mobile = request.getParameter("mobile");
        String address = request.getParameter("address");
        String NIC = request.getParameter("NIC");
        String role = request.getParameter("role");
        
        // Validate if the mobile number contains exactly 10 digits
        if (!mobile.matches("\\d{10}")) {
            String alert = "Mobile number must be exactly 10 digits";
            request.setAttribute("alert", alert);
            getServletContext().getRequestDispatcher("/WEB-INF/views/user/add-user.jsp").forward(request, response);
            return;
        }

        // Check if passwords are matching
        if (password.equals(rePassword)) {
            User user = new User(fname, lname, email, password, mobile, address, NIC, role);
            
            UserServiceImpl usimp = new UserServiceImpl();
            usimp.addUser(user);
            
            response.sendRedirect("/login");
        } else {
            String alert = "Passwords don't match";
            request.setAttribute("alert", alert);
            getServletContext().getRequestDispatcher("/WEB-INF/views/user/add-user.jsp").forward(request, response);
        }
    }
}
