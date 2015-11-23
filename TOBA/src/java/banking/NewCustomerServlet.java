package banking;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Josh
 */
@WebServlet(name = "NewCustomerServlet", urlPatterns = {"/NewCustomerServlet"})
public class NewCustomerServlet extends HttpServlet {

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
        //create/get session
        HttpSession session = request.getSession();

        //set redirect url's
        String passUrl = "success.jsp";
        String failUrl = "/new_customer.jsp";
        
        String message;
        
      //get posted parameters
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String state = request.getParameter("state");
        String zipCode = request.getParameter("zipCode");
        String email = request.getParameter("email");
        
        
        
        
        //compare login and determine redirect location
        if(!"".equals(firstName) && !"".equals(lastName) && !"".equals(phone) && !"".equals(address)
                && !"".equals(city) && !"".equals(state) && !"".equals(zipCode) 
                && !"".equals(email)){
            //create new User object with inputs
            User user = new User(firstName, lastName, phone, address, city, state, zipCode, email, lastName + zipCode, "welcome1");
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
