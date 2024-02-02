@regression
Feature: Testing different request on the virgin application

  Scenario Outline: : Verify the response contains pots with selected currency
    When I sends a GET request to get the pots with "<currency>"
    Then I must get back a valid status code 200
    Examples:
      | currency |
      | GBP      |
      | SEK      |
      | EUR      |

  Scenario Outline: : Verify the pot 'id' associated with the correct 'name'
    When I sends a GET request to get the pots with "<currency>"
    Then I send "<id>" to find corresponding "<name>"
    Examples:
      | currency | id                 | name                           |
      | GBP      | caribbeanstudpoker | play-caribbean-stud-poker      |
      | SEK      | SIDE_BET           | play-classic-video-poker       |
      | EUR      | progressive_id1    | play-around-the-reels-jackpot |