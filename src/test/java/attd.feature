Feature: Calculator
Scenario Outline: ATDD
Given user enter an <expr>
Then result should be <result>

Examples:
|expr          |result  |
|"1,2,3,+,-"   |"-4"	|
|"2,3,4,*,-"   |"-10"	|
|"2,8,4,/,+"   |"4"		|
|"20,2,5,*,/"  |"2"		|
|"4,4,%"	   |"0"|