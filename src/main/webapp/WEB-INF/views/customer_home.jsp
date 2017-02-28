<%@ page language="java" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en-US">
  <head>
    <meta charset="UTF-8" /> 
    <title> Spring MVC 4 REST + AngularJS </title>
  </head>
  <body ng-app="myApp">
  
   <div ng-controller="CustomerController as customerCtrl">
       <h1> Customer Registration Form - BrokerPoint </h1>
	<form name="customerForm" method="POST">
	    <table>
		<tr><td colspan="2">
		  <div ng-if="customerCtrl.flag != 'edit'">
		     <h3> Add New Customer </h3> 
		  </div>
		  <div ng-if="customerCtrl.flag == 'edit'">
		     <h3> Update Customer for ID: {{ customerCtrl.customer.customerId }} </h3> 
		  </div> </td>
		</tr>
		<tr>
		      <td>First Name: </td> <td><input type="text" name="fname" "customerCtrl.customer.fname" required/> 
         	      <span ng-show="customerForm.fname.$error.required" class="msg-val">First Name is required.</span> </td>
		</tr>
		<tr>
		      <td>Last Name: </td> <td><input type="text" name="lname" "customerCtrl.customer.lname" required/> 
         	      <span ng-show="customerForm.fname.$error.required" class="msg-val">Last Name is required.</span> </td>
		</tr>
		<tr>
		      <td>Email : </td> <td><input type="text" name="email" "customerCtrl.customer.email" required/> 
         	      <span ng-show="customerForm.fname.$error.required" class="msg-val">Email Name is required.</span> </td>
		</tr>
		
		<tr>
		     <td colspan="2"> <span ng-if="customerCtrl.flag=='created'" class="msg-success">Customer successfully added.</span>
		     <span ng-ifcustomerCtrlrl.flag=='failed'" class="msg-val">Customer already exists.</span> </td>
		</tr>
	        <tr><td colspan="2">
	            <div ng-if="customerCtrl.flag != 'edit'">
		       <input  type="submit" ng-click="customerCtrl.addPerson()" value="Add Person"/> 
		       <input type="button" ng-click="customerCtrl.reset()" value="Reset"/>
		    </div>
		    <div ng-if="customerCtrl.flag == 'edit'">
		       <input  type="submit" ng-click="customerCtrl.updatePersonDetail()" value="Update Person"/> 	
			   <input type="button" ng-click="customerCtrl.cancelUpdate()" value="Cancel"/>				   
		    </div> </td>
		</tr>
		<tr>
		     <td colspan="2"> <span ng-if="customerCtrl.flag=='deleted'" class="msg-success">Person successfully deleted.</span>
		</tr>
	    </table>     
	</form>
        <table>
	      <tr><th>ID </th> <th>Name</th> <th>Location</th></tr>
	      <tr ng-repeat="row in customerCtrl.customers">
	         <td><span ng-bind="row.customerId"></span></td>
	         <td><span ng-bind="row.fname"></span></td>
	         <td><span ng-bind="row.lname"></span></td>
	         <td>
		    <input type="button" ng-click="customerCtrl.deletePerson(row.pid)" value="Delete"/>
		    <input type="button" ng-click="customerCtrl.editPerson(row.pid)" value="Edit"/>
		    <span ng-if="customerCtrl.flag=='updated' && row.pid==customerCtrl.updatedId" class="msg-success">Person successfully updated.</span> </td> 
	      </tr>	
	</table>
	</div>
    <script src="${pageContext.request.contextPath}/app-resources/js/lib/angular.min.js"></script>
    
    <script src="${pageContext.request.contextPath}/app-resources/js/lib/angular-resource.min.js"></script>
	<script src="${pageContext.request.contextPath}/app-resources/js/app.js"></script>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/app-resources/css/style.css"/>
 </body>
</html>   