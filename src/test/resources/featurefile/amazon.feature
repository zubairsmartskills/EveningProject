@amazon
Feature: To validate search function 

Background:
Given To user launch edge browser and pass valid url 

Scenario: To validate search function

When To user enter valid product name
		      #With Header 2D Map
		      
		       |samsung   |iphone   |moto|
		       |samsung23 |iphone 15|moto 40|
		       |samsung 24|iphone 16|moto 50|
		       |samsung 25|iphone 17|moto 60|
		       
		       
Then To user Click search  button 
And To user quit edge browser


