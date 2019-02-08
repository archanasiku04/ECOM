
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.hcl.service.*" import="com.hcl.entity.*"%>
<jsp:include page="header.jsp" />
<jsp:include page="sidebar.jsp" />
<style>
input[type="text"], textarea {
    width: 370px;
    padding: 10px;
    border-radius: 3px;
    border: 1px solid #926ed3;
}
label{font-weight:700;}
</style>
<div class="main-panel">
 <div style="padding:10px;">
   <h2>Edit Category</h2>
   <div class="container">
       <div class="row">
           <div class="col-sm-12">
            <%= request.getAttribute("msg") %>
            <% int id=Integer.parseInt(request.getParameter("categoryId")); %>
               <form action="RemoveCategory" method="post">
               <div style="margin-bottom: 20px;"><label>Category Id</label><div><input type="text" name="id" value="<%=id %> "readonly></div></div>
				
                <div style="margin-bottom: 20px;"><input type="submit" value="Delete" style="background: #926ed3;color: #fff;padding: 10px;margin-bottom: 20px;    border: none;width: 90px;display: table;border-radius: 4px;font-size: 15px;box-shadow: 2px 1px #251938;" /></div>
               </form>
           </div>
       </div>
   </div>
 </div>
</div>
<jsp:include page="footer.jsp" />

