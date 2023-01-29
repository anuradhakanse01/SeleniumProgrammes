Feature: createlead leaftaps functionality 

Scenario Outline: Login with Create lead functionality 
	Given Click on 'Create Lead' link 
	And Enter the company name as <companyName> 
	And Enter the firstName as <firstName> 
	And Enter the lastName as <lastName> 
	When Click on submit button 
	Then Lead should be displayed 
	
	Examples: 
		|companyName|firstName|lastName|
		|'Amazon'|'Rose'|'William'|
		|'Flipkart'|'Roy'|'Mathew'|
		
		
		
		
	