## CS/COE 1530 - Software Engineering
### Spring Semester 2017

### DUE DATE: 15 MAR 2017

### Deliverable 4 

For the fourth sprint, we will perform a _hardening sprint_.   That is, you will work to increase code quality and/or fill in any functionality that you may have missed earlier.  You will also turn in several other reports - see the Format section, below.

Unlike other sprints, this sprint is individually graded.  I want you to examine the code yourself, determine something which needs to be fixed, and fix it.  This could be a lack of comments or tests, an edge case that was not considered, improved usability or functionality, a known defect, or anything else that you see that could be improved.

Please ensure that you discuss what you will be doing with your group partners before doing it!  You should use your normal sprint planning time to determine who will be working on what.

Since this is a short sprint, I will not expect the same amount of work as in a normal sprint. 

### Format

For the fourth sprint, you will turn in:

1. A cover page, in the format described below
2. An approximately 1/2 to 1 page description of what was accomplished this sprint, and why. This can (but is not limited to) cover details such as:
  1. How teams communicated
  1. What disagreements arose
  1. How problems were resolved
  1. Changes in process since first sprint
  1. Interactions with customer
  1. Challenges writing the code or tests
  1. Design patterns or architectural patterns used
  1. Anything else that might be of interest
4. A *link to the code on GitHub/GitLab*.  If I or the TA cannot access it (that is, usernames `laboon` and `mBarrenSQA` are not added as a collaborator), there is an automatic -15 point deduction. 

Remember that your main goal is to deliver a working version of the software (i.e., can be compiled and executed on any individual member's computer).  Think about that when planning and prioritizing!  During the in-class retrospective and sprint planning session, you can apportion responsibilities, agree on the story ordering, etc.

If I have any questions on the code, I may ask *any* individual member to show me the code running on their computer.  Therefore, if anyone has a problem running the current version of the code, that fact needs to be included as a defect.  Failure to have a working version of the project at end of sprint may mean a drastically lower score for the project.

Code should not be merged to master without the approval of at least ONE other member of the team.  Please do this using pull requests and have the reviewer comment on the PR itself.  We will go over this in class.

#### Format for cover page:

The cover page should include:

1. The name of the group
1. The names of the people in the group, and their GitHub usernames
1. The name of the INDIVIDUAL turning it in
1. A link to the GitHub repository
1. The date that it is due (15 MAR 2017)
1. The title "CS 1530 - SPRINT 4 DELIVERABLE"

### Grading

Individual Grading:

1. Description of Sprint: 30% of grade
1. Code and Tests: 70% of grade
  1. Functionality
  1. Code: All methods should be commented (with JavaDoc or similar)
  1. Tests: There are unit tests for any "computational" methods (i.e. those that do not display data to the screen)
  1. Code quality: Try to separate computation from display, good method/variable names, code is easy to understand, etc.


Yes, grammar and spelling count. Points will be deducted for more than one grammatical or spelling error per section.

Code should be well-tested; you don't need to do "official" TDD (although I recommend you do so when you can), but there should be good code coverage of common use cases for any public methods.

If you cannot test something in an automated way, make sure you explain how you tested it manually.

### Other

Please feel free to email me or come to office hours to discuss any problems you have.