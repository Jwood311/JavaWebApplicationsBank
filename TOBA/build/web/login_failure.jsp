<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />
                <h2>Login</h2>
            </header>
            <div id="loginArea">
                <form id="login" method="post" action="loginServlet">
                    <p>Your login information was incorrect</p>
                    <label for="userName">Username: </label>
                    <input type="text" name="userName" id="userName"><br><br>
                    
                    <label for="password">Password: </label>
                    <input type="password" name="password" id="password"><br><br>
                    <button type="submit">Submit</button>
                    
                </form>
                <span id="newCust"><a href="new_customer.html">Don't have an account yet? Create one here!</a></span><br>
                <a href="password_reset.jsp">Reset your password</a><br><br>
            </div><!-- end #loginArea -->
        </div>
    </body>
<c:import url="footer.jsp" />