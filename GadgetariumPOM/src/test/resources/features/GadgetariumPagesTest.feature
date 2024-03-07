Feature: user should be able to go to all Gadgetarium pages

  @verifyPageUrls
  Scenario Outline: when user navigates to a page in Gadgetarium, the url must change
     Given user is on "https://www.gadgetarium.us/" page
     When user clicks on "<pageName>" page
     Then verify the url is "<pageUrl>"

    Examples:

    | pageName | pageUrl|
    | About Store | https://www.gadgetarium.us/about |
    | Delivery    | https://www.gadgetarium.us/delivery |
    | FAQ         | https://www.gadgetarium.us/fag      |
    | Contacts    | https://www.gadgetarium.us/contacts |


@printUrlTitle
  Scenario Outline: verify dfferent websites urls and title
    Given user is on "<url>" page
    Then print webpage title
    Then print webpage url

  Examples:
  | url |
  | https://www.google.com/ |
  | https://www.amazon.com/ |
  | https://www.linkedin.com/ |

