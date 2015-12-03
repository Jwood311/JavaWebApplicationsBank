package banking;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Josh
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    
    //overide doPost to get posted info. from login.html
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //set log in creditials
        String USERNAME = "jsmith@toba.com";
        String PASSWORD = "letmein";
        //set redirect url's
        String passUrl = "account_activity.jsp";
        String failUrl = "login_failure.jsp";
        
      //get posted parameters
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        
        
        //compare login and determine redirect location
        if(userName.equals(USERNAME) && password.equals(PASSWORD) ){
                    response.sendRedirect(passUrl);

        } else{
            response.sendRedirect(failUrl);

        }
    }
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
