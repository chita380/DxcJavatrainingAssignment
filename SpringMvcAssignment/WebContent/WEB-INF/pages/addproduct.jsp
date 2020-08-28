<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<H1>Welcome to JioMart.com</H1>
	<br>

	<a href="viewproducts">View Products</a>
	<a href="addproduct">Add Product</a>
	<a href="delproduct">Delete Product</a>


		<h1>Add New Product</h1>
       <form:form method="post" action="save">  
      	<table >  
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Price :</td>  
          <td><form:input path="price" /></td>
         </tr> 
         <tr>  
          <td>Discription :</td>  
          <td><form:input path="discription" /></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
