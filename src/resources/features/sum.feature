Feature: add two numbers

@autotest-1
Scenario Outline:

Given two numbers <a> and <b>
When the numbers are added
Then the sum should be <c>
Examples:
|a|b|c|
|2|1|3|
