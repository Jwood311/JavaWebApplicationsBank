<!DOCTYPE html>
<html>
    <head>
        <title>Banking Application | New Customer</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link type="style/text" rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div id="container">
            <header>
                <nav>
                    <h1>First Bank of Clearwater</h1>
                    <ul>
                        <li><a href="index.html">Home</a></li>
                        <li><a href="transaction.html">Transaction</a></li>
                        <li><a href="account_activity.html">Account</a></li>
                        <li><a href="new_customer.html">New Customer</a></li>
                        <li><a href="login.html">Login</a></li>
                        </ul>
                </nav>
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
</html>

