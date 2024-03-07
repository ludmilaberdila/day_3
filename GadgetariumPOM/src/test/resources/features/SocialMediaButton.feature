Feature: User should be able to go to Gadgetarium social media
  pages by clicked on social media buttons on main page

  Background:
    Given user is on "https://www.gadgetarium.us/" page

    @facebook
  Scenario: Verify user is able to go to facebook page
    When user clicks  on facebook button
    Then verify the url is "https://www.facebook.com/"

      @instagram
      Scenario: Verify user is able to go to facebook page
        When user clicks  on facebook button
        Then verify the url is "https://www.instagram.com/peaksoft.house/"
