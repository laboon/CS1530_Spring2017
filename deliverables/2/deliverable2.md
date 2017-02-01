## CS/COE 1530 - Software Engineering
### Spring Semester 2017

### DUE DATE: 15 FEB 2017

### Deliverable 2

For the second sprint, each group will start implementing user stories on top of the walking skeleton developed for the first sprint. You will also turn in several other reports - see the Format section, below.

NOTE: If I see nothing from you in the git commit history for a sprint in master, and you cannot explain and prove it (e.g., you focused on documentation this sprint with the agreement of your teammates, work was done in another branch but couldn't be merged to master, etc.), then you may get a 0 for the entire sprint.

### Format

For the second sprint, you will turn in:

1. A cover page, in the format described below
2. An approximately one or two page description of what was accomplished this sprint. This can (but is not limited to) cover details such as:
  1. How teams communicated
  1. What disagreements arose
  1. How problems were resolved
  1. Changes in process since first sprint
  1. Interactions with customer
  1. Challenges writing the code or tests
  1. Design patterns or architectural patterns used
  1. Anything else that might be of interest
3. User stories completed this sprint, along with their indicated number of story points and total velocity
4. A *link to the code on GitHub/GitLab*.  If I or the TA (Adam Hobaugh) cannot access it (that is, usernames laboon and greenmanspirit are not added as a collaborator), there is an automatic -15 point deduction. 
4. Details on why you decided on those user stories
5. A list of any defects found (by unit testing, manual testing, or by developers), and how they were discovered and fixed (or if not fixed, why you decided not to fix them this sprint). This can include defects found by unit testing or system testing by QA (or other methods, such as issues found by the customer). If no defects were found, then please write a paper on how you have developed a way to develop software without making any mistakes, because I would be happy to read it!

Each of these sections shall be CLEARLY MARKED (i.e. they should each have titles and start on their own page).

Remember that user stories are not to be marked as complete until they meet the DEFINITION OF DONE - that is, they have been developed, tested, and reviewed according to the plan laid out in the first deliverable.

Remember to use the 1-2-4-8-16 story point format, where 16 points is one developer working only on one story for a sprint.  

Remember that your main goal is to deliver a working version of the software (i.e., can be compiled and executed on any individual member's computer).  Think about that when planning and prioritizing!  During the in-class retrospective and sprint planning session, you can apportion responsibilities, agree on the story ordering, etc.

If I have any questions on the code, I may ask *any* individual member to show me the code running on their computer.  Therefore, if anyone has a problem running the current version of the code, that fact needs to be included as a defect.  Failure to have a working version of the project at end of sprint may mean a drastically lower score for the project.

#### Format for cover page:

The cover page should include:

1. The name of the project
1. The names of the people in the group, and their GitHub usernames
1. A link to the 
1. The date that it is due (15 FEB 2017)
1. The title "CS 1530 - SPRINT 2 DELIVERABLE"

### Grading

Group Grading:

1. Listing of Completed User Stories And Story Points: 15% of grade
1. Details of Why Those User Stories Were Chosen: 10% of grade
1. Description of Sprint: 10% of grade
1. Listing of Defects: 15% of grade
1. Code and Tests: 50% of grade
  a. Functionality: New game, pieces can move (even if not all legal moves/captures/etc. implemented), black/white take turns
  b. Code: All methods should be commented (with JavaDoc or similar)
  c. Tests: There are unit tests for any "computational" methods (i.e. those that do not display data to the screen)
  d. Code quality: Try to separate computation from display, good method/variable names, code is easy to understand, etc.


Yes, grammar and spelling count. Points will be deducted for more than one grammatical or spelling error per section.

Code should be well-tested; you don't need to do "official" TDD (although I recommend you do so when you can), but there should be good code coverage of common use cases for many, if not most, methods.

Defects should include at least the following information:

1. Reproduction Steps (or reference unit test or other test that caught failure)
1. Expected Behavior (What did you expect to happen?)
1. Observed Behavior (What did you actually see happen?)

### Other

Please feel free to email me at bill@billlaboon.com or come to office hours to discuss any problems you have.