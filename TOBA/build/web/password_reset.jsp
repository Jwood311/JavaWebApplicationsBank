<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />
                <h2>Reset your password</h2>
            </header>
            <div id="loginArea">
                <form id="reset" method="post" action="PasswordResetServlet">
                    
                    <label for="password">Password: </label>
                    <input type="password" name="password" placeholder="${user.password}" id="password"><br><br>
                    <button type="submit">Submit</button>
                    
                </form>
                    <span id="newCust"><a href="new_customer.html">Don't have an account yet? Create one here!</a></span><br><br>
            </div><!-- end #loginArea -->
        </div>
    </body>
<c:import url="footer.jsp" />

