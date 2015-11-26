<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="header.html" />
                <h2>Account Activity</h2>
                <c:choose>
                <c:when test="${user.userName != null}">
                    <p>Welcome ${user.firstName} ${user.lastName}.</p>
                    <p>Account Activity : ${account}</p>
                </c:when>
                    <c:otherwise>
                        <p>Not Logged In</p>
                    </c:otherwise>
                </c:choose>
            </header>
        </div>
    </body>
<c:import url="footer.jsp" />