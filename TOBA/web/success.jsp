<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />
                <h2>Success!</h2>
            </header><br><br>
            <div id="success">
                <p>Your account has been successfully created! <br><br><br>
                First Name: ${user.firstName}<br><br>
                Last Name: ${user.lastName}<br><br>
                Phone Number: ${user.phone}<br><br>
                Address: ${user.address}<br><br>
                City: ${user.city}<br><br>
                State: ${user.state}<br><br>
                Zip Code: ${user.zipCode}<br><br>
                Email: ${user.email}<br><br>
                User Name: ${user.userName}<br><br>
                Password: ${user.password}<br><br>
              </p>
            </div>
        </div>
    </body>
<c:import url="footer.jsp" />