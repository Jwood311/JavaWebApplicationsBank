<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />
                <h2>New Customer</h2>
            </header>
            <div id="newCustArea">
                <form name="newCustomer" method="post" action="newCustomerServlet">
                    <p>${message}</p>
                    <label for="fisrtName">First Name: </label>
                        <input type="text" name="firstName" id="firstName"><br>
                    <label for="lastName">Last Name: </label>
                        <input type="text" name="lastName" id="lastName"><br>
                    <label for="phone">Phone Number: </label>
                        <input type="tel" name="phone" id="phone"><br>
                    <label for="address">Address: </label>
                        <input type="text" name="address" id="address"><br>
                        <label for="city">City: </label>
                        <input type="text" name="city" id="city"><br>
                    <label for="state">State: </label>
                        <input type="text" name="state" id="state"><br>
                    <label for="zipCode">Zip Code: </label>
                        <input type="text" name="zipCode" id="zipCode"><br>
                    <label for="email">Email: </label>
                        <input type="email" name="email" id="email"><br>
                    <button type="submit">Submit</button>
                </form> 
            </div>
        </div>
    </body>
<c:import url="footer.jsp" />

