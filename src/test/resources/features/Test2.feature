#Author:

Feature: I as an automation analyst
  I need to consume the services of https://demoqa.com/automation-practice-form and
  http://automationpractice.com/index.php


  Scenario Outline: the customer wants to enter the form data
    Given 'customer' want enter the data in the form
    When enter the requested information
      | Name   | LastName   | Email   | Gender   | Mobile   | Date Birth   | Subjects   | Hobbies   | NameFile   | Current   | State   | City   |
      | <Name> | <LastName> | <Email> | <Gender> | <Mobile> | <Date Birth> | <Subjects> | <Hobbies> | <NameFile> | <Current> | <State> | <City> |
    Then should see the message 'Thanks for submitting the form'
    Examples:
      | Name  | LastName | Email            | Gender | Mobile     | Date Birth | Subjects | Hobbies | NameFile   | Current            | State | City  |
      | Pedro | Jimenez  | pejome@gmail.com | Male   | 0123456789 | 28 November     | Biology  | Music   | <nameFile> | Envigado,Antioquia | NCR   | Noida |
