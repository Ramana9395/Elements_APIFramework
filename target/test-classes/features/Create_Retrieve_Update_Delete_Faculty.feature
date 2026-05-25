Feature: Validating Faculty API's 

@AddFaculty @Smoke
Scenario Outline: verify if add faculty is being successfully added using AddFacultyAPI 
	Given Add Faculty Payload with "<fname>" "<lname>" "<mname>"
	When user calls "AddFacultyAPI" with "POST" http request
	Then the API call is success with status code 200
#	And verify faculty_Id created maps to "<name>" using "getFacultyId"
Examples:
   |fname  |lname  |mname  |
   |First Faculty|lastone|middleone|
#   |firsttwo|lasttwo|middletwo|
#  |firstthree|lastthree|middlethree|

@DeleteFaculty @Regression
Scenario: Verify Delete Faculty functionality 
	Given verify delete the created faculty
	When user calls "deleteFacultyAPI" with "DELETE" http request
	Then the API call is success with status code 200
	
