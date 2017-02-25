var app = angular.module('myApp',['ngResource']);

  
app.factory('Customer', ['$resource', function ($resource) {
    return $resource('http://localhost:8080/brokerpoint/customers/:customerId', {customerId: '@customerId'},
	{
		updateCustomer: {method: 'PUT'}
	}
    );
}]);


app.controller('CustomerController', ['$scope', 'Customer', function($scope, Customer){
	var self = this;
	//created empty customer list
	self.customers=[];
	
	// Customer object created
	self.customer = new Customer();
	
	// 
	self.fetchAllCustomers = function(){
		self.customers= Customer.query();
	};
	
	self.fetchAllCustomers();
	
	self.addCustomer = function(){
		console.log('Inside save');
		if($scope.customerForm.$valid) {
		  self.$save(function(customer){
		     console.log(customer); 
		     self.flag= 'created';	
		     self.reset();	
		     self.fetchAllCustomers();
		  },
		  function(err){
		     console.log(err.status);
		     ob.flag='failed';
		  }
	          );
	        }
	    };
	    
	self.reset = function(){
	    	self.customer = new Customer();
	        $scope.customerForm.$setPristine();
	    };		    
	
	
}]);
