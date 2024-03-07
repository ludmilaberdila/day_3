Feature: verify admin is able to create a student


  @adminTest1
  Scenario: verify admin can create one student
    Given admin is logged in to the system
    When admin goes to students page
    Then admin click on create new student button
    And admin creates a student
    Then verify student is created

  @adminTest@
  Scenario: verify admin can create multiple students
    Given admin is logged in to the system
    When admin goes to students page
    Then admin click on create new student button
    And admin creates 2 students
    Then verify 2 students are created

