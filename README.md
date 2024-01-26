Develop a backend service designed to empower Kirana stores in managing their
transaction registers. This service aims to facilitate the daily tracking of all credit and debit
transactions, providing a comprehensive solution for effective financial record-keeping.
# Online Kirana-Store

## Backend Services built on Spring Boot with MySQL to empower Kirana stores in managing their transaction registers.
This service aims to facilitate the daily tracking of all credit and debit
transactions, providing a comprehensive solution for effective financial record-keeping.

Users


## Microservices for Grocery Store



## Endpoints:

Base URI : /nexcorp/api/v1

To register user:

	Method: POST
	ServiceURI: /users
	Request Body:
		- first_name
		- last_name
		- email_id
		- gender
		- username
		- password
		- phone_number
		- address 1
		- address 2
		- town/city
		- state
	
	Response
		- registration_id
		- isRegistrationSuccess - boolean
		- createdBy
		- createdTimestamp
		
To update user's registration details:

	Method: POST
	ServiceURI: /users
	Request Body:
		- first_name
		- last_name
		- email_id
		- gender
		- username
		- password
		- phone_number
		- address 1
		- address 2
		- town/city
		- state
	
	Response
		- registration_id
		- isRegistrationSuccess - boolean
		- createdBy
		- createdTimestamp
	
To Get a user details:

	Method: GET
	ServiceURI: /users/{username}
		
	Response
		- first_name
		- last_name
		- email_id
		- gender
		- username
		- phone_number
		- address 1
		- address 2
		- town/city
		- state

To Get all users:

	Method: GET
	ServiceURI: /users
		
	Response
		- first_name
		- last_name
		- email_id
		- gender
		- username
		- phone_number
		- address 1
		- address 2
		- town/city
		- state

To Get user's contact:

	Method: GET
	ServiceURI: /users/contacts?username=clay
		
	Response
		- phone_number

CustomerLoginService
