@fb
Feature: To validate Login functionality


@sanity
Scenario Outline:To validate login with username and password

Given To user launch edge browser and pass valid url 
When To user enter  "<username>" and  "<password>"
Then To user Click login  button 
And To user quit edge browser


Examples:
		|username|password|
		
		|demo|demo@123|
		|java|java@124|