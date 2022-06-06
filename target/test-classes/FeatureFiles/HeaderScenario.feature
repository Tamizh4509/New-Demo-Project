@Smoke
Feature: Checking for DemoQa website

  Background: User is in homepage
    Given User have a url
    When user enter a url in Headerpage
    Then user verified the url is launched

    Scenario: User Click a Element Header and get the value
      When user click a Element button
      And user get the text of Element
      Then user is verified in element text

      Scenario: User Click a Forms Header and get the value
        When user click a Forms button
        And user get the text of Forms
        Then user is verified in forms text

        Scenario: User Click a Alerts,Frames and Windows Header and get the value
          When user click a Alerts,Frames and Windows Button
          And user get the text of Alerts,Frames and windows
          Then user is verified in Alerts,Frames,Windows text

          Scenario: User Click a Widgets and get the value
            When user click the Widgets button
            And user get the text of widgets
            Then user is verified in Widget text

            Scenario: User Click the Interactions and get the value
              When user click a Interactions button
              And user get the text of Interactions
              Then user is verified in Interaction text

              Scenario: User click a Book store Application and get the value
                When user click a Book store application button
                And user get the text of Book store Application
                Then user is verified in BookStore text