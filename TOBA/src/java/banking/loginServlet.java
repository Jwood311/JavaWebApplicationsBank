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
@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    //overide doPost to get posted info. from login.html
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //set log in creditials
        String USERNAME = "jsmith@toba.com";
        String PASSWORD = "letmein";
        //set redirect url's
        String passUrl = "account_activity.html";
        String failUrl = "login_failure.html";
        
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
