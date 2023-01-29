Feature: deletelead leaftaps functionality 

	driver.findElement(By.name("submitButton")).click();
		
Scenario Outline: Login with duplicate lead functionality 
	Given Click on 'Find Leads' link 
	And Click on 'Phone' text 
	And Enter the phone number as <phoneNumber> 
	And Click on 'Find Leads' text 
	And Click on partyId 
	And Click on 'Duplicate Lead' link 
	When Click on submit button 
	Then Lead should be displayed 
	
	Examples: 
		|phoneNumber|
		|'9'|
		|'99'|
		
	