Feature: editlead leaftaps functionality 

Scenario Outline: Login with edit lead functionality 
	Given Click on 'Find Leads' link 
	And Click on 'Phone' text 
	And Enter the phone number as <phoneNum> 
	And Click on 'Find Leads' text 
	And Click on partyId 
	And Click on 'Edit' link 
	And Enter the edit lead company name as <companyName> 
	When Click on submit button 
	Then Lead should be displayed 
	
	Examples: 
		|phoneNum|companyName|
		|'9'|'TCS'|
		|'9'|'CTS'|