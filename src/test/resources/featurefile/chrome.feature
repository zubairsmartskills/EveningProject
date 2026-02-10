@fb
Feature: To invalidate Login functionality

@smoke
Scenario: To validate login with invalid username and invalid password

Given To user launch browser and pass url
When To user enter invalid username and invalid password
Then To user Click login  button

@regression @sanity
Scenario: To validate login with valid username and valid password

Given To user launch browser and pass url
When To user enter valid username and valid password
Then To user Click login  button