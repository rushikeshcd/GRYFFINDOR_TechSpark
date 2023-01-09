# GRYFFINDOR_TechSpark


Company A wants a web application for its employees which solve the shipping status problem. Company 
A dispatches a product for home delivery. They want to track the status of delivery. There should be a way for 
Courier Agent to update the status of delivery. Only three Status are required : Product Dispatched, Product In 
Route ,Product Delivered.
It requires two frontend one for employees to track the status and other for agent to update the status 
Employee Frontend:
Employee should insert address and details of product for dispatch and also select the agent(Store a list 
of agents in DB) and other page should show the list of product dispatched and if employee click on the 
product it should show the delivery status on next page
Agent Frontend: 
Agent should get the list of products assigned to him/her for delivery. If agent is going to deliver the 
any product he/she should update the delivery status to "Product In Route" for the product and upon delivery to 
the customer agent should update the status to "Product Delivered" for that product.
