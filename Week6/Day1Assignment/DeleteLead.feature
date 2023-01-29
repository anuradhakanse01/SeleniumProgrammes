Feature: deletelead leaftaps functionality 

Scenario Outline: Login with delete lead functionality 
	Given Click on 'Find Leads' link 
	And Click on 'Phone' text 
	And Enter the phone number as <phoneNumber> 
	And Click on 'Find Leads' text 
	And Get FirstLeadID 
	And Click on partyId 
	And Click on 'Delete' link 
	And Click on 'Find Leads' link 
	And Enter the LeadID 
	When Click on 'Find Leads' text 
	Then Lead should be deleted 
	
	Examples: 
		|phoneNumber|
		|'9'|
		|'99'|
