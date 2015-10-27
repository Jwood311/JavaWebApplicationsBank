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
@WebServlet(name = "newCustomerServlet", urlPatterns = {"/newCustomerServlet"})
public class newCustomerServlet extends HttpServlet {

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
        

        //set redirect url's
        String passUrl = "success.html";
        String failUrl = "/new_customer.jsp";
        
        String message;
        
      //get posted parameters
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipCode= request.getParameter("zipCode");
        String email = request.getParameter("email");
        
        
        
        
        //compare login and determine redirect location
        if(!"".equals(firstName) && !"".equals(lastName) && !"".equals(phone) && !"".equals(address)
                && !"".equals(city) && !"".equals(state) && !"".equals(zipCode) 
                && !"".equals(email)){
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
