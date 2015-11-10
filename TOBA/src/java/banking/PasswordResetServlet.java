package banking;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "PasswordResetServerlet", urlPatterns = {"/PasswordResetServerlet"})
public class PasswordResetServlet extends HttpServlet {

    //overide doPost to get posted info. from login.html
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //create/get session
        HttpSession session = request.getSession();

        //set redirect url's
        String passUrl = "account_activity.jsp";
        String failUrl = "/password_reset.jsp";
        
        String message;
        
      //get posted parameter
        String password = request.getParameter("password");
        
        
        //compare login and determine redirect location
        if(!"".equals(password)){
            //create new User object with inputs
            User user = (User) session.getAttribute("user");
            if (user == null){
                user = new User();
            }
            user.setPassword(password);
            //store user in session
            session.setAttribute("user", user);
            response.sendRedirect(passUrl);
            message = "";
                 

        } else{
            
            message = "Please fill out all the form fields.";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher(failUrl).forward(request, response);
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
