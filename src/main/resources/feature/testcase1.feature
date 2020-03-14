Feature: taskmanager
@tc01_a_login_1
Scenario: Login to the TaskManager website

Given launch the browser
When open TaskManager website
Then enter Username and Password 
And  click on Login button

@tc02_b_addedittask_2
Scenario: Add/Edit task in the TaskManager website

Given Launch the website in a browser
When Open TaskManager website and click on Add Task
Then Enter Required Fields
Then Select Start Date
Then Select Finish Date
And click  on Add button

@tc03_c_searchlogin_3
Scenario: Search task in the TaskManager website

Given open the browser
When access TaskManager website and click on Task List
Then Search for the tasks
And click on Search button

@tc04_d_print_4
Scenario:  Print task in the TaskManager website

Given Open the browser
When Access TaskManager website
Then open the tasks
And print the tasks