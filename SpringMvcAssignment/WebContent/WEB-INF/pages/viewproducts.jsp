    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
	<H1>Welcome to JioMart.com</H1>
	<br>

	<a href="viewproducts">View Products</a>
	<a href="addproduct">Add Product</a>
	<a href="delproduct">Delete Product</a>


	<h1>View Product List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>Name</th><th>Price</th><th>Discription</th></tr>
    <c:forEach var="product" items="${list}"> 
    <tr>
    <td>${product.id}</td><td>${product.name}</td><td>${product.price}</td><td>${product.discription}</td>
    </tr>
    </c:forEach>
    </table>