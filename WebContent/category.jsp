<jsp:include page="header.jsp" />
<jsp:include page="sidebar.jsp" />
<style>
 table{width:60%;}
 table th{padding:10px; font-weight:700;font-size:17px;text-align:center; background-color:#c0c0c0;}
 table td{padding:10px; font-weight:normal;font-size:14px;text-align:center; border-bottom:1px solid #c0c0c0;}
</style>
<div class="main-panel">
 <div style="padding:10px;">
   <h2>Category</h2>
   <div class="container">
       <div class="row">
           <div class="col-sm-12">
                <div><a href="AddCategory" style="background: #926ed3;color: #fff;padding: 10px;margin-bottom: 20px;display: table;border-radius: 4px;font-size: 15px;box-shadow: 2px 1px #251938;">Add New</a></div>
                <table>
                  <tr><th>ID</th><th>Name</th><th>Actions</th></tr>
                  <%= request.getAttribute("cats") %>
                </table>
           </div>
       </div>
   </div>
 </div>
</div>
<jsp:include page="footer.jsp" />